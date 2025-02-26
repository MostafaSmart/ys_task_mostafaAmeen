package com.example.ys_task_mostafaameen.UI.activityes;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.ys_task_mostafaameen.MVVM.ModelFactory.AuthViewModelFactory;
import com.example.ys_task_mostafaameen.MVVM.ViewModels.AuthModelView;
import com.example.ys_task_mostafaameen.R;
import com.example.ys_task_mostafaameen.data.Api.RequestModels.LoginRequest;
import com.example.ys_task_mostafaameen.data.Api.RequestModels.LoginResponse;
import com.example.ys_task_mostafaameen.data.Api.RequestModels.Valuem;
import com.example.ys_task_mostafaameen.data.Repositorys.LoginRepository;
import com.example.ys_task_mostafaameen.data.Room.Entity.UserDataRoom;
import com.example.ys_task_mostafaameen.data.Room.Helpers.UserDatabaseHelper;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {
    private List<CardView> pinIndicators = new ArrayList<>();
    private StringBuilder pinCode = new StringBuilder();
    private static final int PIN_LENGTH = 6;
    private ImageButton deleteButton;
    private  android.widget.Button btnDoLogin;
    private   ImageButton exitButton;
    private AuthModelView authViewModel ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        LoginRepository userRepository = new LoginRepository(this);
        AuthViewModelFactory authViewModelFactory = new AuthViewModelFactory(userRepository);

        authViewModel = new ViewModelProvider(this,authViewModelFactory).get(AuthModelView.class);

        UserDatabaseHelper dbHelper = new UserDatabaseHelper(this);

        imelmnt();

        setupNumberButtons();


        deleteButton.setOnClickListener(v -> removeLastDigit());

        exitButton.setOnClickListener(v -> finish());


        setResponseListionr();

        btnDoLogin.setOnClickListener(v ->
        {


            if (pinCode.length() == PIN_LENGTH) {
                String enteredPin = pinCode.toString();
                Valuem valuem = new Valuem("87","1",enteredPin);
                LoginRequest loginRequest = new LoginRequest(valuem);
                authViewModel.login(loginRequest);
            }
        });

        new Thread(() -> {
            UserDataRoom retrievedUser = dbHelper.getUserById("123");
            if (retrievedUser != null) {
                Log.d("DATABASE", "User Retrieved: " + retrievedUser.toString());
            } else {
                Log.d("DATABASE", "User not found");
            }
        }).start();


    }
    private void setResponseListionr(){
        authViewModel.getLoginResponse().observe(this, sectionResponse -> {
            if (sectionResponse != null ) {

                Log.d("result" ,sectionResponse.toString());
                Intent intent = new Intent(this,HomeActivity.class);
                startActivity(intent);
                finish();

            } else {


                Toast.makeText(this, "فشل في", Toast.LENGTH_SHORT).show();

            }
        });
    }
    private void imelmnt() {
        pinIndicators.add(findViewById(R.id.card1));
        pinIndicators.add(findViewById(R.id.card2));
        pinIndicators.add(findViewById(R.id.card3));
        pinIndicators.add(findViewById(R.id.card4));
        pinIndicators.add(findViewById(R.id.card5));
        pinIndicators.add(findViewById(R.id.card6));

        deleteButton  = findViewById(R.id.deleteButton);
        exitButton = findViewById(R.id.exitButton);
        btnDoLogin = findViewById(R.id.btnDoLogin);

    }
    private void setupNumberButtons() {
        int[] buttonIds = {
                R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
                R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9
        };

        for (int id : buttonIds) {
            android.widget.Button button = findViewById(id);
            button.setOnClickListener(v -> appendDigit(button.getText().toString()));
        }
    }

    private void appendDigit(String digit) {
        if (pinCode.length() < PIN_LENGTH) {
            pinCode.append(digit);
            updateIndicators();

            if (pinCode.length() == PIN_LENGTH) {
//                validatePin();
            }
        }
    }

    private void updateIndicators() {
        for (int i = 0; i < PIN_LENGTH; i++) {
            if (i < pinCode.length()) {
                pinIndicators.get(i).setCardBackgroundColor(ContextCompat.getColor(this, R.color.primmery));
            } else {
                pinIndicators.get(i).setCardBackgroundColor(ContextCompat.getColor(this, R.color.lite_blue));
            }
        }
    }
    private void removeLastDigit() {
        if (pinCode.length() > 0) {
            pinCode.deleteCharAt(pinCode.length() - 1);
            updateIndicators();
        }
    }
    private void validatePin() {
        String enteredPin = pinCode.toString();
        if (enteredPin.equals("123456")) {
        } else {
            pinCode.setLength(0);
            updateIndicators();
        }
    }
}