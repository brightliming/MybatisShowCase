package com.learn.chapter2.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by bright on 17-1-17.
 */
public class SqlSessionFactoryUtil {


    //SqlSessionFacotry 对象
    private static SqlSessionFactory sqlSessionFactory = null;
    //类线程锁
    private static final Class CLASS_LOCK =  SqlSessionFactoryUtil.class;

    /**
     * 私有化构造方法
     */
    private SqlSessionFactoryUtil(){}

    /**
     * 构建SqlSessionFactory
     * @return
     */
    public static SqlSessionFactory initSqlSessionFactory(){
        String resources = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resources);
        } catch (IOException e) {
            Logger.getLogger(SqlSessionFactoryUtil.class.getName()).log(Level.SEVERE,null,e);
        }

        synchronized (CLASS_LOCK){
            if(sqlSessionFactory==null){
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSqlSession(){
        if(sqlSessionFactory == null){
            initSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }



}
