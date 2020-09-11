package planta;

public class Girasol extends Planta {

    Girasol(Float nivelNutrientes){
        super(nivelNutrientes);
    }

    @Override
    public void alimentar() {
        System.out.println("Me alimento como un Girasol");
    }

    @Override
    public void florecer() {
        System.out.println("Florece como un Girasol");
    }
}
