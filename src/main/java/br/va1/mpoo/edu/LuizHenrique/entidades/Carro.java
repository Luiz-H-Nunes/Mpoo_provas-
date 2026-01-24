package br.va1.mpoo.edu.LuizHenrique.entidades;

import java.util.Calendar;

import static br.va1.mpoo.edu.LuizHenrique.util.TabelaPrecos.VALOR_REF_CARRO;

public class Carro extends Veiculo {
    private int numeroPortas;
    private boolean isArCondicionado;


    Carro(String marca, String modelo, int ano, String descricao,
          EquipamentoOpicional opcional, String placa, boolean IsLocado, int numeroPortas, boolean isArCondicionado) {
        super(marca, modelo, ano, descricao, opcional, placa, IsLocado);
        this.numeroPortas = numeroPortas;
        this.isArCondicionado = isArCondicionado;
        CalcularValorDiaria();
    }

    Carro(String marca, String modelo, int ano,
          EquipamentoOpicional opcional, String placa, boolean IsLocado, int numeroPortas,boolean isArCondicionado) {
        super(marca, modelo, ano, opcional, placa, IsLocado);
        this.numeroPortas = numeroPortas;
        this.isArCondicionado = isArCondicionado;
        CalcularValorDiaria();

    }
    public String toString(){
        return super.toString() + "\nnumeroPortas = " + numeroPortas + "\nisArCondicionado = " + isArCondicionado ;
    }

    public void CalcularValorDiaria(){
       int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
       setValorDiaria(VALOR_REF_CARRO);
       if(anoAtual == this.ano){
           setValorDiaria(getValorDiaria()*1.1);
       }

    }
}
