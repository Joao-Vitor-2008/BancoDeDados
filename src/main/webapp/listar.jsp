<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  import="com.exemplo.ConexaoMysql.ListarProdutosDAO, java.util.List, com.exemplo.Classes.Produto" %>
  <!DOCTYPE html>
  <html lang="pt-BR">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Listar</title>
    <link href="css/style.css" rel="stylesheet">
  </head>

  <body>
    <h2>Listar</h2>
    <div>
      <a href="index.html">Início</a>
      <a href="cadastrar.jsp">Cadastrar Produtos</a>
    </div>
    <br>
    <hr><br>
    <% ListarProdutosDAO listarProdutos=new ListarProdutosDAO(); List<Produto> lista = listarProdutos.listarDados();

      for (Produto produto : lista) {
      %>
      <p><b>
          <%= produto.getNome() %>
        </b> - R$ <%= produto.getPreco() %>
      </p>
      <% } %>
  </body>

  </html>
