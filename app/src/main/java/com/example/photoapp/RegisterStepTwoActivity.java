package com.example.photoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
public class RegisterStepTwoActivity extends AppCompatActivity {

    private MaterialButton materialButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_step_two);
        materialButton = findViewById(R.id.back_step_two_button);
    }

    @Override
    protected void onStart() {
        super.onStart();
        materialButton.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterStepTwoActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}

