package com.mila.result;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Main5Activity extends Fragment {
    //fragment第一次绘制时回掉的方法
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //xml文件转换为view对象  inflate加载资源
        View view = inflater.inflate(R.layout.activity_main5,null);
        ConstraintLayout layout = (ConstraintLayout) view.findViewById(R.id.mainacty5);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Tittle",Toast.LENGTH_LONG).show();
            }
        });
        //返回view
        return view;
    }
}
