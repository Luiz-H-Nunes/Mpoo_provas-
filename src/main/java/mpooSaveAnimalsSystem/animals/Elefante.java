package mpooSaveAnimalsSystem.animals;

public class Elefante extends Mamifero {
    protected double comprimentoDaTromba; // Lá ele

    Elefante(String nome, int idade, double peso, Caracteristica caracteristica,String sexo, boolean isPelos, double comprimentoDaTromba) {
        super(nome, idade, peso, caracteristica,sexo,isPelos);
        this.comprimentoDaTromba = comprimentoDaTromba;
    }

    @Override
    public String toString() {
        return "Elefante{" +
                "comprimentoDaTromba=" + comprimentoDaTromba +
                ", isPelos=" + isPelos +
                ", nome='" + nome + '\'' +
                ", som='" + som + '\'' +
                ", sexo='" + sexo + '\'' +
                ", alimentação='" + alimentação + '\'' +
                ", id='" + id + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", caracteristica=" + caracteristica +
                '}';
    }
}
