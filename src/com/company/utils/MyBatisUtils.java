package com.company.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory = null;
    private static SqlSession sqlSession = null;
    static {
        String resource = "MyBatis-config.xml";
        InputStream resourceAsStream = null;
        try {
            System.out.println("resource:"+resource);
            resourceAsStream = Resources.getResourceAsStream(resource);
            System.out.println("stream:"+resourceAsStream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // 创建一个SessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        System.out.println("sqlSessionFactory:"+sqlSessionFactory);
    }

    public static <T> T getInterfaceMapper(Class<T> clazz) {
        sqlSession = sqlSessionFactory.openSession();
        //动态代理方式生成 Mapper 接口实现类
        return sqlSession.getMapper(clazz);
    }

    public static void closeSession() {
        if(sqlSession!=null) {
            sqlSession.close();
        }
    }
}
