/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.icorrea.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class LoginDAO {
    
    public void cadastrarUser(String nome, String email, String senha) throws SQLException {
        Connection con = new Conexao().getConnection();
        String sql = "INSERT INTO login (nome, email, senha) VALUES ('"+nome+"', '"+email+"', '"+senha+"')";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.execute();
        con.close();
    }
    
}
