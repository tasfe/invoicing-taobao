package com.taobao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taobao.dao.UserDao;
import com.taobao.entity.User;
import com.taobao.page.dialect.DataPage;
import com.taobao.service.UserService;

/**
 * 
* @ClassName: UserServiceImpl 
* @Description: TODO(service实现类所有的注入采用自动注入的方式) 
* @author 梁剑
* @date 2014年1月16日 上午11:25:17 
*
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	//此处注入dao
	@Autowired
	UserDao userDao;
	
	@Override
	public boolean isLogin(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public DataPage<User> listUsers(Integer pageNo, Integer pageSize) {
		return userDao.listUsers(pageNo, pageSize);
	}

	

}
