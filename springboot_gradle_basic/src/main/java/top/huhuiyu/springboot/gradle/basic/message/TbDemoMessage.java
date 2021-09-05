package top.huhuiyu.springboot.gradle.basic.message;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import top.huhuiyu.springboot.gradle.basic.base.BaseMessage;
import top.huhuiyu.springboot.gradle.basic.base.PageBean;
import top.huhuiyu.springboot.gradle.basic.entity.TbDemo;
import top.huhuiyu.springboot.gradle.basic.utils.JsonUtils;

/**
 * TbDemo应答对象
 * 
 * @author 胡辉煜
 */
@ApiModel(value = "TbDemoMessage", description = "演示应答对象")
public class TbDemoMessage extends BaseMessage {

  private static final long serialVersionUID = 1745341890750443932L;

  @ApiModelProperty(value = "演示对象")
  private TbDemo tbDemo;
  @ApiModelProperty(value = "分页信息")
  private PageBean page;
  @ApiModelProperty(value = "查询结果")
  private List<TbDemo> list;

  public TbDemoMessage() {
  }

  public TbDemo getTbDemo() {
    return tbDemo;
  }

  public void setTbDemo(TbDemo tbDemo) {
    this.tbDemo = tbDemo;
  }

  public PageBean getPage() {
    return page;
  }

  public void setPage(PageBean page) {
    this.page = page;
  }

  public List<TbDemo> getList() {
    return list;
  }

  public void setList(List<TbDemo> list) {
    this.list = list;
  }

  @Override
  public String toString() {
    try {
      return JsonUtils.stringify(this);
    } catch (Exception ex) {
      return null;
    }
  }
}