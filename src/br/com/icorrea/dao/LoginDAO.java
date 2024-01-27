/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.icorrea.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
    
    public void login(String email, String senha) throws SQLException {
        Connection con = new Conexao().getConnection();
        String sql = "SELECT email, senha FROM login WHERE email = '"+email+"' AND senha = '"+senha+"' ";
        System.out.println(sql);
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()) {
            System.out.println("Possui");
        } else {
            System.out.println("Nao possui");
        }
        con.close();
    }
}
