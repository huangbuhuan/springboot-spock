package me.buhuan.springbootspock.controller;

import me.buhuan.springbootspock.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
