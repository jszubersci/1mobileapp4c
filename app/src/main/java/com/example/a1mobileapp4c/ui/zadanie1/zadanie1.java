package com.example.a1mobileapp4c.ui.zadanie1;

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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a1mobileapp4c.R;
import com.google.android.material.snackbar.Snackbar;

public class zadanie1 extends Fragment {

    private com.example.a1mobileapp4c.databinding.FragmentZadanie1Binding binding;
    Button button;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Zadanie1ViewModel zadanie1ViewModel = new ViewModelProvider(this).get(Zadanie1ViewModel.class);

        binding = com.example.a1mobileapp4c.databinding.FragmentZadanie1Binding.inflate(inflater, container, false);
        View root = binding.getRoot();


        LinearLayout main = new LinearLayout(container.getContext());
        main.setOrientation(LinearLayout.VERTICAL);

        LinearLayout l1 = new LinearLayout(container.getContext());
        l1.setOrientation(LinearLayout.HORIZONTAL);

        TextView text = binding.ID1;
        text.setText("TEXT:");

        EditText editText = binding.ID2;

        button = binding.ID3;
        button.setText("BUTTON");


        CheckBox checkBox = binding.ID5;


        button.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
            String s = String.valueOf(editText.getText());
            if(s.length() == 0) {
                s = "Nie wpisano tekstu";
            }
            if(checkBox.isChecked()) {
                Toast.makeText(getActivity(), s,
                        Toast.LENGTH_LONG).show();
            } else {
                Snackbar.make(container, s, Snackbar.LENGTH_LONG)
                        .setAction("CLOSE", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        })
                        .setActionTextColor(getResources().getColor(android.R.color.holo_red_light ))
                        .show();
            }
        }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
