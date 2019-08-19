package com.young.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.young.api.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Tornado Young
 * @date time 2019/8/19 22:40
 */
@Controller
public class TestController {

    @Reference
    UserService userService;

    @RequestMapping("getAddrs")
    @ResponseBody
    public List<String> getAddrs(){
        return userService.getAddrs(null);
    }
}
