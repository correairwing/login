/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.icorrea.login.controller;

import br.com.icorrea.dao.Conexao;
import br.com.icorrea.dao.LoginDAO;
import br.com.icorrea.login.view.CadastroView;
import br.com.icorrea.login.view.LoginView;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Usuario
 */
public class LoginController {
    public void cadastroUser(CadastroView view) throws SQLException {
        Connection con = new Conexao().getConnection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUser(view.getjTextName().getText(), view.getjTextEmail().getText(), view.getjPassword().getText());
    }
    
    public void loginUser(LoginView view) throws SQLException {
        Connection con = new Conexao().getConnection();
        LoginDAO login = new LoginDAO();
        login.login(view.getjTextNome().getText(), view.getjPassword().getText());
    }
}
