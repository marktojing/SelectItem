package com.csnt.selectitemlib;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;

/**
 * Created by sunrain
 * 标题设置最多5个汉字
 * Created Date 2020/7/2 10:36 AM
 */
public class SelectItem extends RelativeLayout {
    private Context mContext;
    private View mView;
    private TextView textView;
    private TextView value;
    private ImageView imageView;
    public SelectItem(Context context) {
        this(context,null);
    }

    public SelectItem(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SelectItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext=context;
        initView(attrs,defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public SelectItem(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.mContext=context;
        initView(attrs, defStyleAttr, defStyleRes);
    }
    private void initView(AttributeSet attrs, int defStyleAttr) {
        initView(attrs,defStyleAttr,0);
    }
    private void initView(AttributeSet attrs, int defStyleAttr,int defStyleRes) {
        //处理逻辑
        if(attrs!=null){
            //处理xml里的参数
        }
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mView = inflater.inflate(R.layout.item_select, this, true);
        value = mView.findViewById(R.id.value);
        textView = mView.findViewById(R.id.title);
        imageView = mView.findViewById(R.id.image);
        value.setHint("请选择信息");
        textView.setText("标题");
    }
    public String getTitle(){
        return textView.getText().toString().trim();
    }
    public String getValue(){
        return value.getText().toString().trim();
    }
    public void setTitle(@StringRes int resId){
        textView.setText(resId);
    }
    public void setTitle(CharSequence resId){
        textView.setText(resId);
    }

    public void setTextColor(@ColorInt int color){
        value.setTextColor(color);
    }
    public void setTextColor( ColorStateList color){
        value.setTextColor(color);
    }
    public void setTitleColor(@ColorInt int color){
        textView.setTextColor(color);
    }
    public void setTitleColor( ColorStateList color){
        textView.setTextColor(color);
    }
    public void setHintColor(@ColorInt int color){
        value.setHintTextColor(color);
    }
    public void setHintColor( ColorStateList color){
        value.setHintTextColor(color);
    }
    public void setHint(CharSequence str){
        value.setHint(str);
    }
    public void setHint(@StringRes int resid){
        value.setHint(getContext().getResources().getText(resid));
    }
    public void setText(CharSequence str){
        value.setText(str);
    }
    public void setText(@StringRes int resid){
        value.setText(getContext().getResources().getText(resid));
    }
    public void setTitleSize(float size){
        textView.setTextSize(size);
    }
    public void setOnClickListener(OnClickListener l){
        imageView.setOnClickListener(l);
    }

}
