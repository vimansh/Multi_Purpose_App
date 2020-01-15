package com.example.viman.finalprojectapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class google extends AppCompatActivity {
    Button b1;
    WebView w1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        b1=(Button)findViewById(R.id.button25);
        w1=(WebView)findViewById(R.id.webView3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(google.this,quick_access.class);
                startActivity(i);
                finish();
            }
        });

        w1.loadUrl("https://www.google.com.");

    }
}
