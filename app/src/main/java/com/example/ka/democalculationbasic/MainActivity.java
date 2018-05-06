package com.example.ka.democalculationbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnAc, btnChange, btnPercent, btnDiv,
            btn7, btn8, btn9, btnMul,
            btn4, btn5, btn6, btnSub,
            btn1, btn2, btn3, btnSum,
            btn0, btnPoint, btnEqual;
    EditText edtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();

    }

    private void addControls() {
        edtResult = findViewById(R.id.edtResult);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAc = findViewById(R.id.btnAc);
        btnChange = findViewById(R.id.btnChange);
        btnPercent = findViewById(R.id.btnPoint);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSum);
        btnEqual = findViewById(R.id.btnEqual);
        btnPoint = findViewById(R.id.btnPoint);

    }

    private void addEvents() {
        edtResult.setGravity(Gravity.RIGHT);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAc.setOnClickListener(this);
        btnChange.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnSum.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn1:
                edtResult.setText("123");
                break;
            case R.id.btnSum:


        }
    }
}
