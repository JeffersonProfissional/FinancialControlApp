package com.example.fincontrolapp.holder;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.fincontrolapp.R;

public class ForgotPasswordHolder {

    public EditText editTextEmail;
    public Button btnRecover;

    public ForgotPasswordHolder(View view) {
        editTextEmail = view.findViewById(R.id.email_text);
        btnRecover = view.findViewById(R.id.btn_recover_password);
    }

}
