package top.huhuiyu.springboot.gradle.basic.model;

import java.io.Serializable;

import io.swagger.annotations.ApiParam;
import top.huhuiyu.springboot.gradle.basic.base.PageBean;
import top.huhuiyu.springboot.gradle.basic.entity.TbDemo;
import top.huhuiyu.springboot.gradle.basic.utils.JsonUtils;

/**
 * TbDemo的Model
 * 
 * @author 胡辉煜
 */
public class TbDemoModel implements Serializable {

  private static final long serialVersionUID = -7223441093863774542L;

  @ApiParam(hidden = true)
  private TbDemo tbDemo = new TbDemo();
  @ApiParam(hidden = true)
  private PageBean page = new PageBean();

  public TbDemoModel() {
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

  @Override
  public String toString() {
    try {
      return JsonUtils.stringify(this);
    } catch (Exception ex) {
      return null;
    }
  }

}
