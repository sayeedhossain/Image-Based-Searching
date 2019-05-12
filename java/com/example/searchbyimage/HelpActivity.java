package com.example.searchbyimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HelpActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button englishButton,banglaButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        englishButton=findViewById(R.id.englishHelpId);
        banglaButton=findViewById(R.id.banglaHelpId);

        englishButton.setOnClickListener(this);
        banglaButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.englishHelpId){
            Toast.makeText(HelpActivity.this,"Converting in English.",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(HelpActivity.this,EnglishHelpActivity.class);

            startActivity(intent);

        }
        else if(v.getId()==R.id.banglaHelpId){
            Toast.makeText(HelpActivity.this,"বাংলায় রূপান্তর.",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(HelpActivity.this,BanglaHelpActivity.class);

            startActivity(intent);

        }

    }
}
