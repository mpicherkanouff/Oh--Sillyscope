package mpicherkanouff.ohsillyscope;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button playButton, stopButton;
    MediaPlayer player;
    byte[] songBytes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //find play and stop buttons
        playButton = (Button) findViewById(R.id.play_button);
        stopButton = (Button) findViewById(R.id.stop_button);

        //create mediaplayer
        player = MediaPlayer.create(this, R.raw.william_tell_overture);


    }

    public void playMusic (View view) {
        //if (!player.isPlaying()){
            player.start();
        //}
    }

    public void pauseMusic (View view) {
        //if (player.isPlaying()){
            player.pause();
        //}

    }

}
