package top.huhuiyu.springboot.gradle.basic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import top.huhuiyu.springboot.gradle.basic.base.PageBean;
import top.huhuiyu.springboot.gradle.basic.dao.TbDemoDAO;
import top.huhuiyu.springboot.gradle.basic.entity.TbDemo;
import top.huhuiyu.springboot.gradle.basic.message.TbDemoMessage;
import top.huhuiyu.springboot.gradle.basic.model.TbDemoModel;
import top.huhuiyu.springboot.gradle.basic.service.TbDemoService;

/**
 * TbDemo的实现层
 * 
 * @author 胡辉煜
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TbDemoServiceImpl implements TbDemoService {
  @Autowired
  private TbDemoDAO tbDemoDAO;

  @Override
  public TbDemoMessage queryAll(TbDemoModel model) throws Exception {
    TbDemo tbDemo = model.getTbDemo();
    // like参数处理
    if (StringUtils.hasText(tbDemo.getDemoKey())) {
      tbDemo.setDemoKey(String.format("%%%s%%", tbDemo.getDemoKey()));
    }
    if (StringUtils.hasText(tbDemo.getDemoValue())) {
      tbDemo.setDemoValue(String.format("%%%s%%", tbDemo.getDemoValue()));
    }
    PageBean page = model.getPage();
    PageHelper.startPage(page.getPageNumber(), page.getPageSize());
    List<TbDemo> list = tbDemoDAO.queryAll(tbDemo);
    PageInfo<?> pageInfo = new PageInfo<>(list);
    page.setPageInfo(pageInfo);
    TbDemoMessage message = new TbDemoMessage();
    message.setSuccessInfo("");
    message.setPage(page);
    message.setList(list);
    return message;
  }

  @Override
  public TbDemoMessage queryByKey(TbDemoModel model) throws Exception {
    TbDemoMessage message = new TbDemoMessage();
    message.setSuccessInfo("");
    message.setTbDemo(tbDemoDAO.queryByKey(model.getTbDemo()));
    return message;
  }

  @Override
  public TbDemoMessage add(TbDemoModel model) throws Exception {
    TbDemoMessage message = new TbDemoMessage();
    int result = tbDemoDAO.add(model.getTbDemo());
    if (result == 1) {
      message.setSuccessInfo("添加数据成功");
    } else {
      message.setFailInfo("添加数据失败");
    }
    return message;
  }

  @Override
  public TbDemoMessage delete(TbDemoModel model) throws Exception {
    TbDemoMessage message = new TbDemoMessage();
    int result = tbDemoDAO.delete(model.getTbDemo());
    if (result == 1) {
      message.setSuccessInfo("删除数据成功");
    } else {
      message.setFailInfo("删除数据失败");
    }
    return message;
  }

  @Override
  public TbDemoMessage update(TbDemoModel model) throws Exception {
    TbDemoMessage message = new TbDemoMessage();
    int result = tbDemoDAO.update(model.getTbDemo());
    if (result == 1) {
      message.setSuccessInfo("修改数据成功");
    } else {
      message.setFailInfo("修改数据失败");
    }
    return message;
  }
}