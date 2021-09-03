package top.huhuiyu.springboot.gradle.basic.message;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import top.huhuiyu.springboot.gradle.basic.base.BaseMessage;

/**
 * 首页应答对象
 * 
 * @author 胡辉煜
 */
@ApiModel(value = "IndexMessage", description = "首页应答信息")
public class IndexMessage extends BaseMessage {

  private static final long serialVersionUID = -8637414644357419331L;

  @ApiModelProperty(value = "系统时间")
  private Date time;
  @ApiModelProperty(value = "系统时间戳")
  private Long timestamp;

  public IndexMessage() {
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

}