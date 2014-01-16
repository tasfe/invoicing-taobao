package com.taobao.dao;

import com.taobao.entity.User;
import com.taobao.page.dialect.DataPage;

/**
 * 
* @ClassName: UserDao 
* @Description: TODO(用户类dao层接口) 
* @author 梁剑
* @date 2014年1月16日 上午11:26:39 
*
 */
public interface UserDao {
	
	/**
	 * 
	* @Title: isLogin 
	* @Description: TODO(判断用户登录) 
	* @param @param username
	* @param @param password
	* @param @return    设定文件 
	* @return boolean    返回类型 
	* @throws
	 */
	boolean isLogin(String username,String password);
	
	DataPage<User> listUsers(Integer pageNo,Integer pageSize);
}
