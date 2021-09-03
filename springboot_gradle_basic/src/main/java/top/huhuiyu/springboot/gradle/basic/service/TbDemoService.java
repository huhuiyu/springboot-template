package top.huhuiyu.springboot.gradle.basic.service;

import top.huhuiyu.springboot.gradle.basic.message.TbDemoMessage;
import top.huhuiyu.springboot.gradle.basic.model.TbDemoModel;

/**
 * TbDemo的Service
 * 
 * @author 胡辉煜
 */
public interface TbDemoService {

  /**
   * 修改TbDemo信息
   * 
   * @param model 页面提交数据
   * 
   * @return 修改TbDemo信息的结果
   * 
   * @throws Exception 处理发生错误
   */
  TbDemoMessage update(TbDemoModel model) throws Exception;

  /**
   * 删除TbDemo信息
   * 
   * @param model 页面提交数据
   * 
   * @return 删除TbDemo信息的结果
   * 
   * @throws Exception 处理发生错误
   */
  TbDemoMessage delete(TbDemoModel model) throws Exception;

  /**
   * 添加TbDemo信息
   * 
   * @param model 页面提交数据
   * 
   * @return 添加TbDemo信息的结果
   * 
   * @throws Exception 处理发生错误
   */
  TbDemoMessage add(TbDemoModel model) throws Exception;

  /**
   * 按照主键查询TbDemo信息
   * 
   * @param model 页面提交数据
   * 
   * @return 主键查询TbDemo信息的结果
   * 
   * @throws Exception 处理发生错误
   */
  TbDemoMessage queryByKey(TbDemoModel model) throws Exception;

  /**
   * 分页查询TbDemo信息
   * 
   * @param model 页面提交数据
   * 
   * @return 分页查询TbDemo信息的结果
   * 
   * @throws Exception 处理发生错误
   */
  TbDemoMessage queryAll(TbDemoModel model) throws Exception;

}