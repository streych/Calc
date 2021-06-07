package com.example.calculator_constraint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY);
    }
    private TextView textWork;
    private TextView resultWork;
    private double result = 0;
    private ArrayList<String> operation = new ArrayList<>();
    private final int[] numberButtons;
    {
        numberButtons = new int[]{R.id._0, R.id._1, R.id._2, R.id._3, R.id._4, R.id._5,
                R.id._6, R.id._7, R.id._8, R.id._9, R.id.percent, R.id.plus, R.id.minus, R.id.del, R.id.dele, R.id.C, R.id.umno, R.id.dote, R.id.ravno};
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textWork = findViewById(R.id.text_info);
        resultWork = findViewById(R.id.result);


        setNumberButtonsListeners();

    }

    private void ViewArray(ArrayList<String> operation){
        for (int i = 0; i < operation.size(); i++){
            textWork.setText(operation.get(i));
        }
    }



    private void setNumberButtonsListeners(){
        for(int i = 0; i < numberButtons.length; i++){
            Button btn = findViewById(numberButtons[i]);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textWork.setText(String.format("%s%s", textWork.getText(), btn.getText().toString()));
                }
            });
        }
    }



}