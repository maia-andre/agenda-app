package com.seduc.agendanews.domain;

import java.util.Date;

public class Agendamentos {

    private String Motorista;
    private String veiculo;
    private String dataAgendamento;
    private String Passageiro;
    private String descDestino;

    public Agendamentos(String motorista, String veiculo, String dataAgendamento, String passageiro, String descDestino) {
        Motorista = motorista;
        this.veiculo = veiculo;
        this.dataAgendamento = dataAgendamento;
        Passageiro = passageiro;
        this.descDestino = descDestino;
    }

    //verificar a necessidade do method add
    public static void add(Agendamentos agendamentos) {
    }

    public String getMotorista() {
        return Motorista;
    }

    public void setMotorista(String motorista) {
        Motorista = motorista;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getPassageiro() {
        return Passageiro;
    }

    public void setPassageiro(String passageiro) {
        Passageiro = passageiro;
    }

    public String getDescDestino() {
        return descDestino;
    }

    public void setDescDestino(String descDestino) {
        this.descDestino = descDestino;
    }
}
