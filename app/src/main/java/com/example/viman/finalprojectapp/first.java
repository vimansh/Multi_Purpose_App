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

public class first extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        b1=(Button)findViewById(R.id.button15);
        b2=(Button)findViewById(R.id.button38);
        e1=(EditText)findViewById(R.id.editText4);
        e2=(EditText)findViewById(R.id.editText5);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(first.this,sign_up.class);
                startActivity(i);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(first.this, "FILL ALL DETAILS", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("gh",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists student (name varchar,email varchar,password varchar)");
                    String s3="select * from student where email='"+s1+"' and password='"+s2+"' ";
                    Cursor cursor=data.rawQuery(s3,null);
                    if (cursor.getCount()>0)
                    {
                        Toast.makeText(first.this, "wait jaega jaega", Toast.LENGTH_SHORT).show();
                        Intent k=new Intent(first.this,list_of_fuction.class);
                        startActivity(k);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(first.this, "user don't exist or details are incorrect", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });
    }
}
