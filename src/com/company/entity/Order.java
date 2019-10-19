package com.company.entity;

import java.util.Date;
import java.util.List;
import java.util.zip.DataFormatException;

public class Order {
    private String o_id;
    private double o_totalprice;
    private Date o_addtime;
    private List<OrderItem> orderItem;

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    public Order(String o_id, double o_totalprice, Date o_addtime) {
        this.o_id = o_id;
        this.o_totalprice = o_totalprice;
        this.o_addtime = o_addtime;
    }

    public Order() {
    }

    public String getO_id() {
        return o_id;
    }

    public void setO_id(String o_id) {
        this.o_id = o_id;
    }

    public double getO_totalprice() {
        return o_totalprice;
    }

    public void setO_totalprice(double o_totalprice) {
        this.o_totalprice = o_totalprice;
    }

    public Date getO_addtime() {
        return o_addtime;
    }

    public void setO_addtime(Date o_addtime) {
        this.o_addtime = o_addtime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "o_id='" + o_id + '\'' +
                ", o_totalprice=" + o_totalprice +
                ", o_addtime=" + o_addtime +
                ", orderItem=" + orderItem +
                '}';
    }
}
