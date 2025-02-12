package com.example.fincontrolapp.holder;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fincontrolapp.R;
public class LoginHolder {
    public EditText editTextEmail, editTextPassword;
    public Button btnLogin, btnRegister;
    public TextView txtForgotPassword;

    public LoginHolder(View view) {
        editTextEmail = view.findViewById(R.id.login_text);
        editTextPassword = view.findViewById(R.id.password_text);
        btnLogin = view.findViewById(R.id.btn_login);
        btnRegister = view.findViewById(R.id.btn_register);
        txtForgotPassword = view.findViewById(R.id.forgot_password_text);
    }
}
