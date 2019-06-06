package com.rucha.whatsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserPhoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_photo);

        Button next2 = (Button) findViewById(R.id.next2);

        next2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                openChats();
            }
        });
    }

    public void openChats(){
        Intent intent2 = new Intent(this,Chats.class);
        startActivity(intent2);
    }
}
