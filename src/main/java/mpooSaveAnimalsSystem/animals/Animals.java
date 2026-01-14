package mpooSaveAnimalsSystem.animals;

import java.util.ArrayList;

public class Animals {
    String nome;
    String sexo;
    String som;
    String alimentação;
    String id;

    double peso;

    int idade;

     Caracteristica caracteristica;

    Animals(String nome){
        this.nome = nome;
    }

    Animals(String nome,int idade,double peso,Caracteristica caracteristica,String sexo){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.caracteristica = caracteristica;
        this.id = null;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlimentação() {
        return alimentação;
    }

    public void setAlimentação(String alimentação) {
        this.alimentação = alimentação;
    }

    public void definirSomAnimal(Animals animal){
        if (animal instanceof Leao) {
            animal.som = "ruge : Roooar !";
        } else if (animal instanceof Elefante) {
            animal.som = "trombeta : Prrrrooooh !";
        } else if (animal instanceof Cobra) {
            animal.som = "sibila : Sssssss !";
        }


    }

    @Override
    public String toString() {
        return "Animals{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", som='" + som + '\'' +
                ", alimentação='" + alimentação + '\'' +
                ", id='" + id + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", caracteristica=" + caracteristica +
                '}';
    }
}
