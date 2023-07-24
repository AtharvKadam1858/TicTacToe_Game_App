package com.example.tictactoe12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUser,etPwd;
    Button btnConfirm,btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUser=findViewById(R.id.editTextName);
        etPwd=findViewById(R.id.editTextPassword);

        btnConfirm=findViewById(R.id.buttonSubmit);
        btnCancel=findViewById(R.id.cancel_button);


        //oneclick handlers
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("Name",etUser.getText().toString());
                i.putExtra("Password", etPwd.getText().toString());
                startActivity(i);

                String user=etUser.getText().toString();
                String pwd=etPwd.getText().toString();

                if(user.equals("ak") && pwd.equals("50")){
                    Toast.makeText(MainActivity.this,"Authenticated",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this, "Denied", Toast.LENGTH_SHORT).show();

                }

            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etUser.setText(null);
                etPwd.setText(null);

            }
        });
    }


}

