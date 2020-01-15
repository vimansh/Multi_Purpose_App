package com.example.viman.finalprojectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class quizresult extends AppCompatActivity {
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizresult);
        t1=(TextView)findViewById(R.id.textView7);
        b1=(Button)findViewById(R.id.button36);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(quizresult.this,list_of_fuction.class);
                startActivity(i);
                finish();
            }
        });

        t1.setText("score="+quizq1.s);

    }
}
