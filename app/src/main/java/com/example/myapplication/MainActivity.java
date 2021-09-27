package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addNumbers(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String val1 = firstNumber.getText().toString();
        String val2 = secondNumber.getText().toString();

        int finVal = Integer.parseInt(val1) + Integer.parseInt((val2));
        String str = String.valueOf(finVal);
        goToActivity2(str);
    }

    public void subtractNumbers(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String val1 = firstNumber.getText().toString();
        String val2 = secondNumber.getText().toString();

        int finVal = Integer.parseInt(val1) - Integer.parseInt((val2));
        String str = String.valueOf(finVal);
        goToActivity2(str);
    }

    public void multiplyNumbers(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String val1 = firstNumber.getText().toString();
        String val2 = secondNumber.getText().toString();

        int finVal = Integer.parseInt(val1) * Integer.parseInt((val2));
        String str = String.valueOf(finVal);
        goToActivity2(str);
    }

    public void divideNumbers(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        String val1 = firstNumber.getText().toString();
        String val2 = secondNumber.getText().toString();

        int finVal = Integer.parseInt(val1) / Integer.parseInt((val2));
        String str = String.valueOf(finVal);
        goToActivity2(str);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}