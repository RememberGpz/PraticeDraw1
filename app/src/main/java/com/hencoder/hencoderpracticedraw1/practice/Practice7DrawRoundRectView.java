package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice7DrawRoundRectView extends View {
    private Paint paint = new Paint();
    public Practice7DrawRoundRectView(Context context) {
        super(context);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.BLACK);
//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
        if (Build.VERSION.SDK_INT>21) {
            canvas.drawRoundRect(100, 100, 500, 400, 50, 50, paint);
        }
    }
}
