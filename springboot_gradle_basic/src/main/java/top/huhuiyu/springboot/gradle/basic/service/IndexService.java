package top.huhuiyu.springboot.gradle.basic.service;

import top.huhuiyu.springboot.gradle.basic.message.IndexMessage;
import top.huhuiyu.springboot.gradle.basic.model.IndexModel;

/**
 * 首页服务
 * 
 * @author 胡辉煜
 */
public interface IndexService {

  /**
   * 首页
   * 
   * @param model 页面数据
   * 
   * @return 应答结果
   * 
   * @throws Exception 处理发生异常
   */
  IndexMessage index(IndexModel model) throws Exception;
}