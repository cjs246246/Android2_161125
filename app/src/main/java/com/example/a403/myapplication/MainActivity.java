package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2;
    Switch switch1;
    LinearLayout line;
    RadioGroup radio;
    RadioButton radioButton1, radioButton2, radioButton3;
    Button button1, button2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        switch1=(Switch)findViewById(R.id.switch1);
        line = (LinearLayout)findViewById(R.id.line);
        radio=(RadioGroup)findViewById(R.id.radio);
        radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        imageView = (ImageView)findViewById(R.id.imageView);

      switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          @Override
          public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
              if(switch1.isChecked()){
                  line.setVisibility(View.VISIBLE);
              }
              else {
                  line.setVisibility(View.INVISIBLE);
              }
          }
      });
        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(radioButton1.isChecked()){
                    imageView.setImageResource(R.drawable.picture1);
                }
                else if(radioButton2.isChecked()){
                    imageView.setImageResource(R.drawable.picture2);
                }
                else if(radioButton3.isChecked()){
                    imageView.setImageResource(R.drawable.picture3);
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch1.setChecked(false);
                radioButton1.setChecked(true);
            }
        });
    }
}
