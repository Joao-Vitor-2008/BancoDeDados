package com.exemplo.ConexaoMysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ModificarProdutosDAO {

  private static final String sql = ("UPDATE produtos SET nome = ?, preco = ? WHERE id = ?;");

  public void ModificarProdutos(String nome, Float preco, int id) {
    try (Connection conn = new ConexaoBD().getConnection();
        PreparedStatement sttm = conn.prepareStatement(sql);) {

      sttm.setString(1, nome);
      sttm.setFloat(2, preco);
      sttm.setInt(3, id);

      sttm.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
