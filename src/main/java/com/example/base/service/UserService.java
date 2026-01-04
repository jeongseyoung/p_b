package com.example.base.service;

import com.example.base.domain.dto.UserDto;
import com.example.base.domain.item.UserItem;

public interface UserService {
    UserItem getUser(long userId);

    void addUser(UserDto user);
}
