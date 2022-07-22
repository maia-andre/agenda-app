package com.seduc.agendanews.ui.agendamento;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AgendamentoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AgendamentoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}