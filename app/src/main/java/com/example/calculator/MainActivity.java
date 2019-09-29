package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    Button zero, one, two, three, four, five, six, seven, eight, nine, divided, multiply, minus,
            pluse, equal, dot, clear,root,power,parcend;
    ImageButton back;
    double valueOne=Double.NaN, valueTwo=Double.NaN,vpower;
    int action;
    computClass cal;

    @Override
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=(TextView)findViewById(R.id.content);
        textView2=(TextView)findViewById(R.id.result);

        zero = (Button)findViewById(R.id.b0);
        one=(Button)findViewById(R.id.b1);
        two=(Button)findViewById(R.id.b2);
        three = (Button)findViewById(R.id.b3);
        four = (Button)findViewById(R.id.b4);
        five = (Button)findViewById(R.id.b5);
        six = (Button)findViewById(R.id.b6);
        seven = (Button)findViewById(R.id.b7);
        eight = (Button)findViewById(R.id.b8);
        nine = (Button)findViewById(R.id.b9);

        dot = (Button)findViewById(R.id.bdot);
        divided=(Button)findViewById(R.id.bdiv);
        multiply=(Button)findViewById(R.id.bmul);
        minus=(Button)findViewById(R.id.bminus);
        pluse=(Button)findViewById(R.id.bpluse);
        equal=(Button)findViewById(R.id.bequal);
        clear=(Button)findViewById(R.id.bc) ;
        root=(Button)findViewById(R.id.broot);
        power=(Button)findViewById(R.id.bpower);
        parcend=(Button)findViewById(R.id.bparcend);

        back=(ImageButton)findViewById(R.id.backbutton);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"0");
            }
        });
}
