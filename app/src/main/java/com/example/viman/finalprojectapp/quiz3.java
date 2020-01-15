package com.example.viman.finalprojectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class quiz3 extends AppCompatActivity {
    TextView t1;
    RadioButton r1,r2,r3,r4;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        t1=(TextView)findViewById(R.id.textView5);
        r1=(RadioButton)findViewById(R.id.radioButton9);
        r2=(RadioButton)findViewById(R.id.radioButton10);
        r3=(RadioButton)findViewById(R.id.radioButton11);
        r4=(RadioButton)findViewById(R.id.radioButton12);
        b1=(Button)findViewById(R.id.button32);
        b2=(Button)findViewById(R.id.button33);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r1.isChecked())
                {
                    ++quizq1.s;
                }
                else
                {
                    --quizq1.s;
                }

                Intent i=new Intent(quiz3.this,quiz4.class);
                startActivity(i);
                finish();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(quiz3.this,quiz2.class);
                startActivity(i);
                finish();
            }
        });



    }
}
