/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Daniel C Teixeira
 */
public class franquia {
    private String endereco;
    private String numeroderegistro;
    private int numerodealunos;
    private int quantidadedeinstrutores;
    private double caixa;

    public franquia(String endereco, String numeroderegistro, int numerodealunos, int quantidadedeinstrutores, double caixa) {
        this.endereco = endereco;
        this.numeroderegistro = numeroderegistro;
        this.numerodealunos = numerodealunos;
        this.quantidadedeinstrutores = quantidadedeinstrutores;
        this.caixa = caixa;
    }
     public franquia() {
        this.endereco = null;
        this.numeroderegistro = null;
        this.numerodealunos = 0;
        this.quantidadedeinstrutores = 0;
        this.caixa = 0;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroderegistro() {
        return numeroderegistro;
    }

    public void setNumeroderegistro(String numeroderegistro) {
        this.numeroderegistro = numeroderegistro;
    }

    public int getNumerodealunos() {
        return numerodealunos;
    }

    public void setNumerodealunos(int numerodealunos) {
        this.numerodealunos = numerodealunos;
    }

    public int getQuantidadedeinstrutores() {
        return quantidadedeinstrutores;
    }

    public void setQuantidadedeinstrutores(int quantidadedeinstrutores) {
        this.quantidadedeinstrutores = quantidadedeinstrutores;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }
    
}
