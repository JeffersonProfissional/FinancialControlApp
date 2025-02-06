package com.example.fincontrolapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fincontrolapp.activity.ForgotPasswordActivity;
import com.example.fincontrolapp.activity.LoginActivity;
import com.example.fincontrolapp.activity.RegisterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        findViewById(R.id.btn_login).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        });

        findViewById(R.id.btn_register).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, RegisterActivity.class));
        });

        findViewById(R.id.btn_forgot_password).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ForgotPasswordActivity.class));
        });
    }
}