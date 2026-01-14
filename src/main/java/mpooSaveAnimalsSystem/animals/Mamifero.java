package mpooSaveAnimalsSystem.animals;

public class Mamifero extends Animals {
    protected boolean isPelos;

    Mamifero(String nome, int idade, double peso, Caracteristica caracteristica,String sexo,boolean isPelos) {
        super(nome, idade, peso, caracteristica,sexo);
        this.isPelos = isPelos;
    }
}
