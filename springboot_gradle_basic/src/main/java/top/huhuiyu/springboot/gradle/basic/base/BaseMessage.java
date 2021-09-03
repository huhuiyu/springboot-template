package top.huhuiyu.springboot.gradle.basic.base;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

/**
 * 基础应答对象
 * 
 * @author 胡辉煜
 *
 */
public class BaseMessage implements Serializable {

  private static final long serialVersionUID = -1553214759541076761L;

  public static final int OK = 200;
  public static final int ERROR = 500;

  /**
   * code:服务器应答代码，200为正确，500为错误，其它为自定义，默认500
   */
  @ApiModelProperty(value = "服务器应答代码")
  private int code = ERROR;
  /**
   * message：服务器应答信息，默认为空
   */
  @ApiModelProperty(value = "服务器应答信息")
  private String message = "";

  /**
   * success：服务器是否正确应答，默认为false
   */
  @ApiModelProperty(value = "服务器是否正确应答")
  private boolean success = false;

  /**
   * 服务器token信息
   */
  @ApiModelProperty(value = "用户认证令牌")
  private String token;

  public BaseMessage() {
  }

  /**
   * 设置标准的应答信息
   * 
   * @param success 是否成功应答
   * @param code    服务器应答code
   * @param message 服务器应答信息
   * 
   */
  public void setInfo(boolean success, int code, String message) {
    this.setCode(code);
    this.setSuccess(success);
    this.setMessage(message);
  }

  /**
   * 设置成功的应答信息
   * 
   * @param message 服务器应答信息
   * 
   */
  public void setSuccessInfo(String message) {
    this.setInfo(true, OK, message);
  }

  /**
   * 设置失败的应答信息
   * 
   * @param message 服务器应答信息
   * 
   */
  public void setFailInfo(String message) {
    this.setInfo(false, ERROR, message);
  }

  /**
   * 设置指定code的失败应答信息
   * 
   * @param code    服务器应答code
   * @param message 服务器应答信息
   * 
   */
  public void setFailInfo(int code, String message) {
    this.setInfo(false, ERROR, message);
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

}
