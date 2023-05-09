package com.suarakucing;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private static final String isPlaying = "Media is Playing";

    MediaPlayer player;
    Button b1, b2, b3, b4, b5, b6, b7, b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                        "You Press Button MEOW 1", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.darkprimary));
                snackbar.show();
                playSound(1);
            }
        });

        b2=findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                        "You Press Button MEOW 2", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.darkprimary));
                snackbar.show();
                playSound(2);
            }
        });

        b3=findViewById(R.id.btn3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                        "You Press Button MEOW 3", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.darkprimary));
                snackbar.show();
                playSound(3);
            }
        });

        b4=findViewById(R.id.btn4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                        "You Press Button MEOW 4", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.darkprimary));
                snackbar.show();
                playSound(4);
            }
        });

        b5=findViewById(R.id.btn5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                        "You Press Button MEOW 5", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.darkprimary));
                snackbar.show();
                playSound(5);
            }
        });

        b6=findViewById(R.id.btn6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                        "You Press Button MEOW 6", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.darkprimary));
                snackbar.show();
                playSound(6);
            }
        });

        b7=findViewById(R.id.btn7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                        "You Press Button MEOW 7", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.darkprimary));
                snackbar.show();
                playSound(7);
            }
        });

        b8=findViewById(R.id.btn8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content),
                        "You Press Button MEOW 8", Snackbar.LENGTH_SHORT);
                snackbar.getView().setBackgroundColor(getResources().getColor(R.color.darkprimary));
                snackbar.show();
                playSound(8);
            }
        });
    }

    private void playSound(int arg){
        try {
            if (player.isPlaying()){
                player.stop();
                player.release();
            }
        }catch (Exception e){
        }
        if (arg == 1) {
            player = MediaPlayer.create(this, R.raw.kucing1);
        }
        if (arg == 2) {
            player = MediaPlayer.create(this, R.raw.kucing2);
        }
        if (arg == 3) {
            player = MediaPlayer.create(this, R.raw.kucing3);
        }
        if (arg == 4) {
            player = MediaPlayer.create(this, R.raw.kucing4);
        }
        if (arg == 5) {
            player = MediaPlayer.create(this, R.raw.kucing5);
        }
        if (arg == 6) {
            player = MediaPlayer.create(this, R.raw.kucing6);
        }
        if (arg == 7) {
            player = MediaPlayer.create(this, R.raw.kucing7);
        }
        if (arg == 8) {
            player = MediaPlayer.create(this, R.raw.kucing8);
        }
        player.setLooping(false);
        player.start();
    }
}