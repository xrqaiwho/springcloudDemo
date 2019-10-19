package com.itmuch.cloud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
@Api(value = "eureka-provider", description = "学生查询接口")
public class TestSwaggerController {

    @ApiOperation(value = "接口名称", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId", value = "orderId", required = true, dataType = "String", paramType
                    = "query"),
            @ApiImplicitParam(name = "amount", value = "amount", required = true, dataType = "Long", paramType
                    = "query")
    })
    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.GET )
    public String testSwagger(){

        return "aaaa";
    }
}
