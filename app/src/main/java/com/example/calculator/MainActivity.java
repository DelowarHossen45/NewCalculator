package com.example.calculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView1 = (TextView)findViewById(R.id.content), textView2;
    Button zero, one, two, three, four, five, six, seven, eight, nine, divided, multiply, minus,
            pluse, equal, dot, clear,root,power,parcend;
    ImageButton back;
    double valueOne=Double.NaN, valueTwo=Double.NaN,vpower;
    int action;
    
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

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+"9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(textView1.getText()+".");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText(null);
                textView2.setText(null);
                valueOne=Double.NaN;
                valueTwo=Double.NaN;
            }
        });
        back.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textView1.setText(null);
                textView2.setText(null);
                return false;
            }
        });

        pluse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView1.setText("OK");
                computCalculation();
                action=1;
                textView2.setText(valueOne+"+");
                textView1.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView1.setText("OK");
                computCalculation();
                action=2;
                textView2.setText(valueOne+"-");
                textView1.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView1.setText("OK");
                computCalculation();
                action=3;
                textView2.setText(valueOne+"*");
                textView1.setText(null);
            }
        });
        divided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textView1.setText("OK");
                computCalculation();
                action=4;
                textView2.setText(valueOne+"/");
                textView1.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(action==5){
                    //valueOne=Math.sqrt(valueOne);
                    valueOne=Double.parseDouble(textView1.getText()+"");
                    textView2.setText(null);
                    textView2.setText(textView2.getText().toString()+"√"+valueOne);
                    textView1.setText(""+Math.sqrt(valueOne));
                    valueOne=Double.NaN;
                    action=0;
                }
                else if(action==6){
                    valueOne=Double.parseDouble(textView1.getText().toString());
                    valueTwo=Math.pow(vpower,valueOne);
                    textView1.setText(valueTwo+"");
                    textView2.setText(textView2.getText()+""+textView1);
                    valueOne=Double.NaN;
                    vpower=Double.NaN;
                    action=0;
                }
                else {
                    computCalculation();
                    if(action==4 && valueTwo==0){
                        textView1.setText("infinity");
                        textView2.setText(textView2.getText().toString()+valueTwo+"");
                        action=0;
                    }
                    else {
                        textView1.setText(""+valueOne);
                        textView2.setText(textView2.getText().toString()+valueTwo+"");
                        valueOne=Double.NaN;
                        action=0;
                    }
                }
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vpower=Double.parseDouble(textView1.getText().toString());
                action=6;
                textView2.setText(textView1.getText().toString()+"^");
                textView1.setText(null);
            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action=5;
                textView2.setText(""+"√");
            }
        });
    }
    public void computCalculation(){
        if(!Double.isNaN(valueOne)){
            valueTwo=Double.parseDouble(textView1.getText().toString());

            if (action==1){
                valueOne=this.valueOne+valueTwo;
            }
            else if(action==2){
                valueOne=this.valueOne-valueTwo;
            }
            else if(action==3){
                valueOne=this.valueOne*valueTwo;
            }
            else if(action==4){
                if(valueTwo==0){
                    textView1.setText("infinity");
                }else {
                    valueOne=this.valueOne/valueTwo;
                }

            }

            textView1.setText(null);
        }
        else {
            try {
                //textView2.setText("i am here");
                valueOne=Double.parseDouble(textView1.getText()+"");
            }
            catch (Exception e){

            }
        }
    }
}
