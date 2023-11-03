package com.example.temperature_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button CtoF,FtoC;
    private EditText temp;
    private TextView result;
    double res1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temp=findViewById(R.id.temp);
        CtoF=findViewById(R.id.CtoF);
        FtoC=findViewById(R.id.FtoC);
        result=findViewById(R.id.result);

        CtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double t=Double.parseDouble(temp.getText().toString());
                res1=(t * 1.8) + 32;
                result.setText(String.valueOf(res1));
            }
        });

        FtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double t=Double.parseDouble(temp.getText().toString());
                res1=(t -32) /1.8;
                result.setText(String.valueOf(res1));
            }
        });

    }
}
