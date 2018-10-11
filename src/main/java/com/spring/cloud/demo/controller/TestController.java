package com.spring.cloud.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvbaolin on 2018/10/11.
 */
@Api(value="/user", tags="test接口模块")
@RestController
public class TestController {


    @ApiOperation(value="test信息", notes = "test信息")
    @GetMapping("getTestInfo")
    @ResponseBody
    public  String getTestInfo(){
        return "test info !!!!";
    }
}
