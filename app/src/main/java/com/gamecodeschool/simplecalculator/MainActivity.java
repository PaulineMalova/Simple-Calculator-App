package com.gamecodeschool.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView t1 = (TextView)findViewById(R.id.textView);
        float num1 = Float.parseFloat(e1.getText().toString());
        float num2 = Float.parseFloat(e2.getText().toString());
        float sum = num1 + num2;
        t1.setText(Float.toString(sum));
    }

    public void onButton2Click(View v) {
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView t1 = (TextView)findViewById(R.id.textView);
        float num1 = Float.parseFloat(e1.getText().toString());
        float num2 = Float.parseFloat(e2.getText().toString());
        float multiply = num1 * num2;
        t1.setText(Float.toString(multiply));
    }

    public void onButton3Click(View v) {
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView t1 = (TextView)findViewById(R.id.textView);
        float num1 = Float.parseFloat(e1.getText().toString());
        float num2 = Float.parseFloat(e2.getText().toString());
        float divide = num1 / num2;
        t1.setText(Float.toString(divide));
    }

    public void onButton4Click(View v) {
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView t1 = (TextView)findViewById(R.id.textView);
        float num1 = Float.parseFloat(e1.getText().toString());
        float num2 = Float.parseFloat(e2.getText().toString());
        float subtract = num1 - num2;
        t1.setText(Float.toString(subtract));
    }

}
