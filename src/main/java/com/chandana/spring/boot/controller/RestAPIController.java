package com.chandana.spring.boot.controller;

import com.chandana.spring.boot.Hello;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestAPIController {


    @ApiOperation(value = "getGreeting", notes = "get greeting", nickname = "getGreeting")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Server error"),
            @ApiResponse(code = 404, message = "Service not found"),
            @ApiResponse(code = 200, message = "Successful retrieval",
                         response = String.class)})
    @RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
    public String sayHello() {
        return "Swagger Hello World";
    }

    @ApiOperation(value = "sayHelloUser", notes = "Say hello to greeting", nickname = "sayHelloUser")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Server error"),
            @ApiResponse(code = 404, message = "Service not found"),
            @ApiResponse(code = 200, message = "Successful retrieval",
                         response = Hello.class)})
    @RequestMapping(method = RequestMethod.GET, value = "/api/hello/{name}", produces = {"application/json"})
    public Hello sayHelloUser(@ApiParam(value = "testId",
                                        required = true, defaultValue = "111") @PathVariable("name")
                              final String name) {
        Hello hello = new Hello();
        hello.setName(name);
        hello.setTest("sdfsdafsdf fsdfasdfasf");
        return hello;
    }


    @ApiOperation(value = "sayHelloListUser", notes = "Say hello list greeting", nickname = "sayHelloListUser")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "Server error"),
            @ApiResponse(code = 404, message = "Service not found"),
            @ApiResponse(code = 200, message = "Successful retrieval",
                         response = Hello.class, responseContainer = "List")})
    @RequestMapping(method = RequestMethod.GET, value = "/api/list/{name}", produces = {"application/json"})
    public List<Hello> sayHelloListUser(@ApiParam(value = "testId",
                                        required = true, defaultValue = "111") @PathVariable("name")
                              final String name) {
        List<Hello> list = new ArrayList<>();
        Hello hello = new Hello();
        hello.setName(name);
        hello.setTest("sdfsdafsdf fsdfasdfasf");
        list.add(hello);
        return list;
    }
}
