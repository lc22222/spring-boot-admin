package com.may.admin.service;

import com.may.admin.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User login(User user);

    User findUserById(String userId);
}
