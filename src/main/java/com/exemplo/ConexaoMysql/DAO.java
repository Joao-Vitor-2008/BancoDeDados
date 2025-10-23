package com.exemplo.ConexaoMysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {

  public void inserirDados(String nome, double preco) {
    String sql = "INSERT INTO produtos (nome, preco) VALUES (?,?);";

    try (Connection conn = ConexaoBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);) {

      stmt.setString(1, nome);
      stmt.setDouble(2, preco);

      stmt.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(System.out);
    }
  }
}
