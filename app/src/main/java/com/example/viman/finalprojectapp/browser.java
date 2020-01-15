package com.example.viman.finalprojectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class browser extends AppCompatActivity {
    Button b1,b2,b3;
    EditText e1;
    WebView w1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
        e1=(EditText)findViewById(R.id.editText3);
        b1=(Button)findViewById(R.id.button16);
        b2=(Button)findViewById(R.id.button17);
        b3=(Button)findViewById(R.id.button18);
        w1=(WebView)findViewById(R.id.webView);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(browser.this,list_of_fuction.class);
                startActivity(i);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                w1.loadUrl(s1);
                //now give permission to access internet in menifest.XML file present in app>src>main

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(browser.this,quick_access.class);
                startActivity(i);
                finish();
            }
        });


    }
}
