package animal;

import base.Animal;
import base.enums.Color;

public class Perro extends Animal {

    public Perro(){
        super(Color.MESTIZO);
    }

    @Override
    public void comunicar() {
        System.out.println("Se comunica como un Perro");
    }

    @Override
    public String toString() {
        return "Perro -> " + super.toString();
    }

    @Override
    public void alimentar() {
        System.out.println("Me alimento como un Perro");
    }
}
