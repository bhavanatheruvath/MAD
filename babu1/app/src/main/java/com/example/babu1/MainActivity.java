package com.example.babu1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView login,username,password;
    EditText name,pass;
    Button log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (TextView) findViewById(R.id.textView2);
        username = (TextView) findViewById(R.id.textView);
        password = (TextView) findViewById(R.id.textView3);
        name = (EditText) findViewById(R.id.editTextText);
        pass = (EditText) findViewById(R.id.editTextTextPassword);
        log = (Button) findViewById(R.id.button);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = name.getText().toString();
                String p = pass.getText().toString();
                if(n.equals("babutheruvath") && p.equals("babu18$")) {
                    Toast.makeText(MainActivity.this, "Login successful.", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, babu1copy.class);
                    i.putExtra("key",n);
                    startActivity(i);
                }
            }
        });
    }
}