package com.example.album.widget.photoview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.Nullable;

/**
 * Created by Yan Zhenjie on 2017/3/31.
 */

public class AttacherImageView extends ImageView {

    private PhotoViewAttacher mAttacher;

    public AttacherImageView(Context context) {
        super(context);
    }

    public AttacherImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AttacherImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setAttacher(PhotoViewAttacher attacher) {
        this.mAttacher = attacher;
    }

    @Override
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        if (mAttacher != null) {
            mAttacher.update();
        }
    }
}
