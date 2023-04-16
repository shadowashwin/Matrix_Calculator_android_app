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

public class Multiplication4444 extends AppCompatActivity {

    public static final String row1 = "row1";
    public static final String row2 = "row2";
    public static final String col1 = "col1";
    public static final String col2 = "col2";

    private int r1,r2,c1,c2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication4444);

        Intent it = getIntent();
        r1 = it.getIntExtra(row1,0);
        r2 = it.getIntExtra(row1,0);
        c1 = it.getIntExtra(row1,0);
        c2 = it.getIntExtra(row1,0);

        EditText a00,a01,a02,a03,a10,a11,a12,a13,a20,a21,a22,a23,a30,a31,a32,a33;
        EditText b00,b01,b02,b03,b10,b11,b12,b13,b20,b21,b22,b23,b30,b31,b32,b33;
        TextView s00,s01,s02,s03,s10,s11,s12,s13,s20,s21,s22,s23,s30,s31,s32,s33;
        a00 = findViewById(R.id.a00);
        a01 = findViewById(R.id.a01);
        a02 = findViewById(R.id.a02);
        a03 = findViewById(R.id.a03);
        a10 = findViewById(R.id.a10);
        a11 = findViewById(R.id.a11);
        a12 = findViewById(R.id.a12);
        a13 = findViewById(R.id.a13);
        a20 = findViewById(R.id.a20);
        a21 = findViewById(R.id.a21);
        a22 = findViewById(R.id.a22);
        a23 = findViewById(R.id.a23);
        a30 = findViewById(R.id.a30);
        a31 = findViewById(R.id.a31);
        a32 = findViewById(R.id.a32);
        a33 = findViewById(R.id.a33);

        b00 = findViewById(R.id.b00);
        b01 = findViewById(R.id.b01);
        b02 = findViewById(R.id.b02);
        b03 = findViewById(R.id.b03);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        b30 = findViewById(R.id.b30);
        b31 = findViewById(R.id.b31);
        b32 = findViewById(R.id.b32);
        b33 = findViewById(R.id.b33);

        s00 = findViewById(R.id.s00);
        s01 = findViewById(R.id.s01);
        s02 = findViewById(R.id.s02);
        s03 = findViewById(R.id.s03);
        s10 = findViewById(R.id.s10);
        s11 = findViewById(R.id.s11);
        s12 = findViewById(R.id.s12);
        s13 = findViewById(R.id.s13);
        s20 = findViewById(R.id.s20);
        s21 = findViewById(R.id.s21);
        s22 = findViewById(R.id.s22);
        s23 = findViewById(R.id.s23);
        s30 = findViewById(R.id.s30);
        s31 = findViewById(R.id.s31);
        s32 = findViewById(R.id.s32);
        s33 = findViewById(R.id.s33);


        try {
            Button b2 = findViewById(R.id.b2);
            b2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View view) {
                    int m1[][] = new int[r1][c1];
                    m1[0][0] = Integer.parseInt(a00.getText().toString().trim());
                    m1[0][1] = Integer.parseInt(a01.getText().toString().trim());
                    m1[0][2] = Integer.parseInt(a02.getText().toString().trim());
                    m1[0][3] = Integer.parseInt(a03.getText().toString().trim());
                    m1[1][0] = Integer.parseInt(a10.getText().toString().trim());
                    m1[1][1] = Integer.parseInt(a11.getText().toString().trim());
                    m1[1][2] = Integer.parseInt(a12.getText().toString().trim());
                    m1[1][3] = Integer.parseInt(a13.getText().toString().trim());
                    m1[2][0] = Integer.parseInt(a20.getText().toString().trim());
                    m1[2][1] = Integer.parseInt(a21.getText().toString().trim());
                    m1[2][2] = Integer.parseInt(a22.getText().toString().trim());
                    m1[2][3] = Integer.parseInt(a23.getText().toString().trim());
                    m1[3][0] = Integer.parseInt(a30.getText().toString().trim());
                    m1[3][1] = Integer.parseInt(a31.getText().toString().trim());
                    m1[3][2] = Integer.parseInt(a32.getText().toString().trim());
                    m1[3][3] = Integer.parseInt(a33.getText().toString().trim());

                    int m2[][] = new int[r2][c2];
                    m2[0][0] = Integer.parseInt(b00.getText().toString().trim());
                    m2[0][1] = Integer.parseInt(b01.getText().toString().trim());
                    m2[0][2] = Integer.parseInt(b02.getText().toString().trim());
                    m2[0][3] = Integer.parseInt(b03.getText().toString().trim());
                    m2[1][0] = Integer.parseInt(b10.getText().toString().trim());
                    m2[1][1] = Integer.parseInt(b11.getText().toString().trim());
                    m2[1][2] = Integer.parseInt(b12.getText().toString().trim());
                    m2[1][3] = Integer.parseInt(b13.getText().toString().trim());
                    m2[2][0] = Integer.parseInt(b20.getText().toString().trim());
                    m2[2][1] = Integer.parseInt(b21.getText().toString().trim());
                    m2[2][2] = Integer.parseInt(b22.getText().toString().trim());
                    m2[2][3] = Integer.parseInt(b23.getText().toString().trim());
                    m2[3][0] = Integer.parseInt(b30.getText().toString().trim());
                    m2[3][1] = Integer.parseInt(b31.getText().toString().trim());
                    m2[3][2] = Integer.parseInt(b32.getText().toString().trim());
                    m2[3][3] = Integer.parseInt(b33.getText().toString().trim());
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
                    s02.setText(""+m_f[0][2]);
                    s03.setText(""+m_f[0][3]);
                    s10.setText(""+m_f[1][0]);
                    s11.setText(""+m_f[1][1]);
                    s12.setText(""+m_f[1][2]);
                    s13.setText(""+m_f[1][3]);
                    s20.setText(""+m_f[2][0]);
                    s21.setText(""+m_f[2][1]);
                    s22.setText(""+m_f[2][2]);
                    s23.setText(""+m_f[2][3]);
                    s30.setText(""+m_f[3][0]);
                    s31.setText(""+m_f[3][1]);
                    s32.setText(""+m_f[3][2]);
                    s33.setText(""+m_f[3][3]);
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