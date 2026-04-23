package com.brasfoot2;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Time> times = TimeRepository.carregarTimes();

        Time time1 = times.get(0);
        Time time2 = times.get(1);

        System.out.println("Time: " + time1.getNome() + " | Força: " + time1.getForcaTotal());
        System.out.println("Time: " + time2.getNome() + " | Força: " + time2.getForcaTotal());

        MotorDePartida motor = new MotorDePartida();
        motor.simular(time1, time2);
    }
}
