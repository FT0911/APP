package service.dev_user;

import org.apache.ibatis.annotations.Param;

import pojo.Dev_user;

public interface Dev_userService {
	/**
	 * 查询用户是否存在
	 * @param name
	 * @param pwd
	 * @return
	 */
	Dev_user getLoginUser(@Param("devCode") String devCode,@Param("pwd") String pwd);

}
