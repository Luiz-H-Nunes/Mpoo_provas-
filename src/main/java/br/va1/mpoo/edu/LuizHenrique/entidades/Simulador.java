package br.va1.mpoo.edu.LuizHenrique.entidades;

import javax.swing.*;


public class Simulador {
    private BaseDados base ;

    public Simulador(BaseDados base) {
        this.base = base;
    }

   public void simularAlugueis(int dias){
       String mensagem = "\n";
       for (Veiculo veiculo : base.listVeiculosDisponiveis() ){
           mensagem = mensagem + veiculo.getModelo() + "|Valor Total: R$" +
                   veiculo.getValorDiaria()*dias + "\n";
       }
       JOptionPane.showMessageDialog(null,
               "*** Simulação de alugueis por "+ dias + " dias ***\n"
               + mensagem);
   }
}
