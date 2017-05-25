package com.example.yana.a20170523;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    Button btn1;
    Button btn2;
    TextView myText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myText = (TextView) findViewById(R.id.myText);
        btn1 = (Button) findViewById(R.id.myBtn1);
        btn2 = (Button) findViewById(R.id.myBtn2);


        View.OnClickListener onClOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myText.setText("Нажата кнопка ОК");
            }
        };

        btn1.setOnClickListener(onClOk);


        View.OnClickListener onClCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myText.setText("Нажата кнопка Cancel");
            }
        };
        btn2.setOnClickListener(onClCancel);
    }
}
