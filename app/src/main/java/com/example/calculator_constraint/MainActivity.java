package com.example.calculator_constraint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textWork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textWork = findViewById(R.id.text_info);

        InitBtnPercent();
        InitBtnC();
        InitBtnDelete();
        InitBtnDel();
        InitBtn7();
        InitBtn8();
        InitBtn9();
        InitBtnUmno();
        InitBtn4();
        InitBtn5();
        InitBtn6();
        InitBtnMinus();
        InitBtn1();
        InitBtn2();
        InitBtn3();
        InitBtnPlus();
        InitBtn0();
        InitBtnDote();
        InitBtnRavno();


    }


    private void InitBtnPercent(){
        Button btn_percent = findViewById(R.id.percent);
        btn_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%s", "%"));
            }
        });
    }

    private void InitBtnC(){
        Button btn_c = findViewById(R.id.C);
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%s", "элемент назад"));
            }
        });
    }

    private void InitBtnDelete(){
        Button btn_delete = findViewById(R.id.del);
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%s", ""));
            }
        });
    }

    private void InitBtnDel(){
        Button btn_del = findViewById(R.id.dele);
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%s", "/"));
            }
        });
    }

    private void InitBtn7(){
        Button btn_7 = findViewById(R.id._7);
        btn_7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%d", 7));
            }
        });
    }

    private void InitBtn8(){
        Button btn_8 = findViewById(R.id._8);
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%d", 8));
            }
        });
    }

    private void InitBtn9(){
        Button btn_9 = findViewById(R.id._9);
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%d", 9));
            }
        });
    }

    private void InitBtnUmno(){
        Button btn_umno = findViewById(R.id.umno);
        btn_umno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%s", "*"));
            }
        });
    }

    private void InitBtn4(){
        Button btn_4 = findViewById(R.id._4);
        btn_4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%d", 4));
            }
        });
    }

    private void InitBtn5(){
        Button btn_5 = findViewById(R.id._5);
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%d", 5));
            }
        });
    }

    private void InitBtn6(){
        Button btn_6 = findViewById(R.id._6);
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%d", 6));
            }
        });
    }

    private void InitBtnMinus(){
        Button btn_minus = findViewById(R.id.minus);
        btn_minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%s", "-"));
            }
        });
    }

    private void InitBtn1(){
        Button btn_1 = findViewById(R.id._1);
        btn_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%d", 1));
            }
        });
    }

    private void InitBtn2(){
        Button btn_2 = findViewById(R.id._2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%d", 2));
            }
        });
    }

    private void InitBtn3(){
        Button btn_3 = findViewById(R.id._3);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%d", 3));
            }
        });
    }

    private void InitBtnPlus(){
        Button btn_plus = findViewById(R.id.plus);
        btn_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%s", "+"));
            }
        });
    }

    private void InitBtn0(){
        Button btn_0 = findViewById(R.id._0);
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%d", 0));
            }
        });
    }

    private void InitBtnDote(){
        Button btn_dote = findViewById(R.id.dote);
        btn_dote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%s", "."));
            }
        });
    }

    private void InitBtnRavno(){
        Button btn_ravno = findViewById(R.id.plus);
        btn_ravno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textWork.setText(String.format("%s", "="));
            }
        });
    }

}