package com.example.custom_project5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton jungho;
    ImageButton jongseok;
    ImageButton youngjea;
    ImageButton soona;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jungho = (ImageButton)findViewById(R.id.imageView1);
        jongseok = (ImageButton)findViewById(R.id.imageView2);
        youngjea = (ImageButton)findViewById(R.id.imageView3);
        soona = (ImageButton)findViewById(R.id.imageView4);

        jungho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"팀장입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        jongseok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"팀원입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        youngjea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"팀원입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        soona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"팀원입니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}