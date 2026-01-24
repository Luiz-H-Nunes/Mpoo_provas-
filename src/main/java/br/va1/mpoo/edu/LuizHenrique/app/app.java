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

        bd.removerVeiculo( new Moto(
                "Honda", "Hornet 500", 2022,
                null,
                new EquipamentoOpicional(false, true, true),
                "BBB9999",
                false,
                470
        ));
        Simulador simulador1 = new Simulador(bd);
        simulador.simularAlugueis(11);    }
}
