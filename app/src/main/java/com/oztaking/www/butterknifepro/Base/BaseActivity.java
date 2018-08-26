package com.oztaking.www.butterknifepro.Base;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.orhanobut.logger.Logger;
import com.oztaking.www.butterknifepro.R;

import java.util.List;

import butterknife.BindArray;
import butterknife.BindBitmap;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemSelected;
import butterknife.OnLongClick;

/**
 * @author ozTaking
 */
public class BaseActivity extends AppCompatActivity {

    /**
     * [4] 单个控件id注解
     */
    @BindView(R.id.id_btn1_baseActivity)
    Button mBtn1BaseActivity;

    @BindView(R.id.id_btn2_baseActivity)
    Button mBtn2BaseActivity;

    @BindView(R.id.id_btn3_baseActivity)
    Button mBtn3BaseActivity;


    /**
     *[5]多个控id件注解
     */
    @BindViews({R.id.id_tv1_baseActivity,R.id.id_tv2_baseActivity,R.id.id_tv3_baseActivity})
    public List<TextView> mTextViewList;


    /**
     * [6]绑定String
     */
    @BindString(R.string.btn_name)
    public String mStr;


    /**
     * [7] 绑定StringArray
     */
    @BindArray(R.array.city)
    public String[] mStrArray;


    /**
     * [8]绑定Bitmap
     */
    @BindView(R.id.id_iv_BaseActivity)
    public ImageView mIvBaseActivity;

    @BindBitmap(R.mipmap.fri_selected)
    public Bitmap mBitmapFriSelected;


    /**
     * [9] 绑定Color
     */
    @BindColor(R.color.colorAccent)
    public int mColorBaseActivity;


    /**
     * [10]事件绑定之onClick()
     */
    @OnClick(R.id.id_btn1_baseActivity)
    public void mBtn1BaseActivityOnClick(){
        Toast.makeText(this, "mButton1之onClick事件", Toast.LENGTH_SHORT).show();
    }

    /**
     * [11]事件绑定之onLongClick()，必须返回boolean值
     */
    @OnLongClick(R.id.id_btn2_baseActivity)
    public boolean mBtn2BaseActivityOnLongClick(){
        Toast.makeText(this, "mBtn2之OnLongClick事件", Toast.LENGTH_SHORT).show();
        return true;
    }


    /**
     * [12] 同时绑定多个onClick事件
     * @param view
     */
    @OnClick({R.id.id_btn3_baseActivity,R.id.id_btn4_baseActivity,
    R.id.id_btn5_baseActivity})
    public void onViewClicked(View view){
        switch(view.getId()){
             case R.id.id_btn3_baseActivity:
                 Logger.i("id_btn3_baseActivity之onClick事件");
                  break;
            case R.id.id_btn4_baseActivity:
                Logger.i("id_btn4_baseActivity之onClick事件");
                break;
            case R.id.id_btn5_baseActivity:
                Logger.i("id_btn5_baseActivity之onClick事件");
                break;
             default:
                  break;
        }
    }

    /**
     * [13] 自定义控件之onClick事件
     */
    @OnClick(R.id.id_customTextView_BaseActivity)
    public void customTextViewOnClick(){
        Logger.i("customTextViewOnClick之点击事件");
    }

    /**
     * [14] Listener中多方法注解
     */
    @BindView(R.id.id_spinner_BaseActivity)
    Spinner mSpinner;

    @OnItemSelected(R.id.id_spinner_BaseActivity)
    public void onItemSelected(int position){
        Logger.i(position+"");
//        Logger.i(id+"");
    }

    @OnItemSelected(value = R.id.id_spinner_BaseActivity,callback = OnItemSelected.Callback.NOTHING_SELECTED)
    public void onNothingSelected(){
        Logger.i("onNothingSelected()");
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        BindButterKnife();

        mTextViewList.get(0).setText("多个注解——文本测试1");
        mTextViewList.get(1).setText("多个注解——文本测试2");
        mTextViewList.get(2).setText("多个注解——文本测试3");


        mTextViewList.get(0).setText(mStr);
        mTextViewList.get(1).setText(mStrArray[0]);
        mTextViewList.get(2).setText(mStrArray[1]);

        mIvBaseActivity.setImageBitmap(mBitmapFriSelected);

        int size = mTextViewList.size();
        for (int i=0; i<size; i++){
            mTextViewList.get(i).setBackgroundColor(mColorBaseActivity);
        }









    }

    /**
     * 【1】绑定初始化ButterKnife
     */
    private void BindButterKnife() {
        ButterKnife.bind(this);
    }


}
