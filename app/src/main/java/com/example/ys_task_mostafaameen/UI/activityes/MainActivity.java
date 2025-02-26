package com.example.ys_task_mostafaameen.UI.activityes;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.example.ys_task_mostafaameen.R;
import com.example.ys_task_mostafaameen.UI.activityes.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        LottieAnimationView animationView = findViewById(R.id.lottieAnimationView);

        animationView.setAnimation("chef-illus3.json");

        animationView.setTranslationY(300f);
        animationView.animate().translationY(0f).setDuration(1500);
        animationView.playAnimation();

        new Handler().postDelayed(() -> {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        }, 3000);

    }
}