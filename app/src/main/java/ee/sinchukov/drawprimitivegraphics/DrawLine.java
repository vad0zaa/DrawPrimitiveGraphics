package ee.sinchukov.drawprimitivegraphics;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by vsinchuk on 5/2/2015.
 */
public class DrawLine extends Canvas {
    DrawLine(float startX, float startY, float stopX, float stopY, Paint paint, Canvas canvas){
        // рисуем линию
        canvas.drawLine(startX,startY,stopX,stopY,paint);
    }
}
