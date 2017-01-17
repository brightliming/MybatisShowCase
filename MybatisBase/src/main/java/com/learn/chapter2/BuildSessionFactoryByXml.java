package com.learn.chapter2;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by bright on 17-1-16.
 */
public class BuildSessionFactoryByXml {
    public static void main(String[] args){
        String resource = "mybatis-config.xml";
        SqlSessionFactory sqlSessionFactory= null;
        try {
            InputStream stream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
