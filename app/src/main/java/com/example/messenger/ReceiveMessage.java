package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessage extends AppCompatActivity {

    TextView txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        txt1 = (TextView) findViewById(R.id.textView);

        txt1.setText("Hello "+getIntent().getStringExtra("NAME"));
    }
}