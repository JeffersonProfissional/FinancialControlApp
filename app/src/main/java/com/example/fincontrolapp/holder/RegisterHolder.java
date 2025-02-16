package com.example.fincontrolapp.holder;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fincontrolapp.R;

public class RegisterHolder {

    public EditText editTextName, editTextEmail, editTextDocument, editTextPassword, editTextConfirmPassword;
    public Button btnRegister;
    public TextView btnBackToLogin;

    public RegisterHolder(View view) {
        editTextName = view.findViewById(R.id.name_text);
        editTextEmail = view.findViewById(R.id.email_text);
        editTextDocument = view.findViewById(R.id.document_text);
        editTextPassword = view.findViewById(R.id.password_text);
        editTextConfirmPassword = view.findViewById(R.id.confirm_password_text);

        btnRegister = view.findViewById(R.id.btn_register);
        btnBackToLogin = view.findViewById(R.id.return_login_btn);
    }

}
