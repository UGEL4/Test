package com.company.dao;


import com.company.entity.Fruit;

import java.util.List;

public interface FruitDao {
     public List<Fruit> showAll();
     public Fruit find(int f_id);
}