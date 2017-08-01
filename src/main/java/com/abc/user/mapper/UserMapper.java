package com.abc.user.mapper;
import java.util.List;

import com.abc.user.pojo.User;
import com.util.MysqlPageUtils;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    /**s
     * xian shi yong hu
     * @return
     */
    List<User> getUsers(MysqlPageUtils mps);

    Integer getCount();
}