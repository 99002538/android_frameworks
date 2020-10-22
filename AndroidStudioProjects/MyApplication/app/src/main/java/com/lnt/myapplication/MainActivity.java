package com.lnt.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add = (Button) findViewById(R.id.button);
        // final EditText ed1=(EditText)findViewById(R.id.editTextTextPersonName);
        //final EditText ed2=(EditText)findViewById(R.id.editTextTextPersonName2);
        //final TextView t1 =(TextView)findViewById(R.id.textView);
        //TextView t2 =(TextView)findViewById(R.id.textView2);
        tx = (TextView) findViewById(R.id.tv1);
        add.setOnClickListener(new View.OnClickListener() {
            //@Override
            // public void onClick(View v){
            //int a=Integer.parseInt(ed1.getText().toString());
            //int b=Integer.parseInt(ed2.getText().toString());
            //int result = Calc.add(a,b);
            // t3.setText(result);
            //Toast.makeText(getApplicationContext(),String.valueOf(result),Toast.LENGTH_SHORT).show();
            @Override
            public void onClick(View v) {
                new Thread() {
                    public void run() {
                        for(int i=0;i<=5000;i++) {
                            try {
                                final int finalI = i;
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        tx.setText(String.valueOf(finalI));
                                    }
                                });
                                Thread.sleep(1);
                            }catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }.start();
            }
        });
    }
}