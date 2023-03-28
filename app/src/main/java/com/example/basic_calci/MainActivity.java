package com.example.basic_calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button addbutton;
    private Button subbutton;
    private Button mulbutton;
    private Button divbutton;
    private EditText num1;
    private EditText num2;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        addbutton = findViewById(R.id.addbutton);
        subbutton = findViewById(R.id.subbutton);
        mulbutton = findViewById(R.id.mulbutton);
        divbutton = findViewById(R.id.divbutton);
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();
                double number1 = Double.parseDouble(s1);
                double number2 = Double.parseDouble(s2);
                double answer = number1+number2;
                output.setText("ANSWER IS "+ answer );

            }
        });

        subbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();
                double number1 = Double.parseDouble(s1);
                double number2 = Double.parseDouble(s2);
                double answer = number1-number2;
                output.setText("ANSWER IS "+ answer );

            }
        });
        mulbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();
                double number1 = Double.parseDouble(s1);
                double number2 = Double.parseDouble(s2);
                double answer = number1*number2;
                output.setText("ANSWER IS "+ answer );

            }
        });

        divbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();
                double number1 = Double.parseDouble(s1);
                double number2 = Double.parseDouble(s2);
                double answer = number1/number2;
                output.setText("ANSWER IS "+ answer );

            }
        });
    }
}