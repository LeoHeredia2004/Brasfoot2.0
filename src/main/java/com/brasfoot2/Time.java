package com.brasfoot2;
import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Jogador> elenco;

    public Time(String nome) {
        this.nome = nome;
        this.elenco = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        this.elenco.add(jogador);
    }

    public String getNome() { return nome; }
    public List<Jogador> getElenco() { return elenco; }

    public int getForcaTotal() {
        int forcaTotal = 0;
        for (Jogador j : elenco) {
            forcaTotal += j.getForca();
        }
        return forcaTotal;
    }
}
