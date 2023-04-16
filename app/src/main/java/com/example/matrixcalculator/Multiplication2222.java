package com.example.matrixcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Multiplication2222 extends AppCompatActivity {

    public static final String row1 = "row1";
    public static final String row2 = "row2";
    public static final String col1 = "col1";
    public static final String col2 = "col2";

    private int r1,r2,c1,c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication2222);

        Intent it = getIntent();
        r1 = it.getIntExtra(row1,0);
        r2 = it.getIntExtra(row1,0);
        c1 = it.getIntExtra(row1,0);
        c2 = it.getIntExtra(row1,0);

        EditText a00,a01,a10,a11;
        EditText b00,b01,b10,b11;
        TextView s00,s01,s10,s11;
        a00 = findViewById(R.id.a00);
        a01 = findViewById(R.id.a01);
        a10 = findViewById(R.id.a10);
        a11 = findViewById(R.id.a11);


        b00 = findViewById(R.id.b00);
        b01 = findViewById(R.id.b01);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);


        s00 = findViewById(R.id.s00);
        s01 = findViewById(R.id.s01);
        s10 = findViewById(R.id.s10);
        s11 = findViewById(R.id.s11);



        try {
            Button b2 = findViewById(R.id.b2);
            b2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View view) {
                    int m1[][] = new int[r1][c1];
                    m1[0][0] = Integer.parseInt(a00.getText().toString().trim());
                    m1[0][1] = Integer.parseInt(a01.getText().toString().trim());
                    m1[1][0] = Integer.parseInt(a10.getText().toString().trim());
                    m1[1][1] = Integer.parseInt(a11.getText().toString().trim());

                    int m2[][] = new int[r2][c2];
                    m2[0][0] = Integer.parseInt(b00.getText().toString().trim());
                    m2[0][1] = Integer.parseInt(b01.getText().toString().trim());
                    m2[1][0] = Integer.parseInt(b10.getText().toString().trim());
                    m2[1][1] = Integer.parseInt(b11.getText().toString().trim());

                    int sum,mul;
                    int m_f[][] = new int[r1][c2];
                    for(int i=0;i<r1;i++)
                    {
                        for(int j=0;j<c2;j++)
                        {
                            sum = 0;
                            for(int k=0;k<c1;k++)
                            {
                                mul = 1;
                                mul = mul*m1[i][k]*m2[k][j];
                                sum = sum + mul;
                            }
                            m_f[i][j] = sum;
                        }
                    }

                    s00.setText(""+m_f[0][0]);
                    s01.setText(""+m_f[0][1]);
                    s10.setText(""+m_f[1][0]);
                    s11.setText(""+m_f[1][1]);

                }
            });

        }
        catch(Exception e)
        {
            e.printStackTrace();
            Toast.makeText(this, "Enter all values", Toast.LENGTH_SHORT).show();
        }

    }
}