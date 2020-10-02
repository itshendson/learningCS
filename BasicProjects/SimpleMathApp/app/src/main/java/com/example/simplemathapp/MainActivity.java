package com.example.simplemathapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);
        final EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
        final EditText secondNumEditText = (EditText) findViewById(R.id.SecondNumEditText);
        final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(firstNumEditText.getText().toString()); //Convert the text in EditText then convert it to String then convert it to integer
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());

                int result = num1 + num2;

                resultTextView.setText(""+result);
            }
        });
    }
}
