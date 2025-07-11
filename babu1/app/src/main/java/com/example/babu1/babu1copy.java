package com.example.babu1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class babu1copy extends AppCompatActivity {

    TextView dummy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babu1copy);
        dummy=(TextView) findViewById(R.id.textView4);
        Intent i2 = getIntent();
        String dum = i2.getStringExtra("key");
        dummy.setText("Hi, " + dum);
    }
}