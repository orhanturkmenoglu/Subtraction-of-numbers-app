package com.example.saylarkarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class activity_tables extends AppCompatActivity {

    private ImageView imgBack;
    private TextView tvText, tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    private List<TextView> textViews = new ArrayList<>();
    int tablo=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);
        findView();


    }
    public void onLeftClick(View view){
        onBackPressed();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                setTablo1();
                break;
            case R.id.btn2:
                setTablo2();
                break;
            case R.id.btn3:
                setTablo3();
                break;
            case R.id.btn4:
                setTablo4();
                break;
            case R.id.btn5:
                setTablo5();
                break;
            case R.id.btn6:
                setTablo6();
                break;
            case R.id.btn7:
                setTablo7();
                break;
            case R.id.btn8:
                setTablo8();
                break;
            case R.id.btn9:
                setTablo9();
                break;
            case R.id.btn10:
                setTablo10();
                break;
        }

    }

    private void setTablo1() {
        tv1.setText("1 - 1 = 0");
        tv2.setText("2 - 1 = 1");
        tv3.setText("3 - 1 = 2");
        tv4.setText("4 - 1 = 3");
        tv5.setText("5 - 1 = 4");
        tv6.setText("6 - 1 = 5");
        tv7.setText("7 - 1 = 6");
        tv8.setText("8 - 1 = 7");
        tv9.setText("9 - 1 = 8");
        tv10.setText("10 - 1 = 9");
    }
    private void setTablo2() {
        tv1.setText("2 - 1 = 1");
        tv2.setText("2 - 2 = 1");
        tv3.setText("3 - 2 = 2");
        tv4.setText("4 - 2 = 3");
        tv5.setText("5 - 2 = 4");
        tv6.setText("6 - 2 = 5");
        tv7.setText("7 - 2 = 6");
        tv8.setText("8 - 2 = 7");
        tv9.setText("9 - 2 = 8");
        tv10.setText("10 - 2 = 9");
    }
    private void setTablo3() {
        tv1.setText("3 - 1 = 2");
        tv2.setText("3 - 2 = 1");
        tv3.setText("3 - 3 = 0");
        tv4.setText("4 - 3 = 1");
        tv5.setText("5 - 3 = 2");
        tv6.setText("6 - 3 = 3");
        tv7.setText("7 - 3 = 4");
        tv8.setText("8 - 3 = 5");
        tv9.setText("9 - 3 = 6");
        tv10.setText("10 - 3 = 7");
    }
    private void setTablo4() {
        tv1.setText("4 - 1 = 3");
        tv2.setText("4 - 2 = 2");
        tv3.setText("4 - 3 = 1");
        tv4.setText("4 - 4 = 0");
        tv5.setText("5 - 4 = 1");
        tv6.setText("6 - 4 = 2");
        tv7.setText("7 - 4 = 3");
        tv8.setText("8 - 4 = 4");
        tv9.setText("9 - 4 = 5");
        tv10.setText("10 - 4 = 6");
    }
    private void setTablo5() {
        tv1.setText("5 - 1 = 4");
        tv2.setText("5 - 2 = 3");
        tv3.setText("5 - 3 = 2");
        tv4.setText("5 - 4 = 1");
        tv5.setText("5 - 5 = 0");
        tv6.setText("6 - 5 = 1");
        tv7.setText("7 - 5 = 2");
        tv8.setText("8 - 5 = 3");
        tv9.setText("9 - 5 = 4");
        tv10.setText("10 - 5 = 5");
    }
    private void setTablo6() {
        tv1.setText("6 - 1 = 5");
        tv2.setText("6 - 2 = 4");
        tv3.setText("6 - 3 = 3");
        tv4.setText("6 - 4 = 2");
        tv5.setText("6 - 5 = 1");
        tv6.setText("6 - 6 = 0");
        tv7.setText("7 - 6 = 1");
        tv8.setText("8 - 6 = 2");
        tv9.setText("9 - 6 = 3");
        tv10.setText("10 - 6 = 4");
    }
    private void setTablo7() {
        tv1.setText("7 - 1 = 6");
        tv2.setText("7 - 2 = 5");
        tv3.setText("7 - 3 = 4");
        tv4.setText("7 - 4 = 3");
        tv5.setText("7 - 5 = 2");
        tv6.setText("7 - 6 = 1");
        tv7.setText("7 - 7 = 0");
        tv8.setText("8 - 7 = 1");
        tv9.setText("9 - 7 = 2");
        tv10.setText("10 - 7 = 3");
    }
    private void setTablo8() {
        tv1.setText("8 - 1 = 7");
        tv2.setText("8 - 2 = 6");
        tv3.setText("8 - 3 = 5");
        tv4.setText("8 - 4 = 4");
        tv5.setText("8 - 5 = 3");
        tv6.setText("8 - 6 = 2");
        tv7.setText("8 - 7 = 1");
        tv8.setText("8 - 8 = 0");
        tv9.setText("9 - 8 = 1");
        tv10.setText("10 - 8 = 2");
    }
    private void setTablo9() {
        tv1.setText("9 - 1 = 8");
        tv2.setText("9 - 2 = 7");
        tv3.setText("9 - 3 = 6");
        tv4.setText("9 - 4 = 5");
        tv5.setText("9 - 5 = 4");
        tv6.setText("9 - 6 = 3");
        tv7.setText("9 - 7 = 2");
        tv8.setText("9 - 8 = 1");
        tv9.setText("9 - 9 = 0");
        tv10.setText("10 - 9 = 1");
    }
    private void setTablo10() {
        tv1.setText("10 - 1 = 9");
        tv2.setText("10 - 2 = 8");
        tv3.setText("10 - 3= 7");
        tv4.setText("10 - 4 = 6");
        tv5.setText("10 - 5 = 5");
        tv6.setText("10 - 6 = 4");
        tv7.setText("10 - 7 = 3");
        tv8.setText("10 - 8 = 2");
        tv9.setText("10 - 9 = 1");
        tv10.setText("10 - 10 = 0");
    }




    private void findView() {
        imgBack = findViewById(R.id.imgBack);
        tvText = findViewById(R.id.tvText);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        tv10 = findViewById(R.id.tv10);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        textViews.add(tv1);
        textViews.add(tv2);
        textViews.add(tv3);
        textViews.add(tv4);
        textViews.add(tv5);
        textViews.add(tv6);
        textViews.add(tv7);
        textViews.add(tv8);
        textViews.add(tv9);
        textViews.add(tv10);

    }
}