package com.kevin.mycalc;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, n00, plus, ac, input;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
        n7 = findViewById(R.id.n7);
        n8 = findViewById(R.id.n8);
        n9 = findViewById(R.id.n9);
        n0 = findViewById(R.id.n0);
        n00 = findViewById(R.id.n00);
        plus = findViewById(R.id.plus);
        input = findViewById(R.id.input);
        ac = findViewById(R.id.ac);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
                num1 = num2;
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String get = input.getText().toString();
                input.setText(get+"1");
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String get = input.getText().toString();
                input.setText(get+"2");
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String get = input.getText().toString();
                input.setText(get+"3");
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String get = input.getText().toString();
                input.setText(get+"4");
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String get = input.getText().toString();
                input.setText(get+"5");
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String get = input.getText().toString();
                input.setText(get+"6");
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String get = input.getText().toString();
                input.setText(get+"7");
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String get = input.getText().toString();
                input.setText(get+"8");
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String get = input.getText().toString();
                input.setText(get+"9");
            }
        });

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String get = input.getText().toString();
                input.setText(get+"0");
            }
        });

        n00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String get = input.getText().toString();
                input.setText(get+"00");
            }
        });

    }
}