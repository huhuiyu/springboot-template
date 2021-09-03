package top.huhuiyu.springboot.gradle.basic.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import top.huhuiyu.springboot.gradle.basic.base.BaseMessage;

/**
 * controller层全局错误处理器 <br>
 * ControllerAdvice注解表示是控制器层拦截处理（aop-面向切面编程）<br>
 * ExceptionHandler注解表示方法为错误处理器，参数是错误的类型
 * 
 * @author 胡辉煜
 *
 */
@ControllerAdvice
@ResponseBody
public class MyExceptionHandler {

  private static final Logger log = LoggerFactory.getLogger(MyExceptionHandler.class);

  @ExceptionHandler(Exception.class)
  public BaseMessage handleException(Exception ex) {
    BaseMessage message = new BaseMessage();
    log.error("服务器发生错误：", ex);
    if (ex instanceof NoHandlerFoundException) {
      message.setFailInfo(404, "资源不存在");
      ;
      return message;
    }
    message.setFailInfo("服务器忙，请稍后重试！");
    return message;
  }

}