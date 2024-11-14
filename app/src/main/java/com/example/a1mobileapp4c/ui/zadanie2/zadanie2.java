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




































package com.example.mobile_app.ui.zadanie2;



        import androidx.lifecycle.ViewModelProvider;

        import android.graphics.Color;
        import android.os.Bundle;

        import androidx.annotation.NonNull;
        import androidx.fragment.app.Fragment;

        import android.util.TypedValue;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.FrameLayout;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.example.mobile_app.R;
        import com.google.android.material.snackbar.Snackbar;

public class zadanie2 extends Fragment {
    public int it = 5;
    private com.example.mobile_app.databinding.FragmentZadanie2Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Zadanie2ViewModel zadanie2ViewModel =
                new ViewModelProvider(this).get(Zadanie2ViewModel.class);

        binding = com.example.mobile_app.databinding.FragmentZadanie2Binding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Button lewo = binding.lewo;
        Button prawo = binding.prawo;
        ImageView imageView = binding.obraz;
        TextView textView = binding.opis;

        int[] ids = {R.mipmap.img1, R.mipmap.img2, R.mipmap.img3, R.mipmap.img4, R.mipmap.img5, R.mipmap.img6, R.mipmap.img7};
        String[] descs = {"halo halo 1", "halo halo 2", "halo halo 3", "halo halo 4", "halo halo 5", "halo halo 6", "halo halo 7" };

        imageView.setImageResource(ids[it]);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, textView.getHeight() / 7);
        textView.setText(descs[it]);
        final float scale = getContext().getResources().getDisplayMetrics().density;
        int pixels = (int) (330.0f * scale + 0.5f);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                pixels, pixels);
        pixels = (int) (10.0f * scale + 0.5f);
        params.leftMargin = pixels;
        params.rightMargin = pixels;
        params.weight = 1.0f;
        imageView.setLayoutParams(params);
        prawo.setOnClickListener(new View.OnClickListener() {            @Override
        public void onClick(View view) {

            it++;
            if(it >= 6) {
                prawo.setBackgroundColor(Color.GRAY);
                it = 6;
            }
            if(it == 1) {

                lewo.setBackgroundColor(Color.BLUE);
            }
            imageView.setImageResource(ids[it]);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, textView.getHeight() / 6);
            textView.setText(descs[it]);
            final float scale = getContext().getResources().getDisplayMetrics().density;
            int pixels = (int) (330.0f * scale + 0.5f);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    pixels, pixels);
            pixels = (int) (10.0f * scale + 0.5f);
            params.leftMargin = pixels;
            params.rightMargin = pixels;
            params.weight = 1.0f;
            imageView.setLayoutParams(params);
        }
        });
        lewo.setOnClickListener(new View.OnClickListener() {            @Override
        public void onClick(View view) {

            it--;
            if(it == 5) {
                prawo.setBackgroundColor(Color.BLUE);
            }
            if(it <= 0) {
                it = 0;
                lewo.setBackgroundColor(Color.GRAY);
            }
            imageView.setImageResource(ids[it]);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, textView.getHeight() / 6);
            textView.setText(descs[it]);
            final float scale = getContext().getResources().getDisplayMetrics().density;
            int pixels = (int) (330.0f * scale + 0.5f);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    pixels, pixels);
            pixels = (int) (10.0f * scale + 0.5f);
            params.leftMargin = pixels;
            params.rightMargin = pixels;
            params.weight = 1.0f;
            imageView.setLayoutParams(params);
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