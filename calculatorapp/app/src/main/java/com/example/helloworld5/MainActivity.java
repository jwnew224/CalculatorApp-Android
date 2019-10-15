package com.example.helloworld5;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String s = "";
    String pre = "0";
    int Add = 0;
    int Subtract = 0;
    int Divide = 0;
    int Multiply = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView textView = findViewById(R.id.textView);

        final Button button = findViewById(R.id.buttonOne);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                s+= "1";
                textView.setText(s);
            }
        });
        final Button button2 = findViewById(R.id.buttonTwo);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                s+= "2";
                textView.setText(s);
            }
        });
        final Button button3 = findViewById(R.id.buttonThree);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                s+= "3";
                textView.setText(s);
            }
        });
        final Button button4 = findViewById(R.id.buttonFour);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                s+= "4";
                textView.setText(s);
            }
        });
        final Button button5 = findViewById(R.id.buttonFive);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                s+= "5";
                textView.setText(s);
            }
        });
        final Button button6 = findViewById(R.id.buttonSix);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                s+= "6";
                textView.setText(s);
            }
        });
        final Button button7 = findViewById(R.id.buttonSeven);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                s+= "7";
                textView.setText(s);
            }
        });
        final Button button8 = findViewById(R.id.buttonEight);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                s+= "8";
                textView.setText(s);
            }
        });
        final Button button9 = findViewById(R.id.buttonNine);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                s+= "9";
                textView.setText(s);
            }
        });
        final Button button0 = findViewById(R.id.buttonZero);
        button0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                s+= "0";
                textView.setText(s);
            }
        });
        final Button buttonClear = findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                pre = "0";
                s= "";
                textView.setText(s);
            }
        });
        final Button buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Add = 1;
                pre = s;
                //pre = ((Integer.parseInt(s) + Integer.parseInt(pre)) + "");
                s= "";
                textView.setText(s);
            }
        });
        final Button buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Multiply = 1;
                pre = s;
                //pre = ((Integer.parseInt(s) + Integer.parseInt(pre)) + "");
                s= "";
                textView.setText(s);
            }
        });
        final Button buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Subtract = 1;
                pre = s;
                //pre = ((Integer.parseInt(s) - Integer.parseInt(pre)) + "");
                s= "";
                textView.setText(s);
            }
        });
        final Button buttonDivide = findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Divide = 1;
               // pre = ((Integer.parseInt(s) / Integer.parseInt(pre)) + "");
                s= "";
                textView.setText(s);
            }
        });
        final Button buttonEquals = findViewById(R.id.buttonEquals);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                if (Add == 1)
                {
                    Add = 0;
                    s = (Double.parseDouble(s) + Double.parseDouble(pre)) + "";
                }
                if (Subtract == 1)
                {
                    Subtract = 0;
                    s = (Double.parseDouble(pre) - Double.parseDouble(s)) + "";
                }
                if (Divide == 1)
                {
                    Divide = 0;
                    s = (Double.parseDouble(pre) / Double.parseDouble(s)) + "";
                }
                if (Multiply == 1)
                {
                    Multiply = 0;
                    s = (Double.parseDouble(pre) * Double.parseDouble(s)) + "";
                }
                pre = s;
                textView.setText(s);
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
