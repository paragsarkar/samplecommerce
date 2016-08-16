package com.abinfosoft.whites.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

import com.abinfosoft.whites.R;


/**
 * Created by USER on 8/2/2016.
 */
public class SARTextView extends TextView {
    public SARTextView(Context context) {
        this(context, null);
    }

    public SARTextView(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.textViewStyle);
    }

    public SARTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        int[] attrsArray = new int[] {
                android.R.attr.text,
                R.attr.strikeThrough,
                R.attr.riyalText
        };

        TypedArray ta = context.obtainStyledAttributes(attrs, attrsArray);
        setRupeeText(ta.getString(0));
        setRupeeText(ta.getString(2));


        if(ta.getBoolean(1, false)) {
            this.setPaintFlags(getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
    }


    public void setRupeeText(int resId) {
        setRupeeText(getResources().getString(resId));
    }

    public void setRupeeText(CharSequence text){
        setText(getResources().getString(R.string.saudiCurrency) + text);
    }


}
