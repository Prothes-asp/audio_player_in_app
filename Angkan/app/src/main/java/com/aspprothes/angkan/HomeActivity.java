package com.aspprothes.angkan;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class HomeActivity extends AppCompatActivity {
    private ImageView playerImgBtn1,playerImgBtn2,playerImgBtn3,playerImgBtn4,playerImgBtn5,playerImgBtn6;
    private LottieAnimationView animationView;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setStatusBarColor(getColor(R.color.barclr));
        this.getWindow().setNavigationBarColor(getColor(R.color.barclr));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeactivity);

        playerImgBtn1 = findViewById(R.id.playerImgBtn1);
        playerImgBtn2 = findViewById(R.id.playerImgBtn2);
        playerImgBtn3 = findViewById(R.id.playerImgBtn3);
        playerImgBtn4 = findViewById(R.id.playerImgBtn4);
        playerImgBtn5 = findViewById(R.id.playerImgBtn5);
        playerImgBtn6 = findViewById(R.id.playerImgBtn6);
        animationView = findViewById(R.id.animationView);


        // ====================== Player One Items Start Here =======================
        playerImgBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) mediaPlayer.release();

                if (playerImgBtn1.getTag() != null && playerImgBtn1.getTag().toString().contains("STOP")){
                    mediaPlayer = MediaPlayer.create(HomeActivity.this,R.raw.ton);
                    mediaPlayer.start();
                    playerImgBtn1.setTag("PLAY");
                    playerImgBtn1.setImageResource(R.drawable.stop);
                    animationView.playAnimation();
                    if (playerImgBtn2.getTag() != null && playerImgBtn2.getTag().toString().contains("PLAY") || playerImgBtn3.getTag() != null && playerImgBtn3.getTag().toString().contains("PLAY") || playerImgBtn4.getTag() != null && playerImgBtn4.getTag().toString().contains("PLAY") || playerImgBtn5.getTag() != null && playerImgBtn5.getTag().toString().contains("PLAY") || playerImgBtn6.getTag() != null && playerImgBtn6.getTag().toString().contains("PLAY")){
                        playerImgBtn2.setImageResource(R.drawable.play);
                        playerImgBtn2.setTag("STOP");
                        playerImgBtn3.setImageResource(R.drawable.play);
                        playerImgBtn3.setTag("STOP");
                        playerImgBtn4.setImageResource(R.drawable.play);
                        playerImgBtn4.setTag("STOP");
                        playerImgBtn5.setImageResource(R.drawable.play);
                        playerImgBtn5.setTag("STOP");
                        playerImgBtn6.setImageResource(R.drawable.play);
                        playerImgBtn6.setTag("STOP");
                    }
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            if (mediaPlayer != null) mediaPlayer.release();
                            playerImgBtn1.setImageResource(R.drawable.play);
                            playerImgBtn1.setTag("STOP");
                            animationView.cancelAnimation();
                        }
                    });

                }else{
                    if (mediaPlayer != null) mediaPlayer.release();
                    playerImgBtn1.setImageResource(R.drawable.play);
                    playerImgBtn1.setTag("STOP");
                    animationView.cancelAnimation();
                }

            }
        });

        // ====================== Player One Items End Here =======================

        // ====================== Player Two Items Start Here =======================
        playerImgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) mediaPlayer.release();

                if (playerImgBtn2.getTag() != null && playerImgBtn2.getTag().toString().contains("STOP")){
                    mediaPlayer = MediaPlayer.create(HomeActivity.this,R.raw.diditera);
                    mediaPlayer.start();
                    playerImgBtn2.setTag("PLAY");
                    playerImgBtn2.setImageResource(R.drawable.stop);
                    animationView.playAnimation();
                    if (playerImgBtn1.getTag() != null && playerImgBtn1.getTag().toString().contains("PLAY") || playerImgBtn3.getTag() != null && playerImgBtn3.getTag().toString().contains("PLAY") || playerImgBtn4.getTag() != null && playerImgBtn4.getTag().toString().contains("PLAY") || playerImgBtn5.getTag() != null && playerImgBtn5.getTag().toString().contains("PLAY") || playerImgBtn6.getTag() != null && playerImgBtn6.getTag().toString().contains("PLAY")){
                        playerImgBtn1.setImageResource(R.drawable.play);
                        playerImgBtn1.setTag("STOP");
                        playerImgBtn3.setImageResource(R.drawable.play);
                        playerImgBtn3.setTag("STOP");
                        playerImgBtn4.setImageResource(R.drawable.play);
                        playerImgBtn4.setTag("STOP");
                        playerImgBtn5.setImageResource(R.drawable.play);
                        playerImgBtn5.setTag("STOP");
                        playerImgBtn6.setImageResource(R.drawable.play);
                        playerImgBtn6.setTag("STOP");
                    }
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            if (mediaPlayer != null) mediaPlayer.release();
                            playerImgBtn2.setImageResource(R.drawable.play);
                            playerImgBtn2.setTag("STOP");
                            animationView.cancelAnimation();
                        }
                    });

                }else{
                    if (mediaPlayer != null) mediaPlayer.release();
                    playerImgBtn2.setImageResource(R.drawable.play);
                    playerImgBtn2.setTag("STOP");
                    animationView.cancelAnimation();
                }

            }
        });

        // ====================== Player Two Items End Here =======================

        // ====================== Player Three Items Start Here =======================
        playerImgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) mediaPlayer.release();

                if (playerImgBtn3.getTag() != null && playerImgBtn3.getTag().toString().contains("STOP")){
                    mediaPlayer = MediaPlayer.create(HomeActivity.this,R.raw.omarbondhugo);
                    mediaPlayer.start();
                    playerImgBtn3.setTag("PLAY");
                    playerImgBtn3.setImageResource(R.drawable.stop);
                    animationView.playAnimation();
                    if (playerImgBtn2.getTag() != null && playerImgBtn2.getTag().toString().contains("PLAY") || playerImgBtn1.getTag() != null && playerImgBtn1.getTag().toString().contains("PLAY") || playerImgBtn4.getTag() != null && playerImgBtn4.getTag().toString().contains("PLAY") || playerImgBtn5.getTag() != null && playerImgBtn5.getTag().toString().contains("PLAY") || playerImgBtn6.getTag() != null && playerImgBtn6.getTag().toString().contains("PLAY")){
                        playerImgBtn2.setImageResource(R.drawable.play);
                        playerImgBtn2.setTag("STOP");
                        playerImgBtn1.setImageResource(R.drawable.play);
                        playerImgBtn1.setTag("STOP");
                        playerImgBtn4.setImageResource(R.drawable.play);
                        playerImgBtn4.setTag("STOP");
                        playerImgBtn5.setImageResource(R.drawable.play);
                        playerImgBtn5.setTag("STOP");
                        playerImgBtn6.setImageResource(R.drawable.play);
                        playerImgBtn6.setTag("STOP");
                    }
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            if (mediaPlayer != null) mediaPlayer.release();
                            playerImgBtn3.setImageResource(R.drawable.play);
                            playerImgBtn3.setTag("STOP");
                            animationView.cancelAnimation();
                        }
                    });

                }else{
                    if (mediaPlayer != null) mediaPlayer.release();
                    playerImgBtn3.setImageResource(R.drawable.play);
                    playerImgBtn3.setTag("STOP");
                    animationView.cancelAnimation();
                }

            }
        });

        // ====================== Player Three Items End Here =======================


        // ====================== Player Four Items Start Here =======================
        playerImgBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) mediaPlayer.release();

                if (playerImgBtn4.getTag() != null && playerImgBtn4.getTag().toString().contains("STOP")){
                    mediaPlayer = MediaPlayer.create(HomeActivity.this,R.raw.sajan);
                    mediaPlayer.start();
                    playerImgBtn4.setTag("PLAY");
                    playerImgBtn4.setImageResource(R.drawable.stop);
                    animationView.playAnimation();
                    if (playerImgBtn2.getTag() != null && playerImgBtn2.getTag().toString().contains("PLAY") || playerImgBtn1.getTag() != null && playerImgBtn1.getTag().toString().contains("PLAY") || playerImgBtn3.getTag() != null && playerImgBtn3.getTag().toString().contains("PLAY") || playerImgBtn5.getTag() != null && playerImgBtn5.getTag().toString().contains("PLAY") || playerImgBtn6.getTag() != null && playerImgBtn6.getTag().toString().contains("PLAY")){
                        playerImgBtn2.setImageResource(R.drawable.play);
                        playerImgBtn2.setTag("STOP");
                        playerImgBtn1.setImageResource(R.drawable.play);
                        playerImgBtn1.setTag("STOP");
                        playerImgBtn3.setImageResource(R.drawable.play);
                        playerImgBtn3.setTag("STOP");
                        playerImgBtn5.setImageResource(R.drawable.play);
                        playerImgBtn5.setTag("STOP");
                        playerImgBtn6.setImageResource(R.drawable.play);
                        playerImgBtn6.setTag("STOP");
                    }
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            if (mediaPlayer != null) mediaPlayer.release();
                            playerImgBtn4.setImageResource(R.drawable.play);
                            playerImgBtn4.setTag("STOP");
                            animationView.cancelAnimation();
                        }
                    });

                }else{
                    if (mediaPlayer != null) mediaPlayer.release();
                    playerImgBtn4.setImageResource(R.drawable.play);
                    playerImgBtn4.setTag("STOP");
                    animationView.cancelAnimation();
                }

            }
        });

        // ====================== Player Four Items End Here =======================


        // ====================== Player Five Items Start Here =======================
        playerImgBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) mediaPlayer.release();

                if (playerImgBtn5.getTag() != null && playerImgBtn5.getTag().toString().contains("STOP")){
                    mediaPlayer = MediaPlayer.create(HomeActivity.this,R.raw.saatjonom);
                    mediaPlayer.start();
                    playerImgBtn5.setTag("PLAY");
                    playerImgBtn5.setImageResource(R.drawable.stop);
                    animationView.playAnimation();
                    if (playerImgBtn2.getTag() != null && playerImgBtn2.getTag().toString().contains("PLAY") || playerImgBtn1.getTag() != null && playerImgBtn1.getTag().toString().contains("PLAY") || playerImgBtn3.getTag() != null && playerImgBtn3.getTag().toString().contains("PLAY") || playerImgBtn4.getTag() != null && playerImgBtn4.getTag().toString().contains("PLAY") || playerImgBtn6.getTag() != null && playerImgBtn6.getTag().toString().contains("PLAY")){
                        playerImgBtn2.setImageResource(R.drawable.play);
                        playerImgBtn2.setTag("STOP");
                        playerImgBtn1.setImageResource(R.drawable.play);
                        playerImgBtn1.setTag("STOP");
                        playerImgBtn3.setImageResource(R.drawable.play);
                        playerImgBtn3.setTag("STOP");
                        playerImgBtn4.setImageResource(R.drawable.play);
                        playerImgBtn4.setTag("STOP");
                        playerImgBtn6.setImageResource(R.drawable.play);
                        playerImgBtn6.setTag("STOP");
                    }
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            if (mediaPlayer != null) mediaPlayer.release();
                            playerImgBtn5.setImageResource(R.drawable.play);
                            playerImgBtn5.setTag("STOP");
                            animationView.cancelAnimation();
                        }
                    });

                }else{
                    if (mediaPlayer != null) mediaPlayer.release();
                    playerImgBtn5.setImageResource(R.drawable.play);
                    playerImgBtn5.setTag("STOP");
                    animationView.cancelAnimation();
                }

            }
        });

        // ====================== Player Five Items End Here =======================


        // ====================== Player Six Items Start Here =======================
        playerImgBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) mediaPlayer.release();

                if (playerImgBtn6.getTag() != null && playerImgBtn6.getTag().toString().contains("STOP")){
                    mediaPlayer = MediaPlayer.create(HomeActivity.this,R.raw.jhakaldikhalja);
                    mediaPlayer.start();
                    playerImgBtn6.setTag("PLAY");
                    playerImgBtn6.setImageResource(R.drawable.stop);
                    animationView.playAnimation();
                    if (playerImgBtn2.getTag() != null && playerImgBtn2.getTag().toString().contains("PLAY") || playerImgBtn1.getTag() != null && playerImgBtn1.getTag().toString().contains("PLAY") || playerImgBtn3.getTag() != null && playerImgBtn3.getTag().toString().contains("PLAY") || playerImgBtn4.getTag() != null && playerImgBtn4.getTag().toString().contains("PLAY") || playerImgBtn5.getTag() != null && playerImgBtn5.getTag().toString().contains("PLAY")){
                        playerImgBtn2.setImageResource(R.drawable.play);
                        playerImgBtn2.setTag("STOP");
                        playerImgBtn1.setImageResource(R.drawable.play);
                        playerImgBtn1.setTag("STOP");
                        playerImgBtn3.setImageResource(R.drawable.play);
                        playerImgBtn3.setTag("STOP");
                        playerImgBtn4.setImageResource(R.drawable.play);
                        playerImgBtn4.setTag("STOP");
                        playerImgBtn5.setImageResource(R.drawable.play);
                        playerImgBtn5.setTag("STOP");
                    }
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            if (mediaPlayer != null) mediaPlayer.release();
                            playerImgBtn6.setImageResource(R.drawable.play);
                            playerImgBtn6.setTag("STOP");
                            animationView.cancelAnimation();
                        }
                    });

                }else{
                    if (mediaPlayer != null) mediaPlayer.release();
                    playerImgBtn6.setImageResource(R.drawable.play);
                    playerImgBtn6.setTag("STOP");
                    animationView.cancelAnimation();
                }

            }
        });

        // ====================== Player Six Items End Here =======================

    }





    // ======================  Menu Show start here =====================
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.youTubeId){
            if ( playerImgBtn1.getTag() != null && playerImgBtn1.getTag().toString().contains("PLAY") || playerImgBtn2.getTag() != null && playerImgBtn2.getTag().toString().contains("PLAY") || playerImgBtn3.getTag() != null && playerImgBtn3.getTag().toString().contains("PLAY") || playerImgBtn4.getTag() != null && playerImgBtn4.getTag().toString().contains("PLAY") || playerImgBtn5.getTag() != null && playerImgBtn5.getTag().toString().contains("PLAY") || playerImgBtn6.getTag() != null && playerImgBtn6.getTag().toString().contains("PLAY")){
                if (mediaPlayer != null ) mediaPlayer.release();
                playerImgBtn1.setTag("STOP");
                playerImgBtn2.setTag("STOP");
                playerImgBtn3.setTag("STOP");
                playerImgBtn4.setTag("STOP");
                playerImgBtn5.setTag("STOP");
                playerImgBtn6.setTag("STOP");
                playerImgBtn1.setImageResource(R.drawable.play);
                playerImgBtn2.setImageResource(R.drawable.play);
                playerImgBtn3.setImageResource(R.drawable.play);
                playerImgBtn4.setImageResource(R.drawable.play);
                playerImgBtn5.setImageResource(R.drawable.play);
                playerImgBtn6.setImageResource(R.drawable.play);
                animationView.cancelAnimation();
            }
            Intent intent = new Intent(HomeActivity.this, YouTubeSongPlayList.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.settingId){
            Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.privacyId){
            Toast.makeText(this, "Privacy", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.contactId){
            Toast.makeText(this, "Contact", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.searchId){
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.shareId){
            Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


    // ======================  Menu Show End here =====================

    // ======================  On back pressed method start here =====================
    /** @noinspection deprecation*/
    @Override
    public void onBackPressed() {
        if (isTaskRoot()){
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setTitle("Warning !!!")
                    .setMessage("Do you want to exit this app ?")
                    .setIcon(R.drawable.alert_orange)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            if (mediaPlayer != null)mediaPlayer.release();
                            dialog.dismiss();
                            finishAndRemoveTask();
                            finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .show();
            alertDialog.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(getColor(R.color.barclr));
            alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE).setTextColor(getColor(R.color.barclr));

        }else{
            super.onBackPressed();
        }
    }
    // ======================  On back pressed method End here =====================


}