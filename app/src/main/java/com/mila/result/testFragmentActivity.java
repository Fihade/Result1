package com.mila.result;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class testFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_test_fragment);
        //创建fragment管理器对象
        FragmentManager manager =getFragmentManager();
        //获取fragment的事务对象并且开启事务
        FragmentTransaction transaction = manager.beginTransaction();
        //添加相关的fragment
        transaction.add(R.id.fragment_title,new Main5Activity());
        transaction.add(R.id.fragment_content,new ContentFragment());
        //移除fragment
       //transaction.remove(new ContentFragment());
        //替换fragment
        //transaction.replace(R.id.fragment_content,new ContentFragment());
        transaction.commit();   //只有commit才能成功
    }
}
