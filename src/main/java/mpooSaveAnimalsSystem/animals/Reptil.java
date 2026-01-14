package mpooSaveAnimalsSystem.animals;

public abstract class Reptil extends Animals{
    protected boolean isVenenoso;

    Reptil(String nome, int idade, double peso, Caracteristica caracteristica,String sexo, boolean isVenenoso) {
        super(nome, idade, peso, caracteristica,sexo);
        this.isVenenoso = isVenenoso;
    }
}
