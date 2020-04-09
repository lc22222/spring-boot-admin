package com.may.admin.controller;

import com.may.admin.entity.User;
import com.may.admin.service.TokenService;
import com.may.admin.service.UserService;
import com.may.admin.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    TokenService tokenService;

    @PostMapping("/login")
    public R login(@RequestBody User user){
        User userRes = userService.login(user);
        if (userRes == null){
            return R.error();
        }
        String token = tokenService.getToken(user);
        Map<String ,Object> res = new HashMap<>();
        res.put("token",token);
        return R.ok(res);
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        return "注册成功";
    }
}
