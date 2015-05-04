package ee.sinchukov.drawprimitivegraphics;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by vsinchuk on 5/2/2015.
 */
public class DrawCircle extends Canvas {
    DrawCircle(float cx, float cy, float radius, Paint paint, Canvas canvas){
        // рисуем круг
        canvas.drawCircle(cx, cy, radius, paint);
    }
}
