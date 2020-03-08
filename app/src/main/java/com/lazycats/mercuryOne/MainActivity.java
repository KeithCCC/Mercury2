package com.lazycats.mercuryOne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mainNumText;
    private TextView textView;
    PrimaryNumber priNum= new PrimaryNumber();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainNumText = findViewById(R.id.main_Text);
        textView = findViewById(R.id.text_View);
        Button button2Eng = findViewById(R.id.button2Eng);
        Button button2Jp = findViewById(R.id.button2Jp);
        Button buttonN1 = findViewById(R.id.button1);
        Button buttonN2 = findViewById(R.id.button2);
        Button buttonN3 = findViewById(R.id.button3);
        Button buttonN4 = findViewById(R.id.button4);
        Button buttonN5 = findViewById(R.id.button5);
        Button buttonN6 = findViewById(R.id.button6);
        Button buttonN7 = findViewById(R.id.button7);
        Button buttonN8 = findViewById(R.id.button8);
        Button buttonN9 = findViewById(R.id.button9);
        Button buttonN0 = findViewById(R.id.button0);

        // None number buttons
        Button buttonDivde = findViewById(R.id.button_division);
        Button buttonMultiply = findViewById(R.id.button_multiply);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonPlus = findViewById(R.id.button_plus);
        Button buttonClar = findViewById(R.id.buttonClear);

        button2Eng.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = priNum.primaryNumStr;
                String answerText = "";
                answerText = Convert.Jn2E(text);
                textView.setText(answerText);
            }
        });

        button2Jp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //String text = editText.getText().toString();
                String text = priNum.primaryNumStr;
                String answerText = "";
                answerText = Convert.Jn2J(text);
                textView.setText(answerText);
            }
        });


        buttonN1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 1);
                mainNumText.setText(priNum.primaryNumStr);
            }
        });

        buttonN2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 2);
                mainNumText.setText(priNum.primaryNumStr);
            }
        });

        buttonN3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 3);
                mainNumText.setText(priNum.primaryNumStr);
            }
        });

        buttonN4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 4);
                mainNumText.setText(priNum.primaryNumStr);
            }
        });

        buttonN5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 5);
                mainNumText.setText(priNum.primaryNumStr);
            }
        });

        buttonN6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 6);
                mainNumText.setText(priNum.primaryNumStr);
            }
        });

        buttonN7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 7);
                mainNumText.setText(priNum.primaryNumStr);
            }
        });

        buttonN8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 8);
                mainNumText.setText(priNum.primaryNumStr);
            }
        });

        buttonN9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 9);
                mainNumText.setText(priNum.primaryNumStr);
            }
        });


        /*

        Button buttonDivde = findViewById(R.id.button_division);
        Button buttonMultiply = findViewById(R.id.button_multiply);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonPlus = findViewById(R.id.button_plus);
        Button buttonClar = findViewById(R.id.buttonClear);

        */

        buttonClar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.primaryNumStr ="0";
                priNum.primaryNumDouble = 0.0;
                mainNumText.setText(priNum.primaryNumStr);
            }
        });


    }
}
