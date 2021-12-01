package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        TextView tv;
        tv=(TextView) findViewById(R.id.textView2);
        Intent i=getIntent();
        String msg= ((Intent) i).getStringExtra("str");
        tv.setText(msg);
    }
}
