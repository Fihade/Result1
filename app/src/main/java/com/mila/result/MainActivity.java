package com.mila.result;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bt1;
    private TextView tv;
    private Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.button);
        tv  = findViewById(R.id.textView);
        bt2 = findViewById(R.id.test);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                startActivityForResult(intent , 1);


            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);
                startActivityForResult(intent1 ,0);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 && resultCode == 2){
            String va = data.getStringExtra("data");
            Log.d("ta","aaaaaa");
            tv.setText(va);

        }
        if(requestCode == 0 && resultCode ==3){
            String va1 = data.getStringExtra("data1");
            Log.d("ta","bbbbbbbb");

            tv.setText(va1);
        }
    }
}
