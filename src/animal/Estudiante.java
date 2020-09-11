package animal;

import animal.exception.NotaNoValidaException;

public class Estudiante extends Persona {

    private Double nota = 0.0;

    public Estudiante(Double nota){

        if(validarNota(nota)) {
            this.nota = nota;
        }
    }

    private boolean validarNota(Double nota) {

        if(nota < 0 || nota > 5){
            throw new NotaNoValidaException("La nota " + nota + " no es válida");
        }

        return true;
    }
}
