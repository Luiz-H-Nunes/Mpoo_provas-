package br.va1.mpoo.edu.LuizHenrique.entidades;

public class EquipamentoOpicional {
    private boolean som;
    private boolean alarme;
    private boolean bloqueador;

    public EquipamentoOpicional(boolean som, boolean alarme, boolean bloqueador){
        this.som=som;
        this.alarme=alarme;
        this.bloqueador=bloqueador;

    }

    @Override
    public String toString() {
        return "Som : " + this.som + "\nAlarme : " + this.alarme +
                "\nBloquador : " + this.bloqueador;    }
}

