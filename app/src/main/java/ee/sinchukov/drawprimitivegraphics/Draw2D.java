package ee.sinchukov.drawprimitivegraphics;

/**
 * Created by vsinchuk on 4/24/2015.
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by user_39 on 16.04.2015.
 */
public class Draw2D extends View {

    private String graphics;
    private Paint mPaint = new Paint();

    public Draw2D(Context context, String graphics) {
        super(context);
    this.graphics = graphics;

    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        // стиль Заливка
        mPaint.setStyle(Paint.Style.FILL);

        // закрашиваем холст белым цветом
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        switch (graphics) {
            case MainActivity.EXTRA_GRAPHICS_LINE:  // Рисуем зеленую линию
            mPaint.setColor(Color.GREEN);
            DrawLine dl = new DrawLine(130, 130, 50, 250, mPaint, canvas);
            break;

            case MainActivity.EXTRA_GRAPHICS_CIRCLE: // Рисуем красный круг
            mPaint.setAntiAlias(true);
            mPaint.setColor(Color.RED);
            DrawCircle dc = new DrawCircle(60, 70, 45, mPaint, canvas);
            break;

            case MainActivity.EXTRA_GRAPHICS_RECTANGLE: // Рисуем синий прямоугольник
            mPaint.setColor(Color.BLUE);
            DrawRectangle dr = new DrawRectangle(50f, 100f, 150f, 150f, mPaint, canvas);
            break;
        }
        
        // восстанавливаем холст
        canvas.restore();

    }
}

