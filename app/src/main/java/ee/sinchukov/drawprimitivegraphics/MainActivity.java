package ee.sinchukov.drawprimitivegraphics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    public static final String EXTRA_GRAPHICS = "ee.sinchukov.drawprimitivegraphics.GRAPHICS";
    public static final String EXTRA_GRAPHICS_RECTANGLE = "rectangle";
    public static final String EXTRA_GRAPHICS_CIRCLE = "circle";
    public static final String EXTRA_GRAPHICS_LINE = "line";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void drawRectangle(View view){
        // drawRectangle button is pressed
        Intent intent = new Intent(this,ShowGraphicsActivity.class);
        intent.putExtra(MainActivity.EXTRA_GRAPHICS, MainActivity.EXTRA_GRAPHICS_RECTANGLE);
        startActivity(intent);

    }

    public void drawCircle(View view){
        // drawCircle button is pressed
        Intent intent = new Intent(this,ShowGraphicsActivity.class);
        intent.putExtra(MainActivity.EXTRA_GRAPHICS, MainActivity.EXTRA_GRAPHICS_CIRCLE);
        startActivity(intent);

    }

    public void drawLine(View view){
        // drawLine button is pressed
        Intent intent = new Intent(this,ShowGraphicsActivity.class);
        intent.putExtra(MainActivity.EXTRA_GRAPHICS, MainActivity.EXTRA_GRAPHICS_LINE);
        startActivity(intent);

    }

}
