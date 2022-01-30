package com.geektach.homework23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer firstVar;
    private Integer secondVar;
    private Boolean isOperationClick;
    private String operation;
    private Double percent; //a * (b / 100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                setNumber("1");
                break;
            case R.id.btn_two:
                setNumber("2");
                break;
            case R.id.btn_three:
                setNumber("3");
                break;
            case R.id.btn_four:
                setNumber("4");
                break;
            case R.id.btn_five:
                setNumber("5");
                break;
            case R.id.btn_six:
                setNumber("6");
                break;
            case R.id.btn_seven:
                setNumber("7");
                break;
            case R.id.btn_eight:
                setNumber("8");
                break;
            case R.id.btn_nine:
                setNumber("9");
                break;
            case R.id.btn_zero:
                setNumber("0");
                break;
            case R.id.btn_ac:
                tvResult.setText("0");
                firstVar = 0;
                secondVar = 0;
                break;
            case R.id.btn_point:
                if (!tvResult.getText().toString().contains(".")) {
                    tvResult.append(".");
                }
                break;

        }
    }

    private void setNumber(String number) {
        if (tvResult.getText().toString().equals("0")) {
            tvResult.setText(number);
        } else if (isOperationClick) {
            tvResult.setText(number);
        } else {
            tvResult.append(number);
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_equally:
                secondVar = Integer.parseInt(tvResult.getText().toString());
                Integer result = 0;
                switch (operation) {
                    case "+":
                        result = firstVar + secondVar;
                        break;
                    case "-":
                        result = firstVar - secondVar;
                        break;
                    case "*":
                        result = firstVar * secondVar;
                        break;
                    case "/":
                        result = firstVar / secondVar;

                }
                tvResult.setText(result.toString());
            case R.id.btn_plus:
                firstVar = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                operation = "+";
                break;

            case R.id.btn_minus:
                firstVar = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                operation = "-";
                break;

            case R.id.btn_multiplication:
                firstVar = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                operation = "*";
                break;

            case R.id.btn_toShare:
                firstVar = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                operation = "/";
                break;
        }

    }

    public void onPercentage(View view) {

    }
}