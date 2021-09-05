package top.huhuiyu.springboot.gradle.basic.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import top.huhuiyu.springboot.gradle.basic.message.IndexMessage;
import top.huhuiyu.springboot.gradle.basic.model.IndexModel;
import top.huhuiyu.springboot.gradle.basic.model.TbDemoModel;
import top.huhuiyu.springboot.gradle.basic.service.IndexService;
import top.huhuiyu.springboot.gradle.basic.utils.IpUtils;
import top.huhuiyu.springboot.gradle.basic.utils.JsonUtils;

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

  @ApiOperation(value = "json参数模式请求")
  @ApiImplicitParam(name = "modelJson", value = "请求参数，格式为json：<br>{ tbDemo: {  demoKey: \"测试键\", demoValue: \"测试值\"}, page: {  pageNumber: 2,  pageSize: 10  } }")
  @PostMapping("/jsonparam")
  public TbDemoModel jsonparam(@RequestBody String modelJson) throws Exception {
    TbDemoModel model = JsonUtils.parse(modelJson, TbDemoModel.class);
    return model;
  }

  @ApiOperation(value = "客户端ip地址获取", notes = "返回的message就是客户端ip地址")
  @PostMapping("/ipinfo")
  public IndexMessage ipinfo(HttpServletRequest request) throws Exception {
    IndexMessage message = new IndexMessage();
    message.setSuccessInfo(IpUtils.getIpAddr(request));
    return message;
  }

}