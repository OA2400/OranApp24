package com.katza.myfirstapporan;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
Button actionButton;
Button yellowButton;
Switch swShowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            actionButton = findViewById(R.id.actionButton);
            actionButton.setOnClickListener(this);
            yellowButton=findViewById(R.id.yellowButton);
            yellowButton.setOnClickListener(this);
            swShowButton = findViewById(R.id.swShowButton);
            swShowButton.setOnCheckedChangeListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "oran", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(@NonNull CompoundButton compoundButton, boolean b) {
        if(b){
            actionButton.setVisibility(VISIBLE);
            Toast.makeText(this,"true", Toast.LENGTH_SHORT).show();

            yellowButton.setVisibility(VISIBLE);
            Toast.makeText(this,"true", Toast.LENGTH_SHORT).show();
        }
        else {
            actionButton.setVisibility(INVISIBLE);
            Toast.makeText(this,"true",Toast.LENGTH_SHORT).show();

            yellowButton.setVisibility(INVISIBLE);
            Toast.makeText(this,"true",Toast.LENGTH_SHORT).show();
        }
    }
}