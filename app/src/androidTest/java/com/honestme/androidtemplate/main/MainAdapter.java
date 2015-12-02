package com.honestme.androidtemplate.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.honestme.androidontouchsystem.R;

import java.util.List;

/**
 * Created by Administrator on 2015/11/26 0026.
 */
public class MainAdapter extends BaseAdapter {

    List<MainModel> mModels;
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    private TextView mTextView;

    public MainAdapter(Context context){
        mContext = context;
        mLayoutInflater =(LayoutInflater)LayoutInflater.from(mContext);

    }

    public void setmModels(List<MainModel> models){
        mModels = models;
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
        ViewHolder viewHolder;
        if(convertView != null){
            viewHolder =(ViewHolder)convertView.getTag();
            mTextView = viewHolder.mTextView;
        }else{
            convertView = mLayoutInflater.inflate(R.layout.main_list_item,null);
            mTextView = (TextView)convertView.findViewById(R.id.main_list_item_textview);
            viewHolder = new ViewHolder(mTextView);
            convertView.setTag((Object)viewHolder);
        }


        return null;
    }

    private class ViewHolder{
        public TextView mTextView;

        public ViewHolder(TextView textView){
            mTextView = textView;
        }
    }
}
