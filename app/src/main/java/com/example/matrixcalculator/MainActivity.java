package com.example.matrixcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText n1,n2,m1,m2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        b1 = findViewById(R.id.b1);
        n1 = findViewById(R.id.n1);
        m1 = findViewById(R.id.m1);
        n2 = findViewById(R.id.n2);
        m2 = findViewById(R.id.m2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    int r1 = Integer.parseInt(n1.getText().toString().trim());
                    int c1 = Integer.parseInt(n2.getText().toString().trim());
                    int r2 = Integer.parseInt(m1.getText().toString().trim());
                    int c2 = Integer.parseInt(m2.getText().toString().trim());
                    if(c1!=r2)
                    {
                        Toast.makeText(MainActivity.this, "Matrix multiplication not possible", Toast.LENGTH_LONG).show();
                    }
                    else if (r1>5 || r2>5 || c1>5 || c2>5)
                    {
                        Toast.makeText(MainActivity.this,"max dimensions supported 5X5",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        if(r1==1 && c1==1 && r2==1 && c2==1)
                        {
                            Intent i = new Intent(MainActivity.this, Multiplication1111.class);
                            i.putExtra(Multiplication1111.row1,r1);
                            i.putExtra(Multiplication1111.row2,r2);
                            i.putExtra(Multiplication1111.col1,c1);
                            i.putExtra(Multiplication1111.col2,c2);
                            startActivity(i);
                        }

                        else if(r1==2 && c1==2 && r2==2 && c2==2)
                        {
                            Intent i = new Intent(MainActivity.this, Multiplication2222.class);
                            i.putExtra(Multiplication2222.row1,r1);
                            i.putExtra(Multiplication2222.row2,r2);
                            i.putExtra(Multiplication2222.col1,c1);
                            i.putExtra(Multiplication2222.col2,c2);
                            startActivity(i);
                        }

                        else if(r1==3 && c1==3 && r2==3 && c2==3)
                        {
                            Intent i = new Intent(MainActivity.this, Multiplication3333.class);
                            i.putExtra(Multiplication3333.row1,r1);
                            i.putExtra(Multiplication3333.row2,r2);
                            i.putExtra(Multiplication3333.col1,c1);
                            i.putExtra(Multiplication3333.col2,c2);
                            startActivity(i);
                        }

                        else if(r1==4 && c1==4 && r2==4 && c2==4)
                        {
                            Intent i = new Intent(MainActivity.this, Multiplication4444.class);
                            i.putExtra(Multiplication4444.row1,r1);
                            i.putExtra(Multiplication4444.row2,r2);
                            i.putExtra(Multiplication4444.col1,c1);
                            i.putExtra(Multiplication4444.col2,c2);
                            startActivity(i);
                        }

                        else if(r1==5 && c1==5 && r1==5 && c1==5)
                        {
                            Intent i = new Intent(MainActivity.this, Multiplication.class);
                            i.putExtra(Multiplication.row1,r1);
                            i.putExtra(Multiplication.row2,r2);
                            i.putExtra(Multiplication.col1,c1);
                            i.putExtra(Multiplication.col2,c2);
                            startActivity(i);
                        }
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "Enter the values", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}