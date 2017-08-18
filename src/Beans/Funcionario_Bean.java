/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Classes.Cliente;
import Classes.Funcionario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import persistence.ConexaoDAO;

/**
 *
 * @author guilherme
 */
public class Funcionario_Bean {
    private Funcionario func;
    
    public void InserFuncionario(Funcionario f) throws SQLException{
        try (Connection conexao = (Connection) ConexaoDAO.createConnection()) {
            java.sql.Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("insert into funcionario (nome_func,cpf,data_nasc,endereco,telefone,sexo,cargo) VALUES ('"+f.getNome()+ "','"+f.getCpf()+ "','"+f.getData_nasc()+ "','"+f.getEndereco()+ "','"+f.getTelefone()+ "','"+f.getSexo()+ "','" + f.getCargo()+"');" );
        }
    }
}
