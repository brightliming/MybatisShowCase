package com.learn.chapter2;

import com.learn.chapter2.mapper.RoleMapper;
import com.learn.chapter2.po.Role;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

/**
 * Created by bright on 17-1-16.
 */
public class BuildSessionFactory {
    public static void main(String[] args){
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setDriver("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis");
        dataSource.setUsername("root");
        dataSource.setPassword("learn");
        TransactionFactory transactionFactory = new JdbcTransactionFactory();

        Environment enviroment = new Environment("development",transactionFactory,dataSource);

        Configuration configuration = new Configuration(enviroment);

        configuration.getTypeAliasRegistry().registerAlias("role",Role.class);

        configuration.addMapper(RoleMapper.class);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);


    }
}
