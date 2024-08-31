package com.agomez.pianoapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText re1, re2, mi, sol1, sol2, la1, la2, si;
    MediaPlayer mediaPlayerRE, mediaPlayerMI, mediaPlayerSOL, mediaPlayerLA, mediaPlayerSI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayerRE = MediaPlayer.create(this, R.raw.re);
        mediaPlayerMI = MediaPlayer.create(this, R.raw.mi);
        mediaPlayerSOL = MediaPlayer.create(this, R.raw.sol);
        mediaPlayerLA = MediaPlayer.create(this, R.raw.la);
        mediaPlayerSI = MediaPlayer.create(this, R.raw.si);
    }

    public void reproducir(View v) {
        int viewId = v.getId();
        if (viewId == R.id.re2) {
            mediaPlayerRE.start();
        } else if (viewId == R.id.mi) {
            mediaPlayerMI.start();
        } else if (viewId == R.id.sol2) {
            mediaPlayerSOL.start();
        } else if (viewId == R.id.la1 || viewId == R.id.la2) {
            mediaPlayerLA.start();
        } else if (viewId == R.id.si) {
            mediaPlayerSI.start();
        }
    }
}
