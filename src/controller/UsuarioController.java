/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author s.lucas
 */
public class UsuarioController {

    public boolean autenticar(String email, String senha) {
        String sql = "SELECT * from TBUSUARIO "
                + " WHERE email = ? and senha = ?"
                + " and ativo = true";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        try {
            comando = gerenciador.prepararComando(sql);

            comando.setString(1, email);
            comando.setString(2, senha);

            resultado = comando.executeQuery();

            if (resultado.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }
        return false;
    }

}
