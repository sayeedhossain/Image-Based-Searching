package com.example.searchbyimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedBackActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nameText, feedBackText,emailText;
    private Button sendButton, clearButton;

    // after change code position to set everything  press alt+ctrl+l (don't understand? show 4.24 video from anisul islam)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);

        nameText =findViewById(R.id.nameEditTextId);
        emailText=findViewById(R.id.emailEditTextId);
        feedBackText =findViewById(R.id.feedBackEditTextId);

        sendButton =findViewById(R.id.sendButtonId);
        clearButton =findViewById(R.id.clearButtonId);

        sendButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        try {
            String name = nameText.getText().toString();
            String feedback = feedBackText.getText().toString();
            String email=emailText.getText().toString();
            if (v.getId() == R.id.sendButtonId) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"sayeedhatim@gmail.com"});

                intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback from app");
                intent.putExtra(Intent.EXTRA_TEXT, "name : " + name + "\n message: " + feedback);
                intent.putExtra(Intent.EXTRA_TEXT, "email : " + email + "\n message: " + feedback);
                startActivity(Intent.createChooser(intent, "Feedback with"));
            } else if (v.getId() == R.id.clearButtonId)

            {
                nameText.setText("");
                emailText.setText("");
                feedBackText.setText("");

            }


        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),"Exception : "+e,Toast.LENGTH_SHORT).show();

        }


    }
}
