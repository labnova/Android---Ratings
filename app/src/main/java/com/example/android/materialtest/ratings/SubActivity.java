package com.example.android.materialtest.ratings;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;

import com.example.android.materialtest.R;


public class SubActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        //EqLayout eql= (EqLayout) findViewById(R.id.eqlayout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sub, menu);
        return true;
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                Log.d("MSG", "ACTIVITY dispatchTouchEvent DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("MSG", "ACTIVITY dispatchTouchEvent MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("MSG", "ACTIVITY dispatchTouchEvent UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d("MSG", "ACTIVITY dispatchTouchEvent CANCEL");
                break;


        }

        boolean b = super.dispatchTouchEvent(ev);
        Log.d("MSG", "ACTIVITY dispatchTouchEvent ritorna "+b);
        return b;
    }

   /* @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                Log.d("MSG", "ACTIVITY onTouch DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("MSG", "ACTIVITY onTouch MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("MSG", "ACTIVITY onTouch UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d("MSG", "ACTIVITY onTouch CANCEL");
                break;
        }
    }*/

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
}
