package com.learn.chapter3.main;

import com.learn.chapter2.util.SqlSessionFactoryUtil;
import com.learn.chapter3.enums.Sex;
import com.learn.chapter3.mapper.UserMapper;
import com.learn.chapter3.po.User;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by bright on 17-1-18.
 */
public class Chapter3Main {
    public static void main(String[] args){
        SqlSession sqlsession = null;

        try{
            sqlsession = SqlSessionFactoryUtil.openSqlSession();

            //System.out.println(sqlsession.getConfiguration().getDatabaseId());

            UserMapper userMapper = sqlsession.getMapper(UserMapper.class);

            User user = new User();
            user.setUserName("zhangsan");
            user.setCnname("张三");
            user.setEmail("zhangsan@163.com");
            user.setSex(Sex.MALE);
            user.setMobile("888888");
            user.setNote("test EnumOrdinalTypeHandler!");

            userMapper.insertUser(user);

//            User user2 = userMapper.getUser(1L);
//            System.out.println(user2.getSex());
            sqlsession.commit();
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
