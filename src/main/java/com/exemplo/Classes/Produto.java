package com.exemplo.Classes;

public class Produto {

  private String nome;
  private float preco;
  private int id;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public Float getPreco() {
    return preco;
  }

}
