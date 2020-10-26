package com.lilili957.studentstatusmanagement.mapper;

import com.lilili957.studentstatusmanagement.model.Role;
import com.lilili957.studentstatusmanagement.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insert(User user);

    User loadUserByUsername(String username);

    List<Role> getUserRolesById(Integer id);
}
