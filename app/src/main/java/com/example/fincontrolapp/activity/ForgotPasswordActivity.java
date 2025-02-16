package com.example.fincontrolapp.activity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fincontrolapp.R;
import com.example.fincontrolapp.holder.ForgotPasswordHolder;

public class ForgotPasswordActivity extends AppCompatActivity {

    private ForgotPasswordHolder holder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        holder = new ForgotPasswordHolder(findViewById(android.R.id.content));

        setupListeners();
    }

    private void setupListeners() {
        holder.btnRecover.setOnClickListener(v -> recoverPassword());
    }

    private void recoverPassword() {

        String email = holder.editTextEmail.getText().toString().trim();

        if (email.isEmpty()) {
            holder.editTextEmail.setError("Digite seu e-mail");
            return;
        }

        Toast.makeText(this, "email de recuperação enviado com sucesso!", Toast.LENGTH_SHORT).show();
    }
}
