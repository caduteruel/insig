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
public class Cliente {
    private int id;
    private String nome,cpf,endereço,telefone,celular,sexo;

    public Cliente(int id, String nome, String cpf, String endereço, String telefone, String celular,  String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
        this.telefone = telefone;
        this.celular = celular;
        this.id = id;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public int getId() {
        return id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
