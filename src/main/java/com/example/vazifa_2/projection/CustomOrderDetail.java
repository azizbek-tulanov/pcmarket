package com.example.vazifa_2.projection;

import com.example.vazifa_2.entity.Order;
import com.example.vazifa_2.entity.OrderDetail;
import com.example.vazifa_2.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OrderDetail.class)

public interface CustomOrderDetail {

    Integer getId();
    Integer  getQuantity();
    Product getProduct();
    Order getOrder();
    /*
     private ;
    private ;
    @ManyToOne
    private ;
    @ManyToOne
    private ;
     */
}
