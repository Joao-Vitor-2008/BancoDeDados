<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  import="com.exemplo.ConexaoMysql.InserirProdutosDAO" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Banco De Dados</title>
    <link href="css/style.css" rel="stylesheet">
  </head>

  <body>
    <h2>Cadastrar</h2>

    <div>
      <a href="index.html">Inicio</a>
      <a href="listar.jsp">Listar Produtos</a>
    </div>


    <form method="post">
      <label>Nome</label>
      <input type="text" name="nome" required> <br>

      <label>Preço</label>
      <input type="number" name="preco" required> <br> <br>

      <input type="submit" value="Enviar">

      <hr>

      <% String nomeStr=request.getParameter("nome"); %>
        <% String precoStr=request.getParameter("preco"); %>
          <% if (nomeStr !=null && precoStr !=null) { %>
            <% InserirProdutosDAO dao=new InserirProdutosDAO(); %>
              <% out.println("Produto Inserido no Banco de Dados"); %>
                <% double preco=Double.parseDouble(precoStr); dao.inserirDados(nomeStr, preco); } %>
    </form>
  </body>

  </html>
