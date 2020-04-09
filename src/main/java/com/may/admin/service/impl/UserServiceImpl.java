package com.may.admin.service.impl;

import com.may.admin.domain.UserRepository;
import com.may.admin.entity.User;
import com.may.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User login(User user) {
        User userRes = userRepository.findByUsernameAndPassword(user.getUsername(),user.getPassword());
        return userRes;
    }

    @Override
    public User findUserById(String userId) {
        User user = userRepository.findById(userId).get();
        return user;
    }
}
