/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author s.lucas
 */
public class UsuarioController {
    
    public boolean autenticar(String email, String senha){
        String sql = "SELECT * from TBUSUARIO"
                    +"WHERE email = ? and senha = ?"
                    +"and ativo = true";
    }
    
}
