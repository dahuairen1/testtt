package com.abc.user.service;


import com.abc.user.pojo.User;

import java.util.List;

public interface UserService {

    List<User> getList(int page,int rows) throws Exception;

    int getCout()throws Exception;
}
