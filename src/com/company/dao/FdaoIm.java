package com.company.dao;

import com.company.entity.Fruit;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class FdaoIm implements FruitDao{

    private static SqlSessionFactory sqlSessionFactory;
    static {
        String resource = "MyBatis01-config.xml";
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream(resource);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //创建一个SessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
    @Override
    public List<Fruit> showAll() {
        return null;
    }

    @Override
    public Fruit find(int f_id) {
        SqlSession openSession = sqlSessionFactory.openSession();
        return openSession.selectOne("test.find",1);
        //return null;
    }
}
