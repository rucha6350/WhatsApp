package com.rucha.whatsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.rucha.whatsapp.R;

public class NumberPage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_page);

        Button next1 = (Button) findViewById(R.id.next1);

        Spinner numspinner = (Spinner) findViewById(R.id.numberspinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(NumberPage.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.number));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        numspinner.setAdapter(myAdapter);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openUserPhoto();

            }

        });
    }

    public void openUserPhoto(){
        Intent intent1 =new Intent(NumberPage.this, UserPhoto.class);
        startActivity(intent1);
    }
}
