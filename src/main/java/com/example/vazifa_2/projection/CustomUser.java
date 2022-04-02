package com.example.vazifa_2.projection;

import com.example.vazifa_2.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)

public interface CustomUser {
     Integer getId();
     String getFirstName();
     String getLastName();
     String getPhoneNumber();
    String getPassword();

}
