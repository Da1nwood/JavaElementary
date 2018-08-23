package ua.od.hillel.groupManager.persisting.impl.db.utils;

import org.apache.log4j.Logger;

import java.sql.*;

import static ua.od.hillel.groupManager.config.ApplicationConfig.dbPassword;
import static ua.od.hillel.groupManager.config.ApplicationConfig.dbUrl;
import static ua.od.hillel.groupManager.config.ApplicationConfig.dbUser;

public class MySQLConnector {
    final static Logger logger = Logger.getLogger(MySQLConnector.class);

    public MySQLConnector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            logger.error("Wrong driver",e);
        }
    }

    public Connection getConnection() {
        Connection result = null;
        try  {
            Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            result = connection;
        } catch (SQLException e) {
            logger.error("Connection to db is wrong ",e);
        }
        return result;
    }
}
