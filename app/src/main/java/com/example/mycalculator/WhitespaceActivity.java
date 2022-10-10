package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.mycalculator.databinding.ActivityWhitespaceBinding;

public class WhitespaceActivity extends AppCompatActivity {
    ActivityWhitespaceBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whitespace);
        // Ir a otra actividad PASO 3
        Intent intent = getIntent();
        String whitespace = intent.getStringExtra("@string/whitespace");
        binding.buttonOk.setOnClickListener(v ->{
            intent.putExtra("@string/main", 1);
            WhitespaceActivity.this.startActivity(intent);
        });
    }
}