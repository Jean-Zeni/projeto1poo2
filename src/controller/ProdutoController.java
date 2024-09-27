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
import model.Produtos;
import utils.Utils;

/**
 *
 * @author aluno.saolucas
 */
public class ProdutoController {
    
    GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;
    
    public boolean inserirProduto(Produtos prod) {
        String sql = "INSERT into tb_produtos (nome_produto, valor_produto, quantidade, img_produto) "
                + "VALUES (?,?,?,?)";
        
        byte[] iconBytes = null;

        try {
            if (prod.getImgProduto()!= null) {
                iconBytes = Utils.converterIconToBytes(prod.getImgProduto());
            }

            comando = gerenciador.prepararComando(sql);
            comando.setString(1, prod.getNomeProduto());
            comando.setDouble(2, prod.getValorProduto());
            comando.setDouble(3, prod.getQuantia());
            //comando.setBoolean(5, usu.isAtivo());
            comando.setBytes(4, iconBytes);

            comando.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }
    
}
