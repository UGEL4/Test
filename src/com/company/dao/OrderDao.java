package com.company.dao;

import com.company.entity.Order;

import java.util.List;

public interface OrderDao {
    public List<Order> findAllOrder();
}
