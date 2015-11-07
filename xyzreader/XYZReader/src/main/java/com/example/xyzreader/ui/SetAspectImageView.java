package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by olivi on 11/3/2015.
 */
public class SetAspectImageView extends ImageView {

    public SetAspectImageView(Context context) {
        super(context);
    }

    public SetAspectImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SetAspectImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int height = MeasureSpec.getSize(widthMeasureSpec) * 3 / 4;
        int heightSpec = MeasureSpec.makeMeasureSpec(height,
                MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, heightSpec);
    }
}
