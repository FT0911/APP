package service.dev_user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import pojo.Dev_user;

import dao.dev_user.Dev_userMapper;

@Service("dev_userService")
public class Dev_userServiceImpl implements Dev_userService {
	@Resource
	private Dev_userMapper dev_userMapper;

	@Override
	public Dev_user getLoginUser(String devCode, String pwd) {
		return dev_userMapper.getLoginUser(devCode, pwd);
	}
}
