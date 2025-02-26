package com.example.ys_task_mostafaameen;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

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

//        // الانتقال إلى الشاشة الرئيسية بعد 3 ثوانٍ
//        new Handler().postDelayed(() -> {
//            startActivity(new Intent(SplashActivity.this, MainActivity.class));
//            finish();
//        }, 3000);

    }
}