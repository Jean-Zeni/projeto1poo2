/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.Icon;

/**
 *
 * @author aluno.saolucas
 */
public class Produtos {
    
    private String nomeProduto;
    private double valorProduto;
    private double quantia;
    private Icon imgProduto;

    public Produtos() {
    }

    public Produtos(String nomeProduto, double valorProduto, double quantia, Icon imgProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
        this.quantia = quantia;
        this.imgProduto = imgProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getQuantia() {
        return quantia;
    }

    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }

    public Icon getImgProduto() {
        return imgProduto;
    }

    public void setImgProduto(Icon imgProduto) {
        this.imgProduto = imgProduto;
    }
    
    
    
    
    
}
