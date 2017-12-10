package me.buhuan.springbootspock.service;

import me.buhuan.springbootspock.dao.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/10
 */
@Service
public class UserInfoService {
	
	@Autowired
	private UserInfoRepository userInfoRepository;
}
