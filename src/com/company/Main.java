package com.company;

public class Main {
    public static void girarPlaneta(IPlaneta planeta){
        System.out.println(planeta.girar());
    }

    public static void main(String[] args) {
       IPlaneta tierra = new Planeta("Planeta Tierra");
        System.out.println(tierra.saludar());
       Planeta marte  = new Planeta();
       marte.setName("Planeta Marte");
        System.out.println(marte.saludar());
        girarPlaneta(tierra);
    }
}
