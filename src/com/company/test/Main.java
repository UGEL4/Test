package com.company.test;

import com.company.dao.FruitDao;
import com.company.dao.OrderDao;
import com.company.entity.Fruit;
import com.company.entity.Order;
import com.company.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //showAllFruit();
        FruitDao dao = MyBatisUtils.getInterfaceMapper(FruitDao.class);
        Fruit f = dao.find(1);
        System.out.println(f);
    }
private static final Logger logger = Logger.getLogger(Main.class);

    @Test
    public void testBatis() throws Exception {
        //加载配置文件
        String resource = "MyBatis01-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        //创建一个SessionFactory
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(resourceAsStream);
        //创建一个会话
        SqlSession openSession = sqlSessionFactory.openSession();

        Fruit user = openSession.selectOne("test.find",1);
        //logger.warn(user);
        //logger.debug(user);
        //logger.trace(user);
        //logger.error(user);
        System.err.println(user);
    }
    //@Test
    public static void showAllFruit(){
        FruitDao dao = MyBatisUtils.getInterfaceMapper(FruitDao.class);
//
//        InputStream resourceAsStream = null;
//        try {
//            resourceAsStream = Resources.getResourceAsStream(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        // 创建一个SessionFactory
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//        // 创建一个会话
//        SqlSession openSession = sqlSessionFactory.openSession();
        List<Fruit> list = dao.showAll();
      // FruitDao fruitDao = openSession.getMapper(FruitDao.class);
      // List<Fruit> list = fruitDao.showAll();
        for(Fruit f : list){
            System.out.println(f);
        }
    }
    @Test
    public void findOrders(){
        OrderDao dao = MyBatisUtils.getInterfaceMapper(OrderDao.class);
        List<Order> list = dao.findAllOrder();
        System.out.println(list);
    }
}
