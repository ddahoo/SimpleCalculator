package com.example.daryl.simplecalculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private enum Operator {none, add, minus, multiply, divide};
    private double data1 = 0, data2 = 0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnNumClick(View v)
    {
        EditText eText = (EditText) findViewById(R.id.resultEdit);

        switch (v.getId()) {
            case R.id.btn00:
                eText.setText(eText.getText() + "0");
                break;
            case R.id.btn01:
                eText.setText(eText.getText() + "1");
                break;
            case R.id.btn02:
                eText.setText(eText.getText() + "2");
                break;
            case R.id.btn03:
                eText.setText(eText.getText() + "3");
                break;
            case R.id.btn04:
                eText.setText(eText.getText() + "4");
                break;
            case R.id.btn05:
                eText.setText(eText.getText() + "5");
                break;
            case R.id.btn06:
                eText.setText(eText.getText() + "6");
                break;
            case R.id.btn07:
                eText.setText(eText.getText() + "7");
                break;
            case R.id.btn08:
                eText.setText(eText.getText() + "8");
                break;
            case R.id.btn09:
                eText.setText(eText.getText() + "9");
                break;
            case R.id.btnDot:
                eText.setText(eText.getText() + ".");
                break;
            default:
                break;
        }
    }

    public void btnOpClick(View v)
    {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        switch(v.getId())
        {
            case R.id.btnAdd:
                optr = Operator.add;
                break;
            case R.id.btnMinus:
                optr = Operator.minus;
                break;
            case R.id.btnTimes:
                optr = Operator.multiply;
                break;
            case R.id.btnDivide:
                optr = Operator.divide;
                break;
            default:
                break;
        }
        eText.setText("");
    }

    public void btnClrClick(View v)
    {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText("");
        data1 = data2 = 0;
        optr = Operator.none;
    }

    public void btnEqualsClick(View v)
    {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data2 = Double.parseDouble(eText.getText().toString());
        double result = calculate();
        eText.setText(Double.toString(result));
    }

    private double calculate() {
        double result = 0;
        switch (optr)
        {
            case add:
                result = data1 + data2;
                break;
            case minus:
                result = data1 - data2;
                break;
            case multiply:
                result = data1 - data2;
                break;
            case divide:
                result = data1 / data2;
                break;
            default:
                break;
        }


        return result;
    }
}
