package com.example.a1mobileapp4c.ui.zadanie15;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a1mobileapp4c.R;

public class zadanie15 extends Fragment {

    private Zadanie15ViewModel mViewModel;

    public static zadanie15 newInstance() {
        return new zadanie15();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_zadanie15, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(Zadanie15ViewModel.class);
        // TODO: Use the ViewModel
    }

}