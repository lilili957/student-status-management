package com.lilili957.studentstatusmanagement.service;

import com.lilili957.studentstatusmanagement.mapper.UserMapper;
import com.lilili957.studentstatusmanagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;

//    @Autowired
//    UserRoleMapper userRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在!");
        }
        user.setRoles(userMapper.getUserRolesById(user.getUId()));
        return user;
    }
}
