package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

Button b ;
EditText E ;
TextView v1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= (Button) findViewById(R.id.hbutton)  ;
        E=(EditText) findViewById(R.id.PersonName) ;
        v1= (TextView)findViewById(R.id.textView) ;

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = E.getText().toString();
                v1.setText("Hello" + s);

            }


    }); }}