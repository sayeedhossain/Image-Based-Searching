package com.example.searchbyimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private Button startButton;
    private ImageView helpImage,about,feedback,share,arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        startButton=findViewById(R.id.startButton);
        helpImage=findViewById(R.id.helpImageviewId);
        about=findViewById(R.id.aboutviewId);
        feedback=findViewById(R.id.feedbackId);
        share=findViewById(R.id.shareId);
        arrow=findViewById(R.id.arrowImageViewId);


        startButton.setOnClickListener(this);
        helpImage.setOnClickListener(this);
        about.setOnClickListener(this);
        feedback.setOnClickListener(this);
        share.setOnClickListener(this);




    }



    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.startButton){
            Toast.makeText(MainActivity2.this,"Start button is clicked.",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity2.this,SecondActivity.class);

            startActivity(intent);

        }
        else if(v.getId()==R.id.helpImageviewId) {
            Toast.makeText(MainActivity2.this,"Help is clicked.",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity2.this,HelpActivity.class);

            startActivity(intent);

        }
        else if(v.getId()==R.id.aboutviewId) {
            Toast.makeText(MainActivity2.this,"About button is clicked.",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity2.this,AboutMeActivity.class);

            startActivity(intent);

        } else if(v.getId()==R.id.feedbackId) {
            Toast.makeText(MainActivity2.this, "Feedback is clicked.", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity2.this, FeedBackActivity.class);

            startActivity(intent);

        }
        else if(v.getId()==R.id.shareId) {
            Toast.makeText(getApplicationContext(),"Share  is clicked",Toast.LENGTH_SHORT).show();

            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String subject="Internet Live Stats";
            String body="this app is very useful to know information about any unknown or known images..\ncom.example.searchbyimage";
            // here (com.example.searchbyimage )is package name
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(intent,"share with"));

        }
        else if(v.getId()==R.id.arrowImageViewId){

            Toast.makeText(getApplicationContext(),"please touch on the beside images.",Toast.LENGTH_SHORT).show();
        }



    }
}
