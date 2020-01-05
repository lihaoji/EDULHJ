package com.edu.eduservice.controller;

import com.edu.entity.R;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihaoji
 * @create 2019-11-10 19:18
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @GetMapping("login")
    public R userLogin(){

        return R.ok().data("token","admin");

    }

    @GetMapping("info")
    public R info(){

        return R.ok().data("roles","[admin]").data("name","admin").data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
}
