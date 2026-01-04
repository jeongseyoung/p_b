package com.example.base.domain.item;

import com.example.base.domain.dto.UserDto;
import com.example.base.enumbox.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserItem {
    private long userId;
    private String firstName;
    private String lastName;
    private String userEmail;
    private Role user_Role;
    private String userPassword;

    public UserItem(UserDto user) {
        this.userId = user.getUserId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.userEmail = user.getUserEmail();
        this.user_Role = user.getUser_Role();
    }
}
