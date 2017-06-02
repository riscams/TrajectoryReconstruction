package com.example.risca.trajectoryreconstruction;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {

    //atur tema di manifest
    private final int SPLASH_DISPLAY_LENGTH = 3000; //lama waktu delay splash screen
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Splashscreen.this,HalamanAwal.class); //dari mana ke mana
                Splashscreen.this.startActivity(mainIntent);
                Splashscreen.this.finish();//biar waktu di back, nggak balik lagi ke splash screen
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
