package com.seduc.agendanews.ui.agendamento;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.seduc.agendanews.domain.Agendamentos;

import java.util.ArrayList;
import java.util.List;

public class AgendamentoViewModel extends ViewModel {

    private final MutableLiveData<List<Agendamentos>> agendamentos;

    public AgendamentoViewModel() {
        this.agendamentos = new MutableLiveData<>();

        List<Agendamentos> agendamentos = new ArrayList<>();
        Agendamentos.add(new Agendamentos("Anderson", "DPR", "24/07/2022","Carlos, Raul", "Visita na EM Antonio Luiz"));

        this.agendamentos.setValue(agendamentos);
    }

    public LiveData<List<Agendamentos>> getAgendamentos() {
        return this.agendamentos;
    }
}