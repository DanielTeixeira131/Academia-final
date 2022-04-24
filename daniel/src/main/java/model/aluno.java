/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Daniel C Teixeira
 */
public class aluno {
    private String telefone;
    private String cpf;
    private String nome;
    private float peso;
    private int idade;
    private String genero;
    private float altura;

    public aluno(String telefone, String cpf, String nome, float peso, int idade, String genero, float altura) {
        this.telefone = telefone;
        this.cpf = cpf;
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.genero = genero;
        this.altura = altura;
    }
        public aluno (){
        this.telefone = null;
        this.cpf = null;
        this.nome = null;
        this.peso = 0;
        this.idade = 0;
        this.genero = null;
        this.altura = 0;
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }    
}
