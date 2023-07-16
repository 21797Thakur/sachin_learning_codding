package com.medplus.insurance.dao;

import com.medplus.insurance.bean.UserRole;

public interface UserRoleDao {
public int createAccount(UserRole user);
public String checkUser(UserRole user);
}
