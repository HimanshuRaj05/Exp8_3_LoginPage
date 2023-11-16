package com.intreve.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText etUserName, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.btnLogin);
        etUserName=findViewById(R.id.etUserName);
        etPassword=findViewById(R.id.etPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName=etUserName.getText().toString();
                String password=etPassword.getText().toString();

                if(userName.equals("Steve")&& password.equals("1234")){
                    Intent intent= new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }

                else{
                    Toast.makeText(MainActivity.this, "Incorrect username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}