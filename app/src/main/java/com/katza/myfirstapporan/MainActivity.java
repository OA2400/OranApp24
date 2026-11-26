package com.katza.myfirstapporan;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;
import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    int count =0;
    int randomNumber;
    TextView guessTheNumber;
    EditText theGuess;
    Button btnSubmit;
    Button btnPlayAgain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
        guessTheNumber = findViewById(R.id.guessTheNumber);
        theGuess = findViewById(R.id.theGuess);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnPlayAgain = findViewById(R.id.btnPlayAgain);
        if (btnSubmit != null) {
            btnSubmit.setOnClickListener(this);
        }
        if (btnPlayAgain != null) {
            btnPlayAgain.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {if (view.getId() == R.id.btnPlayAgain) {
        count = 0;
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
        theGuess.setText("");
        btnPlayAgain.setVisibility(View.GONE);
        btnSubmit.setEnabled(true);
        Toast.makeText(this, "התחיל משחק חדש! בהצלחה", Toast.LENGTH_SHORT).show();
        return;
    }
        String userText = theGuess.getText().toString();
        if (userText.isEmpty()) {
            Toast.makeText(this, "נא להכניס מספר לפני הניחוש!", Toast.LENGTH_SHORT).show();
            return;
        }
        int guessNumber = Integer.parseInt(userText);
        if (guessNumber == randomNumber) {
            count++;
            String winMessage = getString(R.string.guessing_correct, count);
            Toast.makeText(MainActivity.this, winMessage, Toast.LENGTH_LONG).show();
            btnPlayAgain.setVisibility(View.VISIBLE);
            btnSubmit.setEnabled(false);
        }
        else if (guessNumber > randomNumber) {
            count++;
            Toast.makeText(this, R.string.to_high_guess, Toast.LENGTH_SHORT).show();
        }
        else {
            count++;
            Toast.makeText(this, R.string.to_low_guess, Toast.LENGTH_SHORT).show();
        }
    }
}
