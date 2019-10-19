package com.company.entity;

public class OrderItem {
    private int o_item_id;
    private String o_id;
    private int p_id;
    private int o_item_count;

    public OrderItem(int o_item_id, String o_id, int p_id, int o_item_count) {
        this.o_item_id = o_item_id;
        this.o_id = o_id;
        this.p_id = p_id;
        this.o_item_count = o_item_count;
    }

    public OrderItem() {
    }

    public int getO_item_id() {
        return o_item_id;
    }

    public void setO_item_id(int o_item_id) {
        this.o_item_id = o_item_id;
    }

    public String getO_id() {
        return o_id;
    }

    public void setO_id(String o_id) {
        this.o_id = o_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getO_item_count() {
        return o_item_count;
    }

    public void setO_item_count(int o_item_count) {
        this.o_item_count = o_item_count;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "o_item_id=" + o_item_id +
                ", o_id='" + o_id + '\'' +
                ", p_id=" + p_id +
                ", o_item_count=" + o_item_count +
                '}';
    }
}
