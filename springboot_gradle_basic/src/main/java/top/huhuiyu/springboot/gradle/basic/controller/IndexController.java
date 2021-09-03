package top.huhuiyu.springboot.gradle.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import top.huhuiyu.springboot.gradle.basic.message.IndexMessage;
import top.huhuiyu.springboot.gradle.basic.model.IndexModel;
import top.huhuiyu.springboot.gradle.basic.service.IndexService;

/**
 * 首页
 * 
 * @author 胡辉煜
 */
@Api(tags = { "首页" })
@RestController
public class IndexController {
  @Autowired
  private IndexService indexService;

  @ApiOperation(value = "首页，回声应答")
  @ApiImplicitParams(@ApiImplicitParam(name = "echo", value = "回声参数，内容会通过应答的message返回", paramType = "query"))
  @PostMapping("")
  public IndexMessage index(IndexModel model) throws Exception {
    return indexService.index(model);
  }

}