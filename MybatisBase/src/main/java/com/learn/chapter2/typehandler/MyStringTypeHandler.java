package com.learn.chapter2.typehandler;

import org.apache.ibatis.type.*;
import org.apache.log4j.Logger;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by bright on 17-1-18.
 */
@MappedTypes({String.class})
@MappedJdbcTypes(JdbcType.CHAR)
public class MyStringTypeHandler implements TypeHandler<String> {

    private Logger logger = Logger.getLogger(getClass());

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
        logger.info("使用我的TypeHandler");
        preparedStatement.setString(i,s);
    }

    @Override
    public String getResult(ResultSet resultSet, String s) throws SQLException {
        logger.info("使用我的TypeHandler,ResultSet列名获取字符串");
        return resultSet.getString(s);
    }

    @Override
    public String getResult(ResultSet resultSet, int i) throws SQLException {
        logger.info("使用我的TypeHandler,ResultSet下标获取字符串");
        return resultSet.getString(i);
    }

    @Override
    public String getResult(CallableStatement callableStatement, int i) throws SQLException {
        logger.info("使用我的TypeHandler,CallableStatement下标获取字符串");
        return callableStatement.getString(i);
    }
}
