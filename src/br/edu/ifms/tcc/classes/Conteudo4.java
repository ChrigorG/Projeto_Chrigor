/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.tcc.classes;

/**
 *
 * @author Noah
 */
public class Conteudo4 {
    public static int progresso, numquestao = 0;
    public static String erros;
    private String result , botaoprox = "Proximo", exercicio, alt1, alt2, alt3, alt4, alt5;
    private int primquest = 0;

    public static String getErros() {
        return erros;
    }

    public static void setErros(String erros) {
        Conteudo4.erros = erros;
    }

    public static int getProgresso() {
        return progresso;
    }

    public static void setProgresso(int progresso) {
        Conteudo4.progresso = progresso;
    }

    public int getPrimquest() {
        return primquest;
    }

    public void setPrimquest(int primquest) {
        this.primquest = primquest;
    }

    public int getNumquestao() {
        return numquestao;
    }

    public void setNumquestao(int numquestao) {
        Conteudo4.numquestao = numquestao;
    }

    public String getBotaoprox() {
        return botaoprox;
    }

    public void setBotaoprox(String botaoprox) {
        this.botaoprox = botaoprox;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public String getAlt1() {
        return alt1;
    }

    public void setAlt1(String alt1) {
        this.alt1 = alt1;
    }

    public String getAlt2() {
        return alt2;
    }

    public void setAlt2(String alt2) {
        this.alt2 = alt2;
    }

    public String getAlt3() {
        return alt3;
    }

    public void setAlt3(String alt3) {
        this.alt3 = alt3;
    }

    public String getAlt4() {
        return alt4;
    }

    public void setAlt4(String alt4) {
        this.alt4 = alt4;
    }

    public String getAlt5() {
        return alt5;
    }

    public void setAlt5(String alt5) {
        this.alt5 = alt5;
    }
    
}
