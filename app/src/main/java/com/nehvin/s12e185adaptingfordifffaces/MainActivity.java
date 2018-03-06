package com.nehvin.s12e185adaptingfordifffaces;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends WearableActivity {

    private TextView mTextView;
    private ShapeWear shapeWear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShapeWear.initShapeWear(this);
        mTextView = (TextView) findViewById(R.id.text);

        // Enables Always-on
        setAmbientEnabled();
    }

    public void roundOrSquare(View view) {

        switch (ShapeWear.getShape())
        {
            case ROUND:
                Toast.makeText(MainActivity.this, "This is a round", Toast.LENGTH_SHORT).show();
                break;
            case RECTANGLE:
                Toast.makeText(MainActivity.this, "This is a rectangle", Toast.LENGTH_SHORT).show();
                break;
            case MOTO_ROUND:
                Toast.makeText(MainActivity.this, "This is a moto round", Toast.LENGTH_SHORT).show();
                break;
            case UNDETECTED:
                Toast.makeText(MainActivity.this, "This is undefined", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(MainActivity.this, "Undefined shape", Toast.LENGTH_SHORT).show();
        }
    }
}
