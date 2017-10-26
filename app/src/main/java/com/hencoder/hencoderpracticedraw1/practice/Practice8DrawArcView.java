package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    private Paint paint = new Paint();
    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLACK);
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        if (Build.VERSION.SDK_INT>=21) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawArc(500, 200,1000, 500, -110, 100, true, paint);

            canvas.drawArc(500, 200,1000, 500, 20,140,false,paint);

            paint.setStyle(Paint.Style.STROKE);
            canvas.drawArc(500, 200,1000, 500,-180,50,false,paint);

        }

    }
}
