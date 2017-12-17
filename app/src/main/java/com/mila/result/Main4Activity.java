package com.mila.result;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class Main4Activity extends AppCompatActivity {
   private StyleableToast toastStyle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);       //去除标题栏
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main4);




    }

//    public void Toaster(View v){
//        switch(v.getId()){
//            case R.id.testToast1:
//                StyleableToast.makeText(this,"Hello World",Toast.LENGTH_LONG,R.style.ToastStyle).show();
//                break;
//            case R.id.testToast2:
//                toastStyle = new StyleableToast
//                        .Builder(this)
//                        .duration(Toast.LENGTH_LONG)
//                        .text("NO WAY!!!")
//                        .textColor(Color.WHITE)
//                        .backgroundColor(Color.parseColor("#87CEFA"))
//                        .build();
//                break;
//
//        }
//    }
}
