package com.example.ptsgenap10rpl108;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button buttonlogin = findViewById(R.id.btnLogin);

            buttonlogin.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    login();
                }
            });
        }


        void login(){
            EditText emailLogin = (EditText)findViewById(R.id.LoginEmail);
            EditText passwordLogin = (EditText)findViewById(R.id.password);

            String emailVer = "daffaAhmad";
            String passwordVer = "daffaAhmad";

            String emailLog = emailLogin.getText().toString();
            String passwordLog = passwordLogin.getText().toString();

            //toast = alert

            if (emailLog.equals(emailVer) && passwordLog.equals(passwordVer)) {
                Toast.makeText(this, "Anda Masuk", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "username atau password salah", Toast.LENGTH_SHORT).show();
            }

        }
    }