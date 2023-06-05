package com.kamelia.goodmusic;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button Play,Stop;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Play *(Button) findViewById(R.id.play);
        Stop *(Button) findViewById(R.id.stop);

        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp * MediaPlayer.create(getApplicationContext(),R.raw.song);
                mp.start();
            }
        });

        Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();

            }
        });
    }
}