package top.huhuiyu.springboot.gradle.basic.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import top.huhuiyu.springboot.gradle.basic.entity.TbDemo;

/**
 * tb_demo表的dao
 * 
 * @author 胡辉煜
 */
@Mapper
public interface TbDemoDAO {
  /**
   * 查询全部tb_demo
   * 
   * @param tbDemo 主键信息
   * 
   * @return tb_demo的信息
   * 
   * @throws Exception 处理发生异常
   */
  List<TbDemo> queryAll(TbDemo tbDemo) throws Exception;

  /**
   * 按照主键查询tb_demo
   *
   * @param tbDemo 主键信息
   * 
   * @return 主键查询tb_demo的结果
   * 
   * @throws Exception 处理发生异常
   */
  TbDemo queryByKey(TbDemo tbDemo) throws Exception;

  /**
   * 添加tb_demo信息
   *
   * @param tbDemo tbDemo信息
   * 
   * @return 添加tbDemo信息的结果
   * 
   * @throws Exception 处理发生异常
   */
  int add(TbDemo tbDemo) throws Exception;

  /**
   * 修改tb_demo信息
   *
   * @param tbDemo tbDemo信息
   * 
   * @return 修改tbDemo信息的结果
   * 
   * @throws Exception 处理发生异常
   */
  int update(TbDemo tbDemo) throws Exception;

  /**
   * 删除tb_demo信息
   *
   * @param tbDemo tbDemo信息
   * 
   * @return 删除tbDemo信息的结果
   * 
   * @throws Exception 处理发生异常
   */
  int delete(TbDemo tbDemo) throws Exception;

}