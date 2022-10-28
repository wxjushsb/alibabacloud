package com.xxxx.seckill.controller;

import com.xxxx.seckill.vo.LoginVo;
import com.xxxx.seckill.vo.RespBean;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {
    @RequestMapping("/tologin")
    public String toLogin() {
        return "login";

    }
    @RequestMapping("/dologin")
    public RespBean dologin(LoginVo loginVo){
        System.out.println(loginVo);
        return null;

    }
}
