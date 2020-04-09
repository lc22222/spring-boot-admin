package com.may.admin.service;

import com.may.admin.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface TokenService {
    String getToken(User user);
}
