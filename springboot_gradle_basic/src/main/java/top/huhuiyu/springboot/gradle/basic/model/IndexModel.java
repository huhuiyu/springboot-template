package top.huhuiyu.springboot.gradle.basic.model;

import java.io.Serializable;

import io.swagger.annotations.ApiParam;
import top.huhuiyu.springboot.gradle.basic.utils.JsonUtils;

/**
 * 首页model数据
 * 
 * @author 胡辉煜
 */
public class IndexModel implements Serializable {

  private static final long serialVersionUID = 4897019166486004209L;
  @ApiParam(hidden = true)
  private String echo;

  public IndexModel() {
  }

  public String getEcho() {
    return echo;
  }

  public void setEcho(String echo) {
    this.echo = echo;
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