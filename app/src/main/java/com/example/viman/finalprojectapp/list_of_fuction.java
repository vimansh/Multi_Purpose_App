package com.example.viman.finalprojectapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class list_of_fuction extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_fuction);
        b1=(Button)findViewById(R.id.button6);
        b2=(Button)findViewById(R.id.button7);
        b3=(Button)findViewById(R.id.button8);
        b4=(Button)findViewById(R.id.button9);
        b5=(Button)findViewById(R.id.button10);
        b6=(Button)findViewById(R.id.button11);
        b7=(Button)findViewById(R.id.button41);
        b8=(Button)findViewById(R.id.button43);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(list_of_fuction.this,calculator.class);
                startActivity(i);
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(list_of_fuction.this,media_player.class);
                startActivity(i);
                finish();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(list_of_fuction.this,quizq1.class);
                startActivity(i);
                finish();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(list_of_fuction.this,browser.class);
                startActivity(i);
                finish();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(list_of_fuction.this,magical_mp.class);
                startActivity(i);
                finish();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(list_of_fuction.this,first.class);
                startActivity(i);
                finish();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(list_of_fuction.this,camera.class);
                startActivity(j);
                finish();
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(list_of_fuction.this,text_to_speech.class);
                startActivity(i);
                finish();
            }
        });

    }



}
