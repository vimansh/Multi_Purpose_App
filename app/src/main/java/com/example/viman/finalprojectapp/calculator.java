package com.example.viman.finalprojectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    EditText e1,e2;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        t1=(TextView)findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1+f2;
                String s3=Float.toString(f3);
                t1.setText(s3);
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1-f2;
                String s3=Float.toString(f3);
                t1.setText(s3);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1*f2;
                String s3=Float.toString(f3);
                t1.setText(s3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1/f2;
                String s3=Float.toString(f3);
                t1.setText(s3);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(calculator.this,list_of_fuction.class);
                startActivity(i);
                finish();
            }
        });

    }
}
