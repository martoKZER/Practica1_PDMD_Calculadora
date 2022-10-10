package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mycalculator.databinding.ActivityMainBinding;
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
        binding.btnSumar.setOnClickListener(v -> {
            if (etxNumber1.getText() != null || etxNumber2.getText() != null) {
                try {
                    int n1 = Integer.parseInt(String.valueOf(etxNumber1));
                    int n2 = Integer.parseInt(String.valueOf(etxNumber2));
                    int res = n1 + n2;
                    String resultado = Integer.toString(res);
                    tvResult.setText(resultado);

                } catch (NumberFormatException e) {
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
                int n1 = Integer.parseInt(String.valueOf(etxNumber1));
                int n2 = Integer.parseInt(String.valueOf(etxNumber2));
                String resultado = Integer.toString(n1 - n2);
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
                int n1 = Integer.parseInt(String.valueOf(etxNumber1));
                int n2 = Integer.parseInt(String.valueOf(etxNumber2));
                String resultado = Integer.toString(n1 * n2);
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
                int n1 = Integer.parseInt(String.valueOf(etxNumber1));
                int n2 = Integer.parseInt(String.valueOf(etxNumber2));
                String resultado = Integer.toString(n1 / n2);
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
