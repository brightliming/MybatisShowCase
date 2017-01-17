package com.learn.chapter2.main;

import com.learn.chapter2.mapper.RoleMapper;
import com.learn.chapter2.po.Role;
import com.learn.chapter2.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by bright on 17-1-17.
 */
public class Chapter2Main {
    public static void main(String[] args){
        SqlSession sqlsession = null;

        try{
            sqlsession = SqlSessionFactoryUtil.openSqlSession();

            RoleMapper roleMapper = sqlsession.getMapper(RoleMapper.class);

            Role role = new Role();
            role.setRoleName("testName");
            role.setNote("testNote");

            roleMapper.insertRole(role);

            roleMapper.deleteRole(1L);

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
