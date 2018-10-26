package com.certis_helper_ui.cusom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.certis_helper_ui.R;


/*
public class ClearDrawableEditText extends AppCompatEditText {

    public abstract class RightDrawableOnTouchListener implements OnTouchListener {
        private int fuzz = 10;

        public abstract boolean onDrawableTouch(MotionEvent motionEvent);

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && ClearDrawableEditText.this.getCompoundDrawables()[2] != null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x >= (view.getRight() - ClearDrawableEditText.this.getCompoundDrawables()[2].getBounds().width()) - this.fuzz && x <= (view.getRight() - view.getPaddingRight()) + this.fuzz && y >= view.getPaddingTop() - this.fuzz && y <= (view.getHeight() - view.getPaddingBottom()) + this.fuzz) {
                    return onDrawableTouch(motionEvent);
                }
            }
            return false;
        }
    }

    public ClearDrawableEditText(Context context) {
        this(context, null);
    }

    public ClearDrawableEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842862);
    }

    public ClearDrawableEditText(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            String obtainFontName = FontUtils.obtainFontName(context, attributeSet, R.styleable.CustomFontView, 0);
            if (obtainFontName != null) {
                setTypeface(FontUtils.obtainFont(context, obtainFontName));
            }
        }
        setOnTouchListener(new RightDrawableOnTouchListener() {
            public boolean onDrawableTouch(MotionEvent motionEvent) {
                ClearDrawableEditText.this.setText(null);
                return true;
            }
        });
        addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @SuppressLint("NewApi")
            public void afterTextChanged(Editable editable) {
                ClearDrawableEditText.this.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, editable.length() > 0 ? R.drawable.ic_close : 0, 0);
                if (ClearDrawableEditText.this.getCompoundDrawables()[2] != null) {
                    ClearDrawableEditText.this.getCompoundDrawables()[2].setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.greyDark), Mode.SRC_IN));
                }
            }
        });
    }
}
*/
