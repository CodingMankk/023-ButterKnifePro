package com.oztaking.www.butterknifepro.Base;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oztaking.www.butterknifepro.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/***********************************************
 * 文 件 名: 
 * 创 建 人: OzTaking
 * 功    能：Fragment使用ButterKnife
 * 创建日期: 
 * 修改时间：
 * 修改备注：
 * @author
 ***********************************************/
public class BaseFragment extends Fragment {

    private Unbinder unbinder;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle
            savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_base, container, false);

        /**
         *[2]返回一个Unbinder值（进行解绑），注意这里的this不能使用getActivity()
         */
        unbinder = ButterKnife.bind(this, view);


        return view;
    }


    /**
     * onDestroyView中进行解绑操作
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
