package com.company.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

public class DruidDataSource extends UnpooledDataSourceFactory {
    static DataSource myDataSource = null;

    static {
        loadProperties();
        System.out.println("初始化");
    }

    private static void loadProperties(){
        try {
            Properties property = new Properties();
            ClassLoader loader = DruidDataSource.class.getClassLoader();
            property.load(loader.getResourceAsStream("db.properties"));
            myDataSource = DruidDataSourceFactory.createDataSource(property);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //这里构造函数踩坑了，忘记初始化化 UnpooledDataSourceFactory 类的 dataSource 了，结果导致在 dao 调用
    //dao.xml 文件进行 sql 查询的时候报空指针异常
    public DruidDataSource(){
        this.dataSource = myDataSource;
    }
   /*static DataSource myDataSource= null;
    static {
        Properties prop = new Properties();
        try {
            ClassLoader loader = DruidDataSource.class.getClassLoader();
            prop.load(loader.getResourceAsStream("db.properties"));
            myDataSource = DruidDataSourceFactory.createDataSource(prop);
            //可以在代码初始化的时候 自动获取一个连接  这样连接池就自动初始化了 加速数据的连接
            //dataSource.getConnection();
            //System.out.println("获取dataSource连接");
        }catch(Exception e) {
            System.out.println("文件加载失败");
        }
    }
    public DruidDataSource() {
        this.dataSource = myDataSource;
        // TODO Auto-generated constructor stub
    }*/
}
