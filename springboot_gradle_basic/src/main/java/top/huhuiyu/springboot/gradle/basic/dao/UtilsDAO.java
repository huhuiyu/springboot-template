package top.huhuiyu.springboot.gradle.basic.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Mapper;

/**
 * 工具类dao
 * 
 * @author 胡辉煜
 */
@Mapper
public interface UtilsDAO {
  /**
   * 查询数据库当前时间
   * 
   * @return 数据库当前时间
   * 
   * @throws Exception 处理发生异常
   */
  Date queryTime() throws Exception;

  /**
   * 查询数据库当前时间戳
   * 
   * @return 数据库当前时间戳
   * 
   * @throws Exception 处理发生异常
   */
  Long queryTimestamp() throws Exception;

}