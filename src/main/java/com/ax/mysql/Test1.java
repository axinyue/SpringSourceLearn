package com.ax.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
    public static void f1(){
        try {
            // Load Driver
            Class.forName("com.mysql.jdbc.Driver");

            // get connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test?user=minty&password=greatsqldb");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
