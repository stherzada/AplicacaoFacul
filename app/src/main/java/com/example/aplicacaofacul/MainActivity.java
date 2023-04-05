package com.example.aplicacaofacul;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber1, editTextNumber2;
    TextView textViewResult;
    Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textViewResult = findViewById(R.id.textViewResult);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(editTextNumber1.getText().toString());
                double num2 = Double.parseDouble(editTextNumber2.getText().toString());
                double result = num1 + num2;
                textViewResult.setText("Resultado: " + String.format("%.2f", result));
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(editTextNumber1.getText().toString());
                double num2 = Double.parseDouble(editTextNumber2.getText().toString());
                double result = num1 - num2;
                textViewResult.setText("Resultado: " + String.format("%.2f", result));
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(editTextNumber1.getText().toString());
                double num2 = Double.parseDouble(editTextNumber2.getText().toString());
                double result = num1 * num2;
                textViewResult.setText("Resultado: " + String.format("%.2f", result));
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(editTextNumber1.getText().toString());
                double num2 = Double.parseDouble(editTextNumber2.getText().toString());
                if (num2 == 0) {
                    textViewResult.setText("Não é possível dividir por zero!");
                } else {
                    double result = num1 / num2;
                    textViewResult.setText("Resultado: " + String.format("%.2f", result));
                }
            }
        });
    }
}



