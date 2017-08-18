/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Classes.Cliente;
import Classes.Servicos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import persistence.ConexaoDAO;

/**
 *
 * @author guilherme
 */
public class Servicos_Bean {
    Servicos serv;
    
    public void InsereServicos(Servicos s) throws SQLException{
        try (Connection conexao = (Connection) ConexaoDAO.createConnection()) {
            java.sql.Statement st = conexao.createStatement();
            st.executeQuery("insert into servicos (nome_serv,descricao,preco) Values('"+s.getNome_serv()+ "','"+s.getDescricao()+ "','"+s.getPreco()+"');" );
        }
    }
}
