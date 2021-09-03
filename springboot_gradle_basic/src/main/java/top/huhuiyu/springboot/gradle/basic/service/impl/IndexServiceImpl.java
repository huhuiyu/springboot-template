package top.huhuiyu.springboot.gradle.basic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.huhuiyu.springboot.gradle.basic.dao.UtilsDAO;
import top.huhuiyu.springboot.gradle.basic.message.IndexMessage;
import top.huhuiyu.springboot.gradle.basic.model.IndexModel;
import top.huhuiyu.springboot.gradle.basic.service.IndexService;

/**
 * 首页服务实现
 * 
 * @author 胡辉煜
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IndexServiceImpl implements IndexService {
  @Autowired
  private UtilsDAO utilsDAO;

  @Override
  public IndexMessage index(IndexModel model) throws Exception {
    IndexMessage result = new IndexMessage();
    result.setTime(utilsDAO.queryTime());
    result.setTimestamp(utilsDAO.queryTimestamp());
    result.setSuccessInfo(model.getEcho());
    return result;
  }
}