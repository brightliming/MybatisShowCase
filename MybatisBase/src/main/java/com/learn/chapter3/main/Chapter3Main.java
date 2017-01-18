package com.learn.chapter3.main;

import com.learn.chapter2.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by bright on 17-1-18.
 */
public class Chapter3Main {
    public static void main(String[] args){
        SqlSession sqlsession = null;

        try{
            sqlsession = SqlSessionFactoryUtil.openSqlSession();

            System.out.println(sqlsession.getConfiguration().getDatabaseId());

        }catch (Exception ex){
            System.err.println(ex.getMessage());
            sqlsession.rollback();
        }finally {
            if(sqlsession != null){
                sqlsession.close();
            }
        }

    }
}
