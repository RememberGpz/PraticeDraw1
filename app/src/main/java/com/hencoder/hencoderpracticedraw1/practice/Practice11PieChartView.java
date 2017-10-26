package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint paint = new Paint();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        paint.setColor(Color.RED);
        if (Build.VERSION.SDK_INT>=21) {
            canvas.drawArc(180, 80, 680, 580, -180, 110, true, paint);
            paint.setColor(Color.YELLOW);
            canvas.drawArc(200,100,700,600,-70,60,true,paint);
            paint.setColor(Color.MAGENTA);
            canvas.drawArc(200,100,700,600,-7,7,true,paint);
            paint.setColor(Color.GRAY);
            canvas.drawArc(200,100,700,600,3,10,true,paint);
            paint.setColor(Color.DKGRAY);
            canvas.drawArc(200,100,700,600,16,60,true,paint);
            paint.setColor(Color.BLUE);
            canvas.drawArc(200,100,700,600,80,100,true,paint);
        }

    }
}
