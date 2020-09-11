package main;

import animal.Perro;
import animal.Persona;
import base.Animal;
import base.SerVivo;
import base.enums.Genero;
import planta.Planta;

public class Main {

    public static void main(String... args) {

        Animal animalito = new Animal(Genero.FEMENINO);
        Perro perro = new Perro();
        Persona persona = new Persona();
        Perro[] perros = new Perro[2]; //[0] [1]
        Planta planta = new Planta() {
            @Override
            public void florecer() {
                System.out.println("Florezco como planta");
            }

            @Override
            public void alimentar() {
                System.out.println("Me alimento como planta");
            }
        };

        planta.florecer();
        planta.alimentar();

        /*try {
            perros[1] = new Perro();
            persona.getGenero();
            Estudiante estudiante = new Estudiante(6.0);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException exception) {
            throw new NotaNoValidaException("");
        } catch (NotaNoValidaException exception){
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Entré al finally");
        }

        System.out.println("Se controló la exception");*/
    }

    public static void alimentarA(SerVivo serVivo){
        serVivo.alimentar();
    }
}
