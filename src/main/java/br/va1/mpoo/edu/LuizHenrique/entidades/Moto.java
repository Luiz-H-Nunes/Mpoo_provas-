package br.va1.mpoo.edu.LuizHenrique.entidades;

import java.util.Calendar;

import static br.va1.mpoo.edu.LuizHenrique.util.TabelaPrecos.VALOR_REF_MOTO;

public class Moto extends Veiculo {
    private int cilindradas;


    Moto(String marca, String modelo, int ano, EquipamentoOpicional
            opcional, String placa, boolean IsLocado, int cilindradas) {
        super(marca, modelo, ano, opcional, placa, IsLocado);
        this.cilindradas = cilindradas;
        CalcularValorDiaria();
    }

    public Moto(String marca, String modelo, int ano, String descricao,
                EquipamentoOpicional opcional, String placa, boolean IsLocado, int cilindradas) {
        super(marca, modelo, ano, descricao, opcional, placa, IsLocado);
        this.cilindradas = cilindradas;
        CalcularValorDiaria();
    }

    public void CalcularValorDiaria(){
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        setValorDiaria(VALOR_REF_MOTO);
        if(anoAtual == this.ano){

            setValorDiaria(getValorDiaria()*1.1);

        }
    }

    @Override
    public String toString() {
        return super.toString() + "cilindradas = " + cilindradas ;
    }
}
