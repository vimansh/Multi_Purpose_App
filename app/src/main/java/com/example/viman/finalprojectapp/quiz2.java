package com.example.viman.finalprojectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class quiz2 extends AppCompatActivity {
    TextView t1;
    RadioButton r1,r2,r3,r4;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        t1=(TextView)findViewById(R.id.textView4);
        r1=(RadioButton)findViewById(R.id.radioButton5);
        r2=(RadioButton)findViewById(R.id.radioButton6);
        r3=(RadioButton)findViewById(R.id.radioButton7);
        r4=(RadioButton)findViewById(R.id.radioButton8);
        b1=(Button)findViewById(R.id.button30);
        b2=(Button)findViewById(R.id.button31);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r3.isChecked())
                {
                    ++quizq1.s;

                }
                else
                {
                    --quizq1.s;
                }
                Intent i=new Intent(quiz2.this,quiz3.class);
                startActivity(i);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(quiz2.this,quizq1.class);
                startActivity(i);
                finish();
            }
        });


    }
}
