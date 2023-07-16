package com.medplus.insurance.service;

import com.medplus.insurance.bean.UserRole;
import com.medplus.insurance.dao.UserRoleDao;
import com.medplus.insurance.dao.UserRoleDaoImpl;

public class UserRoleServiceImpl implements UserRoleService{
	UserRoleDao dao = new UserRoleDaoImpl();
	@Override
	public int createAccount(UserRole user) {
		int row =0;
		 row = dao.createAccount(user);
		return row;
	}
	@Override
	public String checkUser(UserRole user) {
		String role =dao.checkUser(user);
		return role;
	}

}
