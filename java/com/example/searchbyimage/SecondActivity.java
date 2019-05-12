package com.example.searchbyimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private Button letgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        letgo=findViewById(R.id.letgo);
        letgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,"Please wait.", Toast.LENGTH_LONG).show();

                Intent intent=new Intent(SecondActivity.this,MainActivity.class);

                startActivity(intent);

            }
        });
    }
}
