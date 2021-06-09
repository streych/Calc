package com.example.calculator_constraint;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

/**
 * 1. Создайте активити с настройками, где включите выбор темы приложения.
 * 2. Доделайте приложение «Калькулятор». Это последний урок с созданием приложения «Калькулятор».
 * 3. * Сделайте интент-фильтр для запуска калькулятора извне, а также напишите тестовое приложение, запускающее приложение-калькулятор
 */
public class MainActivity extends AppCompatActivity {
    static {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY);
    }

    private TextView textWork;
    private boolean flag = false;
    private TextView resultWork;
    private double result;
    private double oneNum, twoNum;
    private final int[] numberButtons;

    {
        numberButtons = new int[]{R.id._0, R.id._1, R.id._2, R.id._3, R.id._4, R.id._5,
                R.id._6, R.id._7, R.id._8, R.id._9};
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textWork = findViewById(R.id.text_info);
        resultWork = findViewById(R.id.result);

        setNumberButtonsListeners();
        clearButtonListener();
        moveBackBtnListener();
        plusBtn();
        ravnoBtn();
        minusBtn();
        umnoBtn();
        deleBtn();
        persentBtn();
        doteBtn();
    }

    private void updateText(String strAdd) {
        String oldStr = textWork.getText().toString();
        textWork.setText(String.format("%s%s", oldStr, strAdd));
    }

    private void clearButtonListener() {
        Button btn = findViewById(R.id.C);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textWork.setText("");
            }
        });
    }

    private void moveBackBtnListener() {
        Button btn = findViewById(R.id.del);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String remove = (String) textWork.getText();
                remove = remove.substring(0, remove.length() - 1);
                textWork.setText(remove);
            }
        });
    }

    private void plusBtn() {
        Button btn = findViewById(R.id.plus);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneNum = Double.parseDouble(textWork.getText().toString());
                resultWork.setText("+");
                textWork.setText("");
                flag = false;
            }
        });
    }

    private void minusBtn() {
        Button btn = findViewById(R.id.minus);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneNum = Double.parseDouble(textWork.getText().toString());
                resultWork.setText("-");
                textWork.setText("");
                flag = false;
            }
        });
    }

    private void umnoBtn() {
        Button btn = findViewById(R.id.umno);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneNum = Double.parseDouble(textWork.getText().toString());
                resultWork.setText("*");
                textWork.setText("");
                flag = false;
            }
        });
    }

    private void deleBtn() {
        Button btn = findViewById(R.id.dele);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneNum = Double.parseDouble(textWork.getText().toString());
                resultWork.setText("/");
                textWork.setText("");
                flag = false;
            }
        });
    }

    private void persentBtn() {
        Button btn = findViewById(R.id.percent);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneNum = Double.parseDouble(textWork.getText().toString());
                resultWork.setText("%");
                textWork.setText("");
                flag = false;
            }
        });
    }

    private void doteBtn() {
        Button btn = findViewById(R.id.dote);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!flag) {
                    flag = true;
                    updateText(".");
                }
            }
        });
    }

    private void ravnoBtn() {
        Button btn = findViewById(R.id.ravno);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twoNum = Double.parseDouble(textWork.getText().toString());

                if (resultWork.getText().toString().equals("+")) {
                    result = oneNum + twoNum;
                } else if (resultWork.getText().toString().equals("-")) {
                    result = oneNum - twoNum;
                } else if (resultWork.getText().toString().equals("*")) {
                    result = oneNum * twoNum;
                } else if (resultWork.getText().toString().equals("/")) {
                    result = oneNum / twoNum;
                } else if (resultWork.getText().toString().equals("%")) {
                    result = oneNum % twoNum;
                }

                resultWork.setText(String.valueOf(result));
                textWork.setText("");
            }
        });
    }


    private void setNumberButtonsListeners() {
        for (int numberButton : numberButtons) {
            Button btn = findViewById(numberButton);
            btn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String num = btn.getText().toString();
                    //textWork.setText(num);
                    updateText(num);
                }
            });
        }
    }


}