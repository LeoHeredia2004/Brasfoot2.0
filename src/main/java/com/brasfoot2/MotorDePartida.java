package com.brasfoot2;
import java.util.Random;

public class MotorDePartida {
    private Random random;

    public MotorDePartida() {
        this.random = new Random();
    }

    public void simular(Time casa, Time visitante) {
        int forcaCasa = casa.getForcaTotal();
        int forcaVisitante = visitante.getForcaTotal();

        // Adiciona um fator aleatório (ruído de 0 a 20) na força base
        int pesoCasa = forcaCasa + random.nextInt(21);
        int pesoVisitante = forcaVisitante + random.nextInt(21);

        // Lógica extremamente simplificada para gerar gols com base no peso final
        int golsCasa = calcularGols(pesoCasa, pesoVisitante);
        int golsVisitante = calcularGols(pesoVisitante, pesoCasa);

        // Imprime o placar direto no console (MVP)
        System.out.println("=== FIM DE JOGO ===");
        System.out.println(casa.getNome() + " " + golsCasa + " x " + golsVisitante + " " + visitante.getNome());
    }

    // Função auxiliar para definir a quantidade de gols
    private int calcularGols(int pesoAtaque, int pesoDefesa) {
        if (pesoAtaque > pesoDefesa + 15) {
            return random.nextInt(4) + 1; // Domínio amplo: 1 a 4 gols
        } else if (pesoAtaque > pesoDefesa) {
            return random.nextInt(3);     // Jogo parelho com leve vantagem: 0 a 2 gols
        } else {
            return random.nextInt(2);     // Jogo difícil/inferioridade: 0 a 1 gol
        }
    }
}
