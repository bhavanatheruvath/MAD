package com.example.babu3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class babu3display extends AppCompatActivity {

    TextView user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babu3display);
        SharedPreferences sp=getSharedPreferences("file1",MODE_PRIVATE);
        String s = sp.getString("username","kaanmaanilla");
        user= (TextView) findViewById(R.id.userdis);
        user.setText(s);
    }
}