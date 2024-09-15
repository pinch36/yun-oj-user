package com.yun.oj.user.controller.inner;

import com.yun.oj.service.client.service.UserFeignClient;
import com.yun.oj.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import yun.oj.model.model.entity.User;
import yun.oj.model.model.vo.UserVO;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户接口
 *

 */
@RestController
@RequestMapping("/inner")
@Slf4j
public class UserInnerController implements UserFeignClient {

    @Resource
    private UserService userService;

//    @Override
//    @PostMapping("/get")
//    public User getLoginUser(HttpServletRequest request) {
//        return userService.getLoginUser(request);
//    }

//    @Override
//    @PostMapping("/admin/request")
//    public boolean isAdmin(HttpServletRequest request) {
//        return userService.isAdmin(request);
//    }

//    @Override
//    @PostMapping("/admin/user")
//    public boolean isAdmin(@RequestBody User user) {
//        return userService.isAdmin(user);
//    }

    @Override
    @GetMapping("/get/id")
    public User getById(@RequestParam("userId") Long userId) {
        return userService.getById(userId);
    }

//    @Override
//    @PostMapping("/get/user_vo")
//    public UserVO getUserVO(@RequestBody User user) {
//        return userService.getUserVO(user);
//    }

}
