package com.example.fincontrolapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fincontrolapp.R;
import com.example.fincontrolapp.holder.LoginHolder;

public class LoginActivity extends AppCompatActivity {

    private LoginHolder holder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        holder = new LoginHolder(findViewById(android.R.id.content));

        setupListeners();
    }

    private void setupListeners() {
        holder.btnLogin.setOnClickListener(v -> validateLogin());
        holder.btnRegister.setOnClickListener(v -> openRegisterScreen());
        holder.txtForgotPassword.setOnClickListener(v -> showForgotPasswordMessage());
    }

    private void validateLogin() {
        String email = holder.editTextEmail.getText().toString().trim();
        String password = holder.editTextPassword.getText().toString().trim();

        if (email.isEmpty()) {
            holder.editTextEmail.setError("Digite seu e-mail");
            return;
        }

        if (password.isEmpty()) {
            holder.editTextPassword.setError("Digite sua senha");
            return;
        }

        Toast.makeText(this, "Login realizado com sucesso!", Toast.LENGTH_SHORT).show();

        /*Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
        finish(); */
    }

    private void openRegisterScreen() {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    private void showForgotPasswordMessage() {
        Toast.makeText(this, "Redirecionando para recuperação de senha...", Toast.LENGTH_SHORT).show();
    }
}
