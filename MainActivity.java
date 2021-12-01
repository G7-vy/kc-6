package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        EditText uid,pwd;
        Button login;
        uid=(EditText) findViewById(R.id.editTextTextPersonName);
        pwd=(EditText) findViewById(R.id.editTextTextPassword);
        login=(Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(uid.getText().toString().equals("Chai") && pwd.getText().toString().equals("chai218"))
                {
                    String msg="WELCOME    "+uid.getText().toString();
                    Intent i=new Intent(MainActivity.this,Welcome.class);
                    i.putExtra("str",msg);
                    startActivity(i);
                }
                else
                    Toast.makeText(MainActivity.this, "The User ID or Password Is Incorrect", Toast.LENGTH_SHORT).show();

            }
        });
    }
}