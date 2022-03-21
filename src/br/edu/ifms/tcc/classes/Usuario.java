/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.tcc.classes;

/**
 *
 * @author Chrigor
 */
public class Usuario {
    private String nome;
    private int idade,n1,n2,n3,total_n,cont = 0;
    public static int valor;
    public static String nome_logado;

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getTotal_n() {
        return total_n;
    }

    public void setTotal_n(int total_n) {
        this.total_n = total_n;
    }

    public void contadorn1soma(){
        setCont(getCont() + 1);
    }
    
    public void contadorn1subtrair(){
        setCont(getCont() - 1);
    }

    
    
}
