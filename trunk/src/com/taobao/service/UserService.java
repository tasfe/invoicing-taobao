package com.taobao.service;

import com.taobao.entity.User;
import com.taobao.page.dialect.DataPage;

/**
 * 
* @ClassName: UserService 
* @Description: TODO(service服务层接口) 
* @author 梁剑
* @date 2014年1月16日 上午11:16:59 
*
 */
public interface UserService {
	
	/**
	 * 
	* @Title: isLogin 
	* @Description: TODO(验证用户登录) 
	* @param username
	* @param password
	* @return boolean    返回类型 
	* @throws
	 */
	boolean isLogin(String username,String password);
	
	DataPage<User> listUsers(Integer pageNo,Integer pageSize);
}
