package com.brasfoot2;

public class Jogador {
    private String nome;
    private Posicao posicao;
    private int forca;
    private int energia;

    public Jogador(String nome, Posicao posicao, int forca) {
        this.nome = nome;
        this.posicao = posicao;
        this.forca = forca;
        this.energia = 100;
    }

    public String getNome() { return nome; }
    public Posicao getPosicao() { return posicao; }
    public int getForca() { return forca; }
    public int getEnergia() { return energia; }


}
