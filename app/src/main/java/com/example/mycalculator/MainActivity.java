package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.mycalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Button btn_Sumar, btn_Restar, btn_Mult, btn_Div;
    private TextView etxNumber1, etxNumber2;
    private ActivityMainBinding binding;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        if (etxNumber1 != null) {
            binding.etxNumber1.getText();
        }else{
            //MOSTRAR MENSAJE EMERGENTE "FALTA INTRODUCIR N1".

        }
    }
}