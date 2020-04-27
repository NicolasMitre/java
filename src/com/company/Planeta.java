package com.company;

public class Planeta implements IPlaneta{
    private String name;
    private int velocidad = 0;
    private int sentidoDeGiro;



    public Planeta(String name){
        this.name = name;
    }
    public Planeta(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getSentidoDeGiro() {
        return sentidoDeGiro;
    }

    public void setSentidoDeGiro(int sentidoDeGiro) {
        this.sentidoDeGiro = sentidoDeGiro;
    }
    @Override
    public long getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String girar() {
       return "100";

    }
    @Override
    public String saludar(){
        return "Hola " + this.name;
    }

    @Override
    public long aumentarVelocidad()
    {
        this.velocidad++;
        return velocidad;
    }


}
