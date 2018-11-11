package com.example.ingredify;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //public static final String txt_okay1 = txt_okay;
    //public static final String txt_notOkay2 = txt_okay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //old button listener that plays sound instead of showing new windoww
      /*  final MediaPlayer okaySound = MediaPlayer.create(this, R.raw.positive);
        Button playOkaySound = (Button) this.findViewById(R.id.button);
        playOkaySound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                okaySound.start();
            }
        });

        final MediaPlayer notOkaySound = MediaPlayer.create(this,  R.raw.wrong);
        Button playNotOkaySound = (Button) this.findViewById(R.id.button2);
        playNotOkaySound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notOkaySound.start();
            }
        });
*/



    }

    //send OKAY
    public void sendOkay(View view){
        Intent intent = new Intent(this, DisplayOkay.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        //intent.putExtra(txt_okay1, message);
        startActivity(intent);
    }

    //send NOT OKAY
    public void sendNotOkay(View view){
        Intent intent = new Intent(this, DisplayNotOkay.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        //intent.putExtra(txt_notOkay2, message);
        startActivity(intent);
    }

    static final int REQUEST_IMAGE_CAPTURE = 1;
    //Send scan
    public void sendScan(View view){
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager())!= null){
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
        //startActivity(intent);
    }

    //player.stop();
}
