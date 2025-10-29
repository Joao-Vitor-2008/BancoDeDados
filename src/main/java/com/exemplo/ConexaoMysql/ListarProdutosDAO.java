package com.exemplo.ConexaoMysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ListarProdutosDAO {

  public void listarDados() {
    String sql = "SELECT * FROM produtos;";

    try (Connection conn = ConexaoBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);) {

      stmt.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(System.out);
    }
  }
}
