package com.example.viman.finalprojectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class quiz4 extends AppCompatActivity {
    TextView t1;
    Button b1,b2;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        t1=(TextView)findViewById(R.id.textView6);
        b1=(Button)findViewById(R.id.button34);
        b2=(Button)findViewById(R.id.button35);
        r1=(RadioButton)findViewById(R.id.radioButton13);
        r2=(RadioButton)findViewById(R.id.radioButton14);
        r3=(RadioButton)findViewById(R.id.radioButton15);
        r4=(RadioButton)findViewById(R.id.radioButton16);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r2.isChecked())
                {
                    ++quizq1.s;
                }
                else
                {
                    --quizq1.s;
                }
                Intent i=new Intent(quiz4.this,quizresult.class);
                startActivity(i);
                finish();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(quiz4.this,quiz3.class);
                startActivity(i);
                finish();
            }
        });


    }
}
