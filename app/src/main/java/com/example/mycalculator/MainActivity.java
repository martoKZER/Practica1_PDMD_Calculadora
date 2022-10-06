package com.example.mycalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mycalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    TextView etxNumber1 = findViewById(R.id.etxNumber1);
    TextView etxNumber2 = findViewById(R.id.etxNumber2);
    //AlertDialog.Builder alertDialog = new AlertDialog.Builder(Whi)
    //En el metodo onCreate irá todo el código que se tiene que ejecutar al abrir la aplicación
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
    public void onSumarClick(View view){
        if (etxNumber1 != null) {
            binding.etxNumber1.getText();
        }else{
            //MOSTRAR MENSAJE EMERGENTE "FALTA INTRODUCIR N1".
        }
    }
}