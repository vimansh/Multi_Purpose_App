package com.example.viman.finalprojectapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class media_player extends AppCompatActivity {
    Button b1,b2,b3;
    MediaPlayer mp;
    ImageView im1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);
        b1=(Button)findViewById(R.id.button12);
        b2=(Button)findViewById(R.id.button13);
        b3=(Button)findViewById(R.id.button14);
        mp=MediaPlayer.create(this,R.raw.b);
        im1=(ImageView)findViewById(R.id.imageView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(media_player.this,list_of_fuction.class);
                startActivity(i);
                finish();
            }
        });

    }
}
