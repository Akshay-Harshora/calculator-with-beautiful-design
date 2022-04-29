package com.example.calcwithdesign;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.ast.ExpressionStatement;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {
    TextView n1,n2;
    Button zero,brc,plus,minus,one,two,three,four,five,six,seven,eight,nine,c,dot,equal,mul,per,div;
    String process;
    boolean check = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = (Button)findViewById(R.id.zero);
        n1 = (TextView)findViewById(R.id.tn1);
        n2 = (TextView)findViewById(R.id.tn2);
        brc = (Button)findViewById(R.id.brc);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        c = (Button)findViewById(R.id.c);
        dot = (Button)findViewById(R.id.point);
        equal = (Button)findViewById(R.id.equal);
        mul = (Button)findViewById(R.id.mul);
        per = (Button)findViewById(R.id.per);
        div = (Button)findViewById(R.id.div);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1.setText("");
                n2.setText("");
                check = false;
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "9");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "-");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                char c = 247;
                n1.setText(process + (c+""));
            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "%");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + ".");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = n1.getText().toString();
                n1.setText(process + "X");
            }
        });
        brc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check)
                {
                    process = n1.getText().toString();
                    n1.setText(process + ")");
                    check = false;
                }
                else
                {
                    process = n1.getText().toString();
                    n1.setText(process + "(");
                    check = true;
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             process = n1.getText().toString();
             process = process.replace("X","*");
             //process.replace("X","*");
             process = process.replace("%","/100");
             char c = 247;
                process = process.replace((c+""),"/");

            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("javascript");
                try {
                    n2.setText(engine.eval(process).toString());
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}