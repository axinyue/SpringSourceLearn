package com.ax.mysql;

import java.sql.*;

public class Test1 {

    /**
     * How to use Mysql Connect/J. <br>
     * 1. load driver.see {@link com.mysql.jdbc.Driver} <br>
     * 2. get connect that use DriverManager from a connect url. <br>
     *
     * about JDBC: JDBC is Java Interface. you can implenment they to access database from java. JDBC Interface see: {@link java.sql} <br>
     * @author ax. 20201119  <br>
     * link: https://dev.mysql.com/doc/connector-j/5.1/en/ <br>
     */
    public static Connection getConnection() throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        // get connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test?user=minty&password=greatsqldb");
        return connection;
    }

    /**
     * Why need Statement? How work is?
     * 1. You can use Statement execute a sql. may be is select or update. in Statement only use method executeQuery or executeUpdate to run sql and get result.  <br>
     *
     * How to get a Object from result?
     * parse? or other.
     *
     * @throws Exception
     */
    public static void firstQuery() throws Exception{
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from bar");
        int result = statement.executeUpdate("update bar set id=1 where id =1");

    }
}
