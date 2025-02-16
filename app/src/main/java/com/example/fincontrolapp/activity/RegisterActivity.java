package com.example.fincontrolapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fincontrolapp.R;
import com.example.fincontrolapp.holder.LoginHolder;
import com.example.fincontrolapp.holder.RegisterHolder;

public class RegisterActivity extends AppCompatActivity {

    private RegisterHolder holder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        holder = new RegisterHolder(findViewById(android.R.id.content));

        setupListeners();
    }

    private void setupListeners() {
        holder.btnRegister.setOnClickListener(v -> openRegisterScreen());
        holder.btnBackToLogin.setOnClickListener(v -> backToLoginView());
    }

    private void openRegisterScreen() {
        String name = holder.editTextName.getText().toString().trim();
        String email = holder.editTextEmail.getText().toString().trim();
        String document = holder.editTextDocument.getText().toString().trim();
        String password = holder.editTextPassword.getText().toString().trim();
        String confirm_password = holder.editTextConfirmPassword.getText().toString().trim();

        if (name.isEmpty()) {
            holder.editTextName.setError("Digite seu e-mail");
            return;
        }

        if (email.isEmpty()) {
            holder.editTextEmail.setError("Digite seu e-mail");
            return;
        }

        if (document.isEmpty()) {
            holder.editTextDocument.setError("Digite seu e-mail");
            return;
        }

        if (password.isEmpty()) {
            holder.editTextPassword.setError("Digite sua senha");
            return;
        }

        if (confirm_password.isEmpty()) {
            holder.editTextConfirmPassword.setError("Digite a confirmação da senha");
            return;
        }

        if (!confirm_password.equals(password)) {
            holder.editTextPassword.setError("As senhas não estão identicas");
            holder.editTextConfirmPassword.setError("As senhas não estão identicas");
            return;
        }

        Toast.makeText(this, "Registro realizado com sucesso!", Toast.LENGTH_SHORT).show();

        /*Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
        finish(); */
    }

    private void backToLoginView() {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
