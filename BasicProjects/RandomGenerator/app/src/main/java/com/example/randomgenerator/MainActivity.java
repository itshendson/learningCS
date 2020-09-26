package com.example.randomgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v4.os.IResultReceiver;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton = new Button(this);
    TextView resultsTextView = new TextView(this);
    SeekBar seekBar = new SeekBar(this);
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // This is what connects our layout (called activity_main.xml) with our activity/code

        //Assigning the resource id to a variable
        rollButton = findViewById(R.id.rollButton);
        resultsTextView = findViewById(R.id.resultsTextView);
        seekBar = findViewById(R.id.seekBar);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randInt = rand.nextInt(seekBar.getProgress()); //Generate a number between 0 and the seekbar
                resultsTextView.setText(randInt);
            }
        }); //weird syntax here
    }

}

