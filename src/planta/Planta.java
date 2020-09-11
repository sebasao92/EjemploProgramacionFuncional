package planta;

import base.SerVivo;

public abstract class Planta implements SerVivo {

    private Float nivelDeNutrientes;

    public Planta(){
    }

    public Planta(Float nivelDeNutrientes){
        this.nivelDeNutrientes = nivelDeNutrientes;
    }

    public abstract void florecer();

    @Override
    public String toString() {
        return "Planta ->";
    }

    public Float getNivelDeNutrientes() {
        return nivelDeNutrientes;
    }

    public void setNivelDeNutrientes(Float nivelDeNutrientes) {
        this.nivelDeNutrientes = nivelDeNutrientes;
    }
}
