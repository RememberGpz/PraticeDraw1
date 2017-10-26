package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint paint = new Paint();
    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.WHITE);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        canvas.drawLine(100,100,100,800,paint);
        canvas.drawLine(100,800,1400,800,paint);

        paint.setTextSize(25);
        canvas.drawText("Froyo",180,850,paint);
        canvas.drawText("Froyo",380,850,paint);
        canvas.drawText("Froyo",580,850,paint);
        canvas.drawText("Froyo",780,850,paint);
        canvas.drawText("Froyo",980,850,paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(150,800,300,700,paint);
        canvas.drawRect(350,800,500,600,paint);
        canvas.drawRect(550,800,700,500,paint);
        canvas.drawRect(750,800,900,400,paint);
        canvas.drawRect(950,800,1100,300,paint);

    }
}
