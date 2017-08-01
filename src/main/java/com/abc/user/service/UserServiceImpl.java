package com.abc.user.service;

import com.abc.user.mapper.UserMapper;
import com.abc.user.pojo.User;
import com.util.MysqlPageUtils;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    @Override
    public List<User> getList(int page, int rows) throws Exception {

        return userMapper.getUsers(new MysqlPageUtils(page,rows));
    }

    @Override
    public int getCout() throws Exception {
        return userMapper.getCount();
    }
}
