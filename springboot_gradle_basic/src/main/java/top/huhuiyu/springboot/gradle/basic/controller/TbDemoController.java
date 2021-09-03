package top.huhuiyu.springboot.gradle.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import top.huhuiyu.springboot.gradle.basic.message.TbDemoMessage;
import top.huhuiyu.springboot.gradle.basic.model.TbDemoModel;
import top.huhuiyu.springboot.gradle.basic.service.TbDemoService;

/**
 * TbDemo的控制器
 * 
 * @author 胡辉煜
 */
@Api(tags = { "演示控制器" })
@RestController
@RequestMapping("/demo")
public class TbDemoController {

  @Autowired
  private TbDemoService tbDemoService;

  @ApiOperation(value = "查询全部")
  @ApiImplicitParams({ @ApiImplicitParam(name = "tbDemo.demoKey", value = "演示键模糊查询", paramType = "query"), @ApiImplicitParam(name = "tbDemo.demoValue", value = "演示值模糊查询", paramType = "query"),
      @ApiImplicitParam(name = "page.pageNumber", value = "分页页码", paramType = "query"), @ApiImplicitParam(name = "page.pageSize", value = "分页大小", paramType = "query") })
  @PostMapping("/queryAll")
  public TbDemoMessage queryAll(TbDemoModel model) throws Exception {
    return tbDemoService.queryAll(model);
  }

  @ApiOperation(value = "添加")
  @ApiImplicitParams({ @ApiImplicitParam(name = "tbDemo.demoKey", value = "演示键", paramType = "query", required = true),
      @ApiImplicitParam(name = "tbDemo.demoValue", value = "演示值", paramType = "query", required = true) })
  @PostMapping("/add")
  public TbDemoMessage add(TbDemoModel model) throws Exception {
    return tbDemoService.add(model);
  }

  @ApiOperation(value = "修改")
  @ApiImplicitParams({ @ApiImplicitParam(name = "tbDemo.did", value = "主键", paramType = "query", required = true),
      @ApiImplicitParam(name = "tbDemo.demoKey", value = "演示键", paramType = "query", required = true),
      @ApiImplicitParam(name = "tbDemo.demoValue", value = "演示值", paramType = "query", required = true) })
  @PostMapping("/update")
  public TbDemoMessage update(TbDemoModel model) throws Exception {
    return tbDemoService.update(model);
  }

  @ApiOperation(value = "删除")
  @ApiImplicitParams({ @ApiImplicitParam(name = "tbDemo.did", value = "主键", paramType = "query", required = true) })
  @PostMapping("/delete")
  public TbDemoMessage delete(TbDemoModel model) throws Exception {
    return tbDemoService.delete(model);
  }

  @ApiOperation(value = "主键查询")
  @ApiImplicitParams({ @ApiImplicitParam(name = "tbDemo.did", value = "主键", paramType = "query", required = true) })
  @PostMapping("/queryByKey")
  public TbDemoMessage queryByKey(TbDemoModel model) throws Exception {
    return tbDemoService.queryByKey(model);
  }

}