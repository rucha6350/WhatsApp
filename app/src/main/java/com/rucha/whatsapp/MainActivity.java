package com.rucha.whatsapp;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.rucha.whatsapp.R;

public class MainActivity extends AppCompatActivity {

    private Handler mHandler = new Handler();

    ImageView whatsapp;
    Button whatsApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        whatsapp = (ImageView) findViewById(R.id.whatsapp);
        whatsApp = (Button) findViewById(R.id.whatsApp);

        whatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
                whatsapp.startAnimation(animation);
                mHandler.postDelayed(mToastRunnable,1000);
            }

        });

    }

    public void openNumberPage(){
        Intent intent=new Intent(MainActivity.this, NumberPage.class);
        startActivity(intent);
    }

    private Runnable mToastRunnable = new Runnable() {
        @Override
        public void run() {
            openNumberPage();
        }
    };
}
