/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Produtos;
import utils.Utils;

/**
 *
 * @author aluno.saolucas
 */
public class ProdutoController {

    // MÉTODO DE INSERÇÃO DE PRODUTOS
    public boolean inserirProduto(Produtos prod) {
        //O MÉTODO AINDA NÃO PERMITE A INSERÇÃO DE UM NOVO PRODUTO SEM IMAGEM
        String sql = "INSERT into tb_produtos (nome_produto, valor_produto, quantidade, img_produto) "
                + "VALUES (?,?,?,?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        byte[] iconBytes = null;

        try {
            if (prod.getImgProduto() != null) {
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
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean alterarProduto(Produtos prod) {
        String sql = "UPDATE tb_produtos SET nome_produto = ?, valor_produto = ?, quantidade = ?, "
                + " img_produto = ? WHERE "
                + " pk_produto = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            byte[] iconBytes = Utils.converterIconToBytes(prod.getImgProduto());

            comando = gerenciador.prepararComando(sql);
            comando.setString(1, prod.getNomeProduto());
            comando.setDouble(2, prod.getValorProduto());
            comando.setDouble(3, prod.getQuantia());
            comando.setBytes(4, iconBytes);
            comando.setInt(5, prod.getPkProduto());

            comando.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO NA ALTERAÇÃO DE PRODUTO.");
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    //MÉTODO BUSCAR PRODUTOS
    public List<Produtos> buscarProdutos(int tipoFiltro, String filtro) {
        String sql = "SELECT * FROM dbprojeto.tb_produtos";

        if (!filtro.equals("")) {
            if (tipoFiltro == 0 || tipoFiltro == 1) {
                sql = sql + " WHERE nome_produto LIKE ?";
            } else {
                sql = sql + " WHERE pk_produto LIKE ?";
            }
        }

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        List<Produtos> listaProdutos = new ArrayList<>();

        try {
            comando = gerenciador.prepararComando(sql);

            if (!filtro.equals("")) {
                if (tipoFiltro == 0) {
                    comando.setString(1, filtro + "%");
                } else if (tipoFiltro == 1) {
                    comando.setString(1, "%" + filtro + "%");
                } else {
                    comando.setString(1, filtro);
                }
            }

            resultado = comando.executeQuery();

            while (resultado.next()) {

                Produtos prod = new Produtos();

                prod.setPkProduto(resultado.getInt("pk_produto"));
                prod.setNomeProduto(resultado.getString("nome_produto"));
                prod.setValorProduto(resultado.getDouble("valor_produto"));
                prod.setQuantia(resultado.getDouble("quantidade"));

                listaProdutos.add(prod);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }
        return listaProdutos;
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////

    //MÉTODO EXCLUIR
    public boolean excluir(int pkProduto) {

        String sql = "DELETE FROM tb_produtos WHERE pk_produto = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, pkProduto);

            comando.executeUpdate();

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }
    
    ///////////////////////////////////////////////////////////////////////////////

    //MÉTODO BUSCAR POR PK
    public Produtos buscarPorPk(int pkProduto) {

        //Guarda o sql
        String sql = "SELECT * FROM tb_produtos WHERE pk_produto = ? ";

        //cria um gerenciador de conexao
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        Produtos prod = new Produtos();

        try {
            comando = gerenciador.prepararComando(sql);

            comando.setInt(1, pkProduto);

            resultado = comando.executeQuery();

            if (resultado.next()) {

                prod.setPkProduto(resultado.getInt("pk_produto"));
                prod.setNomeProduto(resultado.getString("nome_produto"));
                prod.setValorProduto(resultado.getDouble("valor_produto"));
                prod.setQuantia(resultado.getDouble("quantidade"));

                byte[] bytes = resultado.getBytes("img_produto");
                if (bytes != null) {
                    ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
                    BufferedImage imagem = ImageIO.read(bis);

                    prod.setImgProduto(new ImageIcon(imagem));
                }
            }
        } catch (SQLException | IOException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }
        return prod;

    }

}
