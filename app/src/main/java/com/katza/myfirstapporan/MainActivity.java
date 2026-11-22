package com.katza.myfirstapporan;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tvUserName;
    Button btnSendMessage;
    Button btnFollow;
    Button btnMakeRandom;
    Random randomNum = new Random();
    int min = 0;
    int max = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tvUserName = findViewById(R.id.tvUserName);
        btnSendMessage=findViewById(R.id.btnSendMessage);
        btnFollow = findViewById(R.id.btnFollow);

        btnFollow.setOnClickListener(this);
        btnSendMessage.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btnSendMessage) {
            Toast.makeText(this, R.string.opening_chat, Toast.LENGTH_SHORT).show();
        } else if (id == R.id.btnFollow) {
        Toast.makeText(this, R.string.started_following, Toast.LENGTH_SHORT).show();
        btnFollow.setText(R.string.following);
    }
    }
}