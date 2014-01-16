package com.taobao.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taobao.dao.UserDao;
import com.taobao.entity.User;
import com.taobao.page.dialect.DataPage;



@Repository
public class UserDaoImpl implements UserDao {
	
	private final String IS_LOGIN = "isLogin";
	private final String FIND_USERLIST = "findUserList";
	private final String FIND_USERLIST_COUNT = "findUserListCount";
	private final String VIEW_PERSON = "viewPersonByMyself";
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	
//	@Override
//	public List<User> findUserList(PageParameter pageParameter
//			) {
//		RowBounds rowBounds = new RowBounds(pageParameter.getCurrentPage()-1,pageParameter.getPageSize());	//浠庣涓�潯寮�锛屽彇4鏉¤褰�
//		return sqlSessionTemplate.selectList(FIND_USERLIST, null, rowBounds);
//	}
	
	@Override
	public DataPage<User> listUsers(Integer pageNo, Integer pageSize) {
		RowBounds rowBounds = new RowBounds(pageNo,pageSize);	
		Map<String,Object> map = new HashMap<String, Object>();
		
		List<User> userList = sqlSessionTemplate.selectList(FIND_USERLIST, map, rowBounds);
		DataPage<User> userDP = new DataPage<User>();
		if(userList.size()>0){
			
			userDP.setPageSize(pageSize);
			userDP.setTotalCount(userList.size()); 
		}
		return null;
	}

	
	/**
	 * 判断用户登录
	 */
	@Override
	public boolean isLogin(String username, String password) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("username", username);
		map.put("password",password);
		if((Integer)sqlSessionTemplate.selectOne(IS_LOGIN,map) == 1){
			return true;
		}else{
			return false;
		}
	}

}
