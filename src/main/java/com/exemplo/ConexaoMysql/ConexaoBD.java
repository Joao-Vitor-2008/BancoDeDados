package com.exemplo.ConexaoMysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConexaoBD {
  private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
  private static final String USER = "admin";
  private static final String PASSWORD = "senha";
  private static final String HOST = "localhost";
  private static final String PORT = "3306";
  private static final String DATABASE = "loja";
  private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE
      + "?useSSL=false&serverTimezone=UTC";

  private static Connection connection;

  public static Connection getConnection() throws SQLException {
    try {
      if (connection != null && !connection.isClosed()) {
        return connection;
      }

      Class.forName(DRIVER);
      connection = DriverManager.getConnection(URL, USER, PASSWORD);
      return connection;

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return connection;
  }

  public static boolean closeConnection() {
    try {
      if (connection != null && !connection.isClosed()) {
        connection.close();
        return true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

}
