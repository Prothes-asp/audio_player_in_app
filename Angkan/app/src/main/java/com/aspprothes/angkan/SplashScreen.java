package com.aspprothes.angkan;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private Animation animation1,animation2;
    private Typeface typeface;
    private int progress;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EdgeToEdge.enable(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        progressBar = findViewById(R.id.progressBar);
        animation1 = AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        animation2 = AnimationUtils.loadAnimation(this,R.anim.up_from_bottom_slow);
        typeface = Typeface.createFromAsset(getAssets(),"fonts/monitor.ttf");

        textView.setTypeface(typeface);
        textView.setAnimation(animation2);
        imageView.setAnimation(animation1);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                startLoading();
                goHomePage();
            }
        });
        thread.start();


    }

    public void startLoading(){
        for (progress = 20; progress<=100; progress = progress + 20){
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void goHomePage(){
        Intent intent = new Intent(SplashScreen.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }

}