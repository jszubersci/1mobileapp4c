package com.example.a1mobileapp4c.ui.zadanie3;

import androidx.lifecycle.ViewModelProvider;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.a1mobileapp4c.R;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class zadanie3 extends Fragment {

    private ListView languageLV;
    private Button addBtn;
    private EditText itemEdt;
    private ArrayList<String> lngList;

    private LinearLayout linearLayout;

    private Zadanie3ViewModel mViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zadanie3, container, false);

        languageLV = view.findViewById(R.id.idLVLanguages);
        addBtn = view.findViewById(R.id.idBtnAdd);
        itemEdt = view.findViewById(R.id.idEdtItemName);
        lngList = new ArrayList<>();

        lngList.add("C++");
        lngList.add("Python");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, lngList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null) {
                    convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
                }

                String item = getItem(position);

                Button removeBtn = new Button(getContext());
                removeBtn.setText("X");

                ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(100, 100);
                params.weight = 1.0f;
                params.gravity = Gravity.RIGHT;

                removeBtn.setLayoutParams(params);

                removeBtn.setOnClickListener(v -> {
                    lngList.remove(position);
                    notifyDataSetChanged();
                });

                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(LinearLayout.HORIZONTAL);
                linearLayout.addView(removeBtn);

                return linearLayout;
            }
        };

        languageLV.setAdapter(adapter);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = itemEdt.getText().toString();

                if (!item.isEmpty()) {
                    lngList.add(item);
                    adapter.notifyDataSetChanged();
                    itemEdt.setText("");
                }
            }
        });

        return view;
    }
}
