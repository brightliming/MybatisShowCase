package com.learn.chapter2.main;

import com.learn.chapter2.mapper.RoleMapper;
import com.learn.chapter2.po.Role;
import com.learn.chapter2.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by bright on 17-1-17.
 */
public class Chapter2Main {
    public static void main(String[] args){
        SqlSession sqlsession = null;

        try{
            sqlsession = SqlSessionFactoryUtil.openSqlSession();

            RoleMapper roleMapper = sqlsession.getMapper(RoleMapper.class);

//            List<Role> roleList = roleMapper.findRole("testName");

       //     System.out.println(roleList);
            Role role = new Role();
            role.setRoleName("testName2");
            role.setNote("testNote2");

            roleMapper.insertRole(role);
            System.out.println(role.getId());
          //  roleMapper.deleteRole(1L);

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
