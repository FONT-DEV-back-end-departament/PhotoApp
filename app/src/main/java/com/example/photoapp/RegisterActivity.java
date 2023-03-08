package com.example.photoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class RegisterActivity extends AppCompatActivity {

    private MaterialButton materialButton;
    private MaterialButton nextButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        materialButton = findViewById(R.id.back_button);
        nextButton = findViewById(R.id.next_button);
    }

    @Override
    protected void onStart() {
        super.onStart();
        materialButton.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
            startActivity(intent);
        });

        nextButton.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterActivity.this, RegisterStepTwoActivity.class);
            startActivity(intent);
        });
    }
}