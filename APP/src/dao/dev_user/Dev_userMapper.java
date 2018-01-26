package dao.dev_user;

import org.apache.ibatis.annotations.Param;

import pojo.Dev_user;

public interface Dev_userMapper {
	/**
	 * 根据name和pwd获取用户记录
	 * @param name
	 * @param pwd
	 * @return
	 */
	Dev_user getLoginUser(@Param("devCode") String devCode,@Param("pwd") String pwd);
}
