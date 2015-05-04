package ee.sinchukov.drawprimitivegraphics;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by vsinchuk on 5/2/2015.
 */
public class DrawRectangle extends Canvas {
DrawRectangle(float left, float top, float right, float bottom, Paint paint, Canvas canvas){
    // Рисуем прямоугольник
    canvas.drawRect(left, top, right, bottom, paint );
}
}
