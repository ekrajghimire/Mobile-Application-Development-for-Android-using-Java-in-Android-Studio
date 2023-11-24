package com.example.audioapi;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity { MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); }
    public void play(View view){
        if(player == null){
            player = MediaPlayer.create(this,R.raw.raw);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            }); }
        player.start();
    }
    public void pause(View view){
        if(player != null){
            player.pause();
        }
    }
    public void stop(View view){
        player.stop();
    }
    public void stopPlayer(){
        if(player != null){
            player.release();
            player = null; Toast.makeText(this,"Player Released",Toast.LENGTH_SHORT).show(); }
        }
        protected void onStop(){
            super.onStop();
            stopPlayer();

        } }