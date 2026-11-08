package com.katza.myfirstapporan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            actionButton = findViewById(R.id.actionButton);
            actionButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "oran", Toast.LENGTH_SHORT).show();
    }
}