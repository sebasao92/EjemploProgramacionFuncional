package base;

import base.enums.Color;
import base.enums.Genero;

public class Animal implements SerVivo {

    private Color color;
    private Genero genero;

    public Animal(){
        this.color = Color.NEGRO;
        this.genero = Genero.MASCULINO;
    }

    public Animal(Color color, Genero genero){
        this.color = color;
        this.genero = genero;
    }

    public Animal(Color color){
        this.color = color;
        this.genero = Genero.MASCULINO;
    }

    public Animal(Genero genero){
        this.color = Color.NEGRO;
        this.genero = genero;
    }

    public void comunicar(){
        System.out.println("Me comunico como Animal");
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Genero: " + genero + " Color: " + color;
    }

    @Override
    public void alimentar() {
        System.out.println("Me alimento como Animal");
    }
}
