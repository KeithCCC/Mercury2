package com.example.mercury1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.text_View);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = editText.getText().toString();
                String answerText = "";
                answerText = Convert.Jn2E(text);
                textView.setText(answerText);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text = editText.getText().toString();
                String answerText = "";
                answerText = Convert.Jn2J(text);
                textView.setText(answerText);
            }
        });

    }
}
