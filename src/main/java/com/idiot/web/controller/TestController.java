package com.idiot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试 前端控制器
 * </p>
 *
 * @author guoweijie
 * @since 2021/1/13 下午11:18
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String runningTest() {
        return "==============spring web running==============";
    }
}
