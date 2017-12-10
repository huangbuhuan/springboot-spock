package me.buhuan.springbootspock.controller;

import me.buhuan.springbootspock.bean.UserInfo;
import me.buhuan.springbootspock.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/10
 */
@RestController
@RequestMapping("user")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@GetMapping("/{userId}")
	public UserInfo findbyUserId(@PathVariable("userId") Long userId) {
		return userInfoService.findByUserId(userId);
	}
	
	@PostMapping
	public UserInfo save(UserInfo userInfo) {
		return userInfoService.save(userInfo);
	}
}
