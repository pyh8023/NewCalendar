package com.example.administrator.newcalendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;


public class CalendarDayTextView extends AppCompatTextView {

    public boolean isSelected = false;
    private Paint paint;

    public CalendarDayTextView(Context context) {
        super(context);
    }

    public CalendarDayTextView(Context context, @Nullable AttributeSet attrs) {
        this(context,attrs,0);
    }

    public CalendarDayTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initControl();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected) {
            canvas.translate(getWidth() / 2, getHeight() / 2);
            canvas.drawCircle(0, 0, getWidth() / 2, paint);
        }
    }

    private void initControl(){
        paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        paint.setAlpha(50);
    }
}
