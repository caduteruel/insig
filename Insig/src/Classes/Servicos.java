/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author guilherme
 */
public class Servicos {
    private int id;
    private String nome_serv,descricao;
    private double preco;

    public Servicos(int id, String nome_serv, String descricao, double preco) {
        this.id = id;
        this.nome_serv = nome_serv;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_serv() {
        return nome_serv;
    }

    public void setNome_serv(String nome_serv) {
        this.nome_serv = nome_serv;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
