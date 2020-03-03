package com.example.optioncall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    TextView song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        song =(TextView)findViewById(R.id.song);

        song.setTypeface(Typeface.createFromAsset(getAssets(),"Lemonada-Bold.ttf"));
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.animtion);
        song.startAnimation(myanim);
        final Intent intent=new Intent(this,MainActivity.class);
        Thread timer=new Thread(){
            public void run()
            {
                try
                {
                    sleep(5000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();

                }
                finally {
                  startActivity(new Intent(SplashScreen.this,MainActivity.class));
                  finish();

                }
            }

        };
        timer.start();

    }
}
