package br.va1.mpoo.edu.LuizHenrique.app;

import br.va1.mpoo.edu.LuizHenrique.entidades.*;

public class app {
    public static void main(String[] args) {
        BaseDados bd = new BaseDados();
        bd.createBase();
        bd.listVeiculosDisponiveis();

        Simulador simulador = new Simulador(bd);
        simulador.simularAlugueis(10);

        bd.BuscarVeiculo("ABC1234").setDescricao(null);
        bd.BuscarVeiculo("ABC1234").setOpcional(new EquipamentoOpicional(false,false,false));

        Moto Hornet = (Moto) bd.BuscarVeiculo("BBB9999");
        bd.removerVeiculo((Veiculo)  Hornet);
        Simulador simulador1 = new Simulador(bd);
        simulador.simularAlugueis(10);   }
}
