/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Classes.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import persistence.ConexaoDAO;


/**
 *
 * @author guilherme
 */
public class Cliente_Bean {
    private Cliente cliente;

    public Cliente_Bean() {
    }

    
    public void teste() throws SQLException{
        try (Connection conexao = (Connection) ConexaoDAO.createConnection()) {
            java.sql.Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("Select * From Cliente;");
            while (rs.next()) {
                cliente = new Cliente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
            }
            System.out.println("nome " + cliente.getNome() + " cel " + cliente.getCelular());
        }
        
    }
    
    public void InserCliente(Cliente c) throws SQLException{
        try (Connection conexao = (Connection) ConexaoDAO.createConnection()) {
            java.sql.Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("insert into cliente (nome,cpf,endereco,telefone,celular,sexo) VALUES ('"+c.getNome()+ "','"+c.getCpf()+ "','"+c.getEndereço()+ "','"+c.getTelefone()+ "','"+c.getCelular()+ "','"+c.getSexo()+"');" );
        }
    }
    
    
    
}
