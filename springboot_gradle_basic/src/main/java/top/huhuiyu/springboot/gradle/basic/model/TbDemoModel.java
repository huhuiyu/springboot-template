package top.huhuiyu.springboot.gradle.basic.model;

import java.io.Serializable;

import io.swagger.annotations.ApiParam;
import top.huhuiyu.springboot.gradle.basic.base.PageBean;
import top.huhuiyu.springboot.gradle.basic.entity.TbDemo;

/**
 * TbDemo的Model
 * 
 * @author 胡辉煜
 */
public class TbDemoModel implements Serializable {

  private static final long serialVersionUID = -7223441093863774542L;

  @ApiParam(hidden = true)
  private TbDemo tbDemo=new TbDemo();
  @ApiParam(hidden = true)
  private PageBean page=new PageBean();
  
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

  /*
   * 所有参数模板
   * @ApiImplicitParam(name = "tbDemo.did", value = "描述：did", paramType = "query")
   * @ApiImplicitParam(name = "tbDemo.demoKey", value = "描述：demoKey", paramType = "query")
   * @ApiImplicitParam(name = "tbDemo.demoValue", value = "描述：demoValue", paramType = "query")
   * @ApiImplicitParam(name = "tbDemo.lastupdate", value = "描述：lastupdate", paramType = "query")
   */
}
