/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insig;

import Beans.Cliente_Bean;
import java.sql.SQLException;

/**
 *
 * @author guilherme
 */
public class Insig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Cliente_Bean cb = new Cliente_Bean();
        cb.teste();
    }
    
}
