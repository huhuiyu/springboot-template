package top.huhuiyu.springboot.gradle.basic.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

/**
 * tb_demo表
 * 
 * @author 胡辉煜
 */
@ApiModel(value = "TbDemo", description = "TbDemo")
public class TbDemo implements Serializable {

  private static final long serialVersionUID = -4311761713993667673L;

  @ApiModelProperty(value = "did")
  @ApiParam(hidden = true)
  private java.lang.Integer did;
  @ApiModelProperty(value = "demoKey")
  @ApiParam(hidden = true)
  private java.lang.String demoKey;
  @ApiModelProperty(value = "demoValue")
  @ApiParam(hidden = true)
  private java.lang.String demoValue;
  @ApiModelProperty(value = "lastupdate")
  @ApiParam(hidden = true)
  private java.util.Date lastupdate;

  public TbDemo() {
  }

  public java.lang.Integer getDid() {
    return did;
  }

  public void setDid(java.lang.Integer did) {
    this.did = did;
  }

  public java.lang.String getDemoKey() {
    return demoKey;
  }

  public void setDemoKey(java.lang.String demoKey) {
    this.demoKey = demoKey;
  }

  public java.lang.String getDemoValue() {
    return demoValue;
  }

  public void setDemoValue(java.lang.String demoValue) {
    this.demoValue = demoValue;
  }

  public java.util.Date getLastupdate() {
    return lastupdate;
  }

  public void setLastupdate(java.util.Date lastupdate) {
    this.lastupdate = lastupdate;
  }

}