/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Venda;
import utils.Utils;

/**
 *
 * @author Lenovo
 */
public class VendasController {

    //Método de inserção de vendas
    public boolean inserirVenda(Venda venda) {
        String sql = "INSERT into tb_vendas (data_venda, valor_total, cpf_comprador, nome_comprador) "
                + " VALUES (?,?,?,?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {

            comando = gerenciador.prepararComando(sql);
            comando.setDate(1, new java.sql.Date(venda.getDataVenda().getTime()));
            comando.setDouble(2, venda.getValorTotal());
            comando.setString(3, venda.getCpfComprador());
            comando.setString(4, venda.getNomeComprador());

            comando.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    public boolean alterarVenda(Venda venda) {
        String sql = "UPDATE tb_vendas SET data_venda = ?, valor_total = ?, cpf_comprador = ?, "
                + " nome_comprador = ? WHERE "
                + " pk_venda = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {

            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, venda.getPkVenda());
            comando.setDate(2, new java.sql.Date(venda.getDataVenda().getTime()));
            comando.setDouble(3, venda.getValorTotal());
            comando.setString(4, venda.getCpfComprador());
            comando.setString(5, venda.getNomeComprador());

            comando.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO NA ALTERAÇÃO DE USÚARIO.");
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    public List<Venda> buscarVendas(int tipoFiltro, String filtro) {
        String sql = "SELECT * FROM dbprojeto.tb_vendas";

        if (!filtro.equals("")) {
            if (tipoFiltro == 0 || tipoFiltro == 1) {
                sql = sql + " WHERE nome_comprador LIKE ?";
            } else {
                sql = sql + " WHERE cpf_comprador LIKE ?";
            }
        }

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        List<Venda> listaVendas = new ArrayList<>();

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

                Venda venda = new Venda();

                venda.setPkVenda(resultado.getInt("pkVenda"));
                venda.setDataVenda(resultado.getDate("dataVenda"));
                venda.setValorTotal(resultado.getDouble("valorTotal"));
                venda.setCpfComprador(resultado.getString("cpfComprador"));
                venda.setNomeComprador(resultado.getString("nomeComprador"));

                listaVendas.add(venda);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendasController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }
        return listaVendas;
    }

    public boolean excluir(int pkVenda) {

        String sql = "DELETE FROM tb_vendas WHERE pk_venda = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, pkVenda);

            comando.executeUpdate();

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    public Venda buscarPorPk(int pkVenda) {

        //Guarda o sql
        String sql = "SELECT * FROM tb_venda WHERE pk_venda = ? ";

        //cria um gerenciador de conexao
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        Venda venda = new Venda();

        try {
            comando = gerenciador.prepararComando(sql);

            comando.setInt(1, pkVenda);

            resultado = comando.executeQuery();

            if (resultado.next()) {

                venda.setPkVenda(resultado.getInt("pk_venda"));
                venda.setDataVenda(resultado.getDate("data_venda"));
                venda.setValorTotal(resultado.getDouble("valor_total"));
                venda.setCpfComprador(resultado.getString("cpf_comprador"));
                venda.setNomeComprador(resultado.getString("nome_comprador"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }
        return venda;
    }
}
