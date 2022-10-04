package com.example.mycalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.mycalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Button btn_Sumar, btn_Restar, btn_Mult, btn_Div;
    private TextView etxNumber1, etxNumber2;
    private ActivityMainBinding binding;

//    @Override
//    public Dialog onCreateDialog(Bundle savedInstanceState){
//        AlertDialog.Builder adBuilder = new AlertDialog.Builder();
//        return null;
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        if (etxNumber1 != null) {
            binding.etxNumber1.getText();
        }else{
            //MOSTRAR DIALOGO EMERGENTE "FALTA INTRODUCIR N1".
        }
    }
}