/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Daniel C Teixeira
 */
public class instrutor {
    private String telefone;
    private String cpf;
    private String nome;
    private double salario;

    public instrutor(String telefone, String cpf, String nome, double salario) {
        this.telefone = telefone;
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }
public instrutor() {
        this.telefone = null;
        this.cpf = null;
        this.nome = null;
        this.salario = 0;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
