package com.company;

public class Main {
    public static void getVelocidad(IPlaneta planeta){
        System.out.println(planeta.getVelocidad());
    }
    public static void aumentarVelocidad(IPlaneta planeta){
        planeta.aumentarVelocidad();
    }

    public static void main(String[] args) {
        IPlaneta tierra = new Planeta("Planeta Tierra");

        for (int i = 0; i<100; i++)
        {
            getVelocidad(tierra);
            aumentarVelocidad(tierra);
        }
    }
}
