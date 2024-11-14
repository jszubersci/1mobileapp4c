package com.example.a1mobileapp4c.ui.zadanie2;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a1mobileapp4c.R;
import com.google.android.material.snackbar.Snackbar;

public class zadanie2 extends Fragment {

    private com.example.a1mobileapp4c.databinding.FragmentZadanie2Binding binding;
    Button button;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Zadanie2ViewModel zadanie1ViewModel =
                new ViewModelProvider(this).get(Zadanie2ViewModel.class);

        binding = com.example.a1mobileapp4c.databinding.FragmentZadanie2Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button button1 = binding.button1;
        Button button2 = binding.button2;
        ImageView imageview1 = binding.imageview1;
        TextView textview = binding.textview1;



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
