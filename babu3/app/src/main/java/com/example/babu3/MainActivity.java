package com.example.babu3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText) findViewById(R.id.name);
        password=(EditText) findViewById(R.id.password);
        login=(Button) findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sp=getSharedPreferences("file1",MODE_PRIVATE);
                SharedPreferences.Editor ed=sp.edit();
                ed.putString("username",username.getText().toString());
                ed.apply();
                Intent i=new Intent(MainActivity.this, babu3display.class);
                startActivity(i);
            }
        });
    }
}