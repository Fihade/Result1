package com.mila.result;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button bt2;
    private String text = "Hello";
    private String text1 = "You're welcome";
    private Button bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt2 = findViewById(R.id.button2);
        bt3 = findViewById(R.id.turn);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent();                   // 传递数据时应返回Intent类型
                data.putExtra("data" ,text);           // 确定 返回值的 name 和 内容
                setResult(2,data);
                Intent data1 = new Intent();
                data1.putExtra("data1",text1);
                setResult(3,data1);                // 设置Result   resultcode  和 内容
                Log.i("tag","cccccccc");
                finish();                                     // 结束finish
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

    }
}
