package com.learn.chapter4.main;

import com.learn.chapter2.util.SqlSessionFactoryUtil;
import com.learn.chapter3.enums.Sex;
import com.learn.chapter3.mapper.UserMapper;
import com.learn.chapter3.po.User;
import com.learn.chapter4.mapper.StudentMapper;
import com.learn.chapter4.po.StudentBean;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by bright on 17-1-18.
 */
public class Chapter4Main {
    public static void main(String[] args){
        SqlSession sqlsession = null;

        try{
            sqlsession = SqlSessionFactoryUtil.openSqlSession();

            StudentMapper studentMapper = sqlsession.getMapper(StudentMapper.class);

            StudentBean studentBean = studentMapper.getStudent(1);


            System.out.println(studentBean);
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
