/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Venda {

    private int pkVenda;
    private Date dataVenda;
    private double valorTotal;
    private String cpfComprador;
    private String nomeComprador;

    public Venda() {
    }

    public Venda(int pkVenda, Date dataVenda, double valorTotal, String cpfComprador, String nomeComprador) {
        this.pkVenda = pkVenda;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.cpfComprador = cpfComprador;
        this.nomeComprador = nomeComprador;
    }

    public int getPkVenda() {
        return pkVenda;
    }

    public void setPkVenda(int pkVenda) {
        this.pkVenda = pkVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getCpfComprador() {
        return cpfComprador;
    }

    public void setCpfComprador(String cpfComprador) {
        this.cpfComprador = cpfComprador;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

}
