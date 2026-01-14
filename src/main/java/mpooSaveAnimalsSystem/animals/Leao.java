package mpooSaveAnimalsSystem.animals;

public class Leao extends Mamifero{
    protected double tamanhoDaJuba;

    Leao(String nome, int idade, double peso, Caracteristica caracteristica,String sexo, boolean isPelos, double tamanhoDaJuba) {
        super(nome, idade, peso, caracteristica,sexo,isPelos);
        this.tamanhoDaJuba = tamanhoDaJuba;

    }

    @Override
    public String toString() {
        return "Leao{" +
                "tamanhoDaJuba=" + tamanhoDaJuba +
                ", isPelos=" + isPelos +
                ", nome='" + nome + '\'' +
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
