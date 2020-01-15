package com.example.viman.finalprojectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class quizq1 extends AppCompatActivity {
    TextView t1;
    RadioButton r1,r2,r3,r4;
    Button b1,b2;
    static int s=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizq1);
        t1=(TextView)findViewById(R.id.textView3);
        b1=(Button)findViewById(R.id.button28);
        b2=(Button)findViewById(R.id.button29);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        r4=(RadioButton)findViewById(R.id.radioButton4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r2.isChecked())
                {
                    ++s;
                }
                else
                {
                    --s;
                }
                Intent i=new Intent(quizq1.this,quiz2.class);
                startActivity(i);
                finish();
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(quizq1.this,list_of_fuction.class);
                startActivity(i);
                finish();
            }
        });



    }
}
