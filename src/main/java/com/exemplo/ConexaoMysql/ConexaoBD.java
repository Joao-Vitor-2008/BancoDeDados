package com.exemplo.ConexaoMysql;

import java.sql.Connection;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConexaoBD {

  private static final Dotenv dotenv = Dotenv.configure().filename("dados.env").load();

  private static String DRIVER = "com.mysql.cj.jdbc.Driver";
  private static String USER = dotenv.get("usuarioBD");
  private static String PASSWORD = dotenv.get("senhaBD");
  private static String URL = dotenv.get("url");

  private static final HikariDataSource ds;

  static {
    HikariConfig config = new HikariConfig();
    config.setJdbcUrl(URL);
    config.setUsername(USER);
    config.setPassword(PASSWORD);
    config.setDriverClassName(DRIVER);
    ds = new HikariDataSource(config);
  }

  public Connection getConnection() throws SQLException {
    try {

      return ds.getConnection();

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return ds.getConnection();
  }
}
