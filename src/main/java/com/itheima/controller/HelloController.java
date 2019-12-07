package com.itheima.controller;


import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:sss
 * @Date:2019/12/5 20:19
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public String hello(){

        return "Hello,spring boot";
    }

    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id){
        return userService.queryById(id);
    }



    @GetMapping("/add")
    public void insertSelective(){
        User user = new User();
        user.setName("123");
        userService.saveUser(user);
    }

    @GetMapping("/delete")
    public void delete(long id){
        userService.delete(id);
    }

    @GetMapping("/update")
    public void update(){
        User user = new User();
        user.setId(14L);
        user.setName("zhangsan");
        userService.update(user);
    }
}
