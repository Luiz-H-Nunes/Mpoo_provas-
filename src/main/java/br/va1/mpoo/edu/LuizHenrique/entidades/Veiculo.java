package br.va1.mpoo.edu.LuizHenrique.entidades;

public abstract class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    public String descricao;
    public EquipamentoOpicional opcional;
    protected String placa;
    private boolean IsLocado;
    private double valorDiaria;
    private int numeroFrota;
    private int numeroProximo;

    Veiculo(String marca, String modelo,int ano,String descricao,
            EquipamentoOpicional opcional,String placa,boolean IsLocado){

        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.descricao=descricao;
        this.opcional=opcional;
        this.placa=placa;
        this.IsLocado=IsLocado;

    }
    Veiculo(String marca, String modelo,int ano,
            EquipamentoOpicional opcional,String placa,boolean IsLocado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.opcional = opcional;
        this.placa = placa;
        this.IsLocado = IsLocado;

    }

    public String getPlaca() {
        return placa;
    }

    public boolean isLocado() {
        return IsLocado;
    }

    protected double getValorDiaria() {
        return valorDiaria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setOpcional(EquipamentoOpicional opcional) {
        this.opcional = opcional;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    protected void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void setNumeroFrota(int numeroFrota) {
        this.numeroFrota = numeroFrota;
        setNumeroProximo(numeroFrota + 1);
    }

    public void setNumeroProximo(int numeroProximo) {
        this.numeroProximo = numeroProximo;
    }

    public abstract void CalcularValorDiaria();

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", descricao='" + descricao + '\'' +
                ", opcional=" + opcional +
                ", placa='" + placa + '\'' +
                ", IsLocado=" + IsLocado +
                ", valorDiaria=" + valorDiaria +
                ", numeroFrota=" + numeroFrota +
                ", numeroProximo=" + numeroProximo +
                '}';
    }
}
