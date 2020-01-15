package com.example.viman.finalprojectapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sign_up extends AppCompatActivity {
    Button b3,b4;
    EditText e3,e4,e5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        b3=(Button)findViewById(R.id.button39);
        b4=(Button)findViewById(R.id.button40);
        e3=(EditText)findViewById(R.id.editText6);
        e4=(EditText)findViewById(R.id.editText7);
        e5=(EditText)findViewById(R.id.editText8);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(sign_up.this,first.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e3.getText().toString();
                String s2=e4.getText().toString();
                String s3=e5.getText().toString();
                if (s1.equals("")||s2.equals("")||s3.equals(""))
                {
                    Toast.makeText(sign_up.this, "please enter the details", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    //create database
                    SQLiteDatabase data=openOrCreateDatabase("gh",MODE_PRIVATE,null);
                    //create table
                    data.execSQL("create table if not exists student(name varchar,email varchar,password varchar)");
                    //check if user already exist
                    String s4="select * from student where name='"+s1+"' and email='"+s2+"'";
                    //store database
                    Cursor cursor=data.rawQuery(s4,null);
                    //check if value of cursor existis
                    if (cursor.getCount()>0)
                    {
                        Toast.makeText(sign_up.this, "user exists", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        data.execSQL("insert into student values('"+s1+"','"+s2+"','"+s3+"')");
                        Toast.makeText(sign_up.this, "ho gaya", Toast.LENGTH_SHORT).show();
                        Intent j=new Intent(sign_up.this,first.class);
                        startActivity(j);
                        finish();
                    }

                }
            }
        });


    }
}
