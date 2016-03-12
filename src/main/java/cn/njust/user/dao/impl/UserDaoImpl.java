package cn.njust.user.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import cn.njust.bean.User;
import cn.njust.user.dao.UserDao;

@Repository("userDao")
@Scope("prototype")
public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
