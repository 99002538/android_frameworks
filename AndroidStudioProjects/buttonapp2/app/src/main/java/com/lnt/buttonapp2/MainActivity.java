package com.lnt.buttonapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);

        TextView tv1=findViewById(R.id.tv1);

        EditText et1=findViewById(R.id.et1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread1 th1=new Thread1();
                Thread2 th2=new Thread2();

                th1.start();
                th2.start();

                int a = Integer.parseInt(et1.getText().toString());

                Table table=new Table();

                table.print(a);
            }
        });
        
    }
}