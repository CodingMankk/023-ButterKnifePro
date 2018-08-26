package com.oztaking.www.butterknifepro.CustomView;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/***********************************************
 * 文 件 名: 
 * 创 建 人: OzTaking
 * 功    能：
 * 创建日期: 
 * 修改时间：
 * 修改备注：
 ***********************************************/
public class CustomTextView extends AppCompatTextView{

    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    @OnClick
//    public void onClick(){
//        Toast.makeText(getContext(), "CustomTextView", Toast.LENGTH_SHORT).show();
//    }

}
