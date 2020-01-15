package com.example.viman.finalprojectapp;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class text_to_speech extends AppCompatActivity {
    EditText e1;
    Button b1,b2;
    TextToSpeech t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech);
        e1=(EditText)findViewById(R.id.editText9);
        b1=(Button)findViewById(R.id.button44);
        b2=(Button)findViewById(R.id.button45);
        t1=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                t1.setLanguage(Locale.ENGLISH);
                t1.setSpeechRate(0.5f);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                t1.speak(s1,TextToSpeech.QUEUE_FLUSH,null);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(text_to_speech.this,list_of_fuction.class);
                startActivity(i);
                finish();
            }
        });


    }
}
