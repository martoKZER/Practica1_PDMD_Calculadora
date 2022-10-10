package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mycalculator.databinding.ActivityMainBinding;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    //En el metodo onCreate irá todo el código que se tiene que ejecutar al abrir la aplicación
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EditText etxNumber1 = binding.etxNumber1;
        EditText etxNumber2 = binding.etxNumber2;

        TextView tvResult = binding.tvResult;
        NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
        binding.btnSumar.setOnClickListener(v -> {
            if (etxNumber1.getText() != null || etxNumber2.getText() != null) {
                try {
                    //double n1 = Double.parseDouble(String.valueOf(etxNumber1));
                    double n1 = Objects.requireNonNull(nf.parse(etxNumber1.toString())).doubleValue();
                    //double n2 = Double.parseDouble(String.valueOf(etxNumber2));
                    double n2 = Objects.requireNonNull(nf.parse(etxNumber2.toString())).doubleValue();
                    double res = n1 + n2;
                    String resultado = Double.toString(res);
                    tvResult.setText(resultado);

                } catch (NumberFormatException | ParseException e) {
                    e.printStackTrace();
                }
            } else {
                // Ir a otra actividad PASO 1.
                Intent intent = new Intent(MainActivity.this, WhitespaceActivity.class);
                intent.putExtra("@string/whitespace", 0);
                MainActivity.this.startActivity(intent);

            }
        });

        binding.btnRestar.setOnClickListener(v -> {
            if (etxNumber1.getText() != null || etxNumber2.getText() != null) {
                double n1 = Double.parseDouble(String.valueOf(etxNumber1));
                double n2 = Double.parseDouble(String.valueOf(etxNumber2));
                String resultado = Double.toString(n1 - n2);
                tvResult.setText(resultado);
            } else {
                // Ir a otra actividad PASO 1.
                Intent intent = new Intent(MainActivity.this, WhitespaceActivity.class);
                intent.putExtra("@string/whitespace", 0);
                MainActivity.this.startActivity(intent);

            }
        });
        binding.btnMult.setOnClickListener(v -> {
            if (etxNumber1.getText() != null || etxNumber2.getText() != null) {
                double n1 = Double.parseDouble(String.valueOf(etxNumber1));
                double n2 = Double.parseDouble(String.valueOf(etxNumber2));
                String resultado = Double.toString(n1 * n2);
                tvResult.setText(resultado);
            } else {
                // Ir a otra actividad PASO 1.
                Intent intent = new Intent(MainActivity.this, WhitespaceActivity.class);
                intent.putExtra("@string/whitespace", 0);
                MainActivity.this.startActivity(intent);

            }
        });
        binding.btnDiv.setOnClickListener(v -> {
            if (etxNumber1.getText() != null || etxNumber2.getText() != null) {
                double n1 = Double.parseDouble(String.valueOf(etxNumber1));
                double n2 = Double.parseDouble(String.valueOf(etxNumber2));
                String resultado = Double.toString(n1 / n2);
                tvResult.setText(resultado);
            } else {
                // Ir a otra actividad PASO 1.
                Intent intent = new Intent(MainActivity.this, WhitespaceActivity.class);
                intent.putExtra("@string/whitespace", 0);
                MainActivity.this.startActivity(intent);
            }
        });
    }

}
