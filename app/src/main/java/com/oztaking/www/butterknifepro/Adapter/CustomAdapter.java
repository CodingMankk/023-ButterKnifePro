package com.oztaking.www.butterknifepro.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.oztaking.www.butterknifepro.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/***********************************************
 * 文 件 名: 
 * 创 建 人: OzTaking
 * 功    能：在Adapter中绑定ButterKnife
 * 创建日期: 
 * 修改时间：
 * 修改备注：
 * @author
 ***********************************************/
public class CustomAdapter extends BaseAdapter{


    private final LayoutInflater mInflater;

    public  CustomAdapter(Context context){
        mInflater = LayoutInflater.from(context);
    }



    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView != null){
            holder = (ViewHolder) convertView.getTag();
        }else{

            convertView = mInflater.inflate(R.layout.item_layout, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);

        }


        holder.btn1Item.setText("item_btn1");


        return convertView;



    }

    static class ViewHolder{

        @BindView(R.id.id_btn1_item)
        Button btn1Item;

        @BindView(R.id.id_btn2_item)
        Button btn2Item;

        @BindView(R.id.id_btn3_item)
        Button btn3Item;

        @BindView(R.id.id_tv1_item)
        TextView Tv1Item;

        @BindView(R.id.id_tv2_item)
        TextView Tv2Item;

        @BindView(R.id.id_tv3_item)
        TextView Tv3Item;


        public ViewHolder(View view){
            ButterKnife.bind(this,view);
        }

    }
}
