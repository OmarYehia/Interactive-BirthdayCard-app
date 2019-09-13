package com.example.android.birthdaycard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(MainActivity.this, R.raw.hbdsong);
        mp.start();

        Bundle b = getIntent().getExtras();

        String user = b.getString("userName");
        String friend = b.getString("friendName");

        TextView hbd = (TextView) findViewById(R.id.hBd);
        hbd.setText(friend);

        TextView coming = (TextView) findViewById(R.id.from);
        coming.setText(user);
    }

    public void pause(View v) {
        mp.pause();
    }
}
