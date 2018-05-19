package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
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
    }
    //Sets textView2 text to edtTxt1 when button is clicked
    public void buttonOnClick(View v)
    {
        //((Button) v).setText("");

        EditText edt = (EditText)findViewById(R.id.edtTxt1);
        TextView txtView = (TextView)findViewById(R.id.textView2);

        txtView.setText(edt.getText());

    }




}
