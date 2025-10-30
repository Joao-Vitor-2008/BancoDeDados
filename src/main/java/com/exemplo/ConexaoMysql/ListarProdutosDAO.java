package com.exemplo.ConexaoMysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.exemplo.Classes.Produto;

public class ListarProdutosDAO {

  public List<Produto> listarDados() {
    List<Produto> produtos = new ArrayList<>();

    String sql = "SELECT id, nome, preco FROM produtos;";

    try (Connection conn = ConexaoBD.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();) {

      while (result.next()) {
        Produto p = new Produto();

        p.setId(result.getInt("id"));
        p.setNome(result.getString("nome"));
        p.setPreco(result.getFloat("preco"));

        produtos.add(p);

      }
    } catch (SQLException e) {
      e.printStackTrace(System.out);
    }

    return produtos;
  }
}
