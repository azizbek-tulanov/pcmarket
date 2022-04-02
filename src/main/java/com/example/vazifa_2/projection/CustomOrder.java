package com.example.vazifa_2.projection;

import com.example.vazifa_2.entity.Order;
import com.example.vazifa_2.entity.User;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(types = Order.class)

public interface CustomOrder {

    Integer getId();
    Date getOrderDate();
    User getUser();
    /*
     private ;
    private Date orderDate;
    @ManyToOne
    private User user;
     */
}
