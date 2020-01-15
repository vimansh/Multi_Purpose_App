package com.example.viman.finalprojectapp;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class magical_mp extends AppCompatActivity implements SensorEventListener {

    TextView t1;
    Sensor s;
    SensorManager sm;
    MediaPlayer mp;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magical_mp);
        t1=(TextView)findViewById(R.id.textView2);
        mp=MediaPlayer.create(this,R.raw.b);
        b1=(Button)findViewById(R.id.button37);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);//this error is comming because
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(magical_mp.this,list_of_fuction.class);
                startActivity(i);
                finish();
            }
        });


    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.values[0]>5)
        {
            mp.start();
        }
        else
        {
            mp.pause();
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
