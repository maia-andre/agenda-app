package com.seduc.agendanews.ui.agendamento;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.seduc.agendanews.databinding.FragmentAgendamentoBinding;

public class AgendamentoFragment extends Fragment {

    private FragmentAgendamentoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AgendamentoViewModel agendamentoViewModel =
                new ViewModelProvider(this).get(AgendamentoViewModel.class);

        binding = FragmentAgendamentoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAgendamento;
        agendamentoViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}