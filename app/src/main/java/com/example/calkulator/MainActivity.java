package com.example.calkulator;
import static com.example.calkulator.R.layout.activity_main;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first, second;
    private boolean isOperationClick = false;
    private String operation ="";
    private Integer result;
    private String operationSelected;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        textView = findViewById(R.id.text_view);
        button = findViewById(R.id.btn_next);
        findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MainActivity.this, home_workActivity2.class);
                String text = result.toString();
                intent.putExtra("jon",text);
                startActivity(intent);
                finish();
            }
        });
    }
    @SuppressLint("NonConstantResourceId")
    public void OnNamberClik(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                } else if (isOperationClick) {
                    textView.setText("1");
                } else textView.append("1");
                break;
            case R.id.btn_two:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else if (isOperationClick) {
                    textView.setText("2");
                } else
                    textView.append("2");
                break;
            case R.id.btn_three:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                } else if (isOperationClick) {
                    textView.setText("3");
                } else textView.append("3");
                break;
            case R.id.btn_four:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("4");
                } else if (isOperationClick) {
                    textView.setText("4");
                } else
                    textView.append("4");
                break;
            case R.id.btn_five:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                } else if (isOperationClick) {
                    textView.setText("5");
                } else
                    textView.append("5");
                break;
            case R.id.btn_six:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                } else if (isOperationClick) {
                    textView.setText("6");
                } else
                    textView.append("6");
                break;
            case R.id.btn_seven:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                } else if (isOperationClick){
                    textView.setText("7");
                } else
                    textView.append("7");
                break;
            case R.id.btn_eight:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                } else if (isOperationClick) {
                    textView.setText("8");
                } else
                    textView.append("8");
                break;
            case R.id.btn_nine:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                } else if (isOperationClick) {
                    textView.setText("9");
                } else
                    textView.append("9");
                break;
            case R.id.clear:
                textView.setText("0");
                break;
            case R.id.btn_zero:
                if (textView.getText().toString().equals("0")||isOperationClick) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                break;
        }
    }
    @SuppressLint("Range")
    public void OnRovnoClik(View view) {
       switch (view.getId()){
            case R.id.btn_plus:
                first =Integer.valueOf( textView.getText().toString());
                operationSelected = "+";
                isOperationClick = true;
                break;
            case R.id.btn_division:
                first = Integer.parseInt(textView.getText().toString());
                operationSelected = "/";
                isOperationClick = true;
                break;
            case R.id.btn_minus:
                first = Integer.parseInt(textView.getText().toString());
                operationSelected = "-";
                isOperationClick = true;
                break;
            case R.id.btn_x:
                first = Integer.parseInt(textView.getText().toString());
                operationSelected = "*";
                isOperationClick = true;
                break;
            case R.id.btn_equls:
                button.animate().alpha(100);
                second =Integer.valueOf( textView.getText().toString());
                switch (operationSelected){
               case "+":
                   result = first + second;
                   operation = String.valueOf(result);
                   break;
               case "-":
                   result = first - second;
                   operation = String.valueOf(result);
                   break;
               case "*":
                   result = first * second;
                   operation = String.valueOf(result);
                   break;
               case "/":
                   result = first / second;
                   operation = String.valueOf(result);
                   break;
           }

           textView.setText(result.toString());
           isOperationClick = true;
           break;
        }
    }

}