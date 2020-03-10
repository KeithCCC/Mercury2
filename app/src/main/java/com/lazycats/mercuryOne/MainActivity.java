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
        Button buttonDecPt = findViewById(R.id.buttonDecimal);

        // None number buttons
        Button buttonDivde = findViewById(R.id.button_division);
        Button buttonMultiply = findViewById(R.id.button_multiply);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonPlus = findViewById(R.id.button_plus);
        Button buttonClar = findViewById(R.id.buttonClear);
        Button buttonEqual = findViewById(R.id.button_equal);

        button2Eng.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.numConcatState = false;
                String text = priNum.displayNumStr;
                String answerText = "";
                answerText = Convert.Jn2E(text);
                textView.setText(answerText);
            }
        });

        button2Jp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //String text = editText.getText().toString();
                priNum.numConcatState = false;
                String text = priNum.displayNumStr;
                String answerText = "";
                answerText = Convert.Jn2J(text);
                textView.setText(answerText);
            }
        });


        buttonN1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 1);
                mainNumText.setText(priNum.displayNumStr);
            }
        });

        buttonN2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 2);
                mainNumText.setText(priNum.displayNumStr);
            }
        });

        buttonN3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 3);
                mainNumText.setText(priNum.displayNumStr);
            }
        });

        buttonN4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 4);
                mainNumText.setText(priNum.displayNumStr);
            }
        });

        buttonN5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 5);
                mainNumText.setText(priNum.displayNumStr);
            }
        });

        buttonN6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 6);
                mainNumText.setText(priNum.displayNumStr);
            }
        });

        buttonN7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 7);
                mainNumText.setText(priNum.displayNumStr);
            }
        });

        buttonN8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 8);
                mainNumText.setText(priNum.displayNumStr);
            }
        });

        buttonN9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.conCatNum(priNum, 9);
                mainNumText.setText(priNum.displayNumStr);
            }
        });


        /*
        Operator logic

        Button buttonDivde = findViewById(R.id.button_division);
        Button buttonMultiply = findViewById(R.id.button_multiply);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonPlus = findViewById(R.id.button_plus);  //done
        Button buttonClar = findViewById(R.id.buttonClear);  //done
        Button buttonEqual = findViewById(R.id.button_equal);
        Button buttonDecPt = findViewById(R.id.buttonDecimalPoint);

        */
        buttonDecPt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.calcOperator = ".";
                if (priNum.numConcatState == false) {
                    priNum.displayNumStr = "0.";
                    priNum.displayNumDouble = 0.0;

                } else {
                    if (priNum.displayNumStr.indexOf(".") == -1) {
                        priNum.displayNumStr = priNum.displayNumStr.concat(".");
                    }
                }
                priNum.numConcatState = true;
                priNum.isDecimal = true;
                textView.setText(priNum.debugStatus(priNum));
            }
        });

        buttonClar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.numConcatState = true;
                priNum.displayNumStr ="0";
                priNum.displayNumDouble = 0.0;
                priNum.primaryNumRegister = 0.0;
                mainNumText.setText(priNum.displayNumStr);
                priNum.isDecimal = false;
                textView.setText(priNum.debugStatus(priNum));
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.numConcatState = false;
                switch (priNum.calcOperator) {
                    case "+":
                        priNum.primaryNumRegister = priNum.primaryNumRegister + priNum.displayNumDouble;
                        break;
                }
                priNum.displayNumStr = String.valueOf(priNum.primaryNumRegister);
                mainNumText.setText(priNum.displayNumStr);
                priNum.displayNumDouble = 0;
                priNum.isDecimal = false;
                priNum.numConcatState = false;
                textView.setText(priNum.debugStatus(priNum));
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                priNum.primaryNumRegister +=  priNum.displayNumDouble;
                priNum.displayNumDouble = priNum.primaryNumRegister;
                priNum.displayNumStr = String.valueOf(priNum.displayNumDouble);
                priNum.calcOperator = "+";
                priNum.numConcatState = false;
                mainNumText.setText(priNum.displayNumStr);
                priNum.displayNumDouble = 0;
                priNum.isDecimal = false;
                priNum.numConcatState = false;
                textView.setText(priNum.debugStatus(priNum));
            }
        });


    }
}
