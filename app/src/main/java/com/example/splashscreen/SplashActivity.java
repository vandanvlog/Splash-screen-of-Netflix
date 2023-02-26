package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SplashActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

      textView = findViewById(R.id.idSplashTv);

        // Create alpha animation
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(50000); // 1 second

// Create translate animation
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 00, 200, 0);
        translateAnimation.setDuration(4000); // 1 second

// Create animation set
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);

// Apply animation set to view
        textView.startAnimation(animationSet);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iMain = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(iMain);
                finish();
            }
        },5000);


    }
}