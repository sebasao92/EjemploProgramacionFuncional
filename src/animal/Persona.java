package animal;

import base.Animal;

public class Persona extends Animal {

    @Override
    public void comunicar() {
        System.out.println("Se comunica como una Persona");
    }
}
