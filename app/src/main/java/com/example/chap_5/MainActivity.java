package com.example.chap_5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex5_11);

//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.MATCH_PARENT);
//
//        LinearLayout baseLayout = new LinearLayout(this);
//        baseLayout.setOrientation(LinearLayout.VERTICAL);
//        baseLayout.setBackgroundColor(Color.rgb(0,255,0));
//        setContentView(baseLayout, params);
//
//        Button btn = new Button(this);
//        btn.setText("버튼입니다");
//        btn.setBackgroundColor(Color.MAGENTA);
//        baseLayout.addView(btn);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                Toast.makeText(getApplicationContext(),
//                        "코드로 생선한 버튼입니다", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}