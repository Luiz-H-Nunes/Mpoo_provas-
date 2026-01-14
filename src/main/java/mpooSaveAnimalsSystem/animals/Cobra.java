package mpooSaveAnimalsSystem.animals;

public class Cobra extends Reptil
{
    protected double comprimento;
    protected String especie;

    Cobra(String nome, int idade, double peso, Caracteristica caracteristica, String sexo, boolean isVenenoso, double comprimento, String especie) {
        super(nome, idade, peso, caracteristica, sexo, isVenenoso);
        this.comprimento = comprimento;
        this.especie = especie;
    }


    @Override
    public String toString() {
        return "Cobra{" +
                "comprimento=" + comprimento +
                ", especie='" + especie + '\'' +
                ", isVenenoso=" + isVenenoso +
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
