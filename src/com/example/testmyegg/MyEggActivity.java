package com.example.testmyegg;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MyEggActivity extends Activity {
    TextView mTextview;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lland);
        /*mTextview.setBackgroundColor(color);*/
        MyEggView world = (MyEggView) findViewById(R.id.world);
        world.setScoreField((TextView) findViewById(R.id.score));
        world.setSplash(findViewById(R.id.welcome));
        Log.v(MyEggView.TAG, "focus: " + world.requestFocus());
    }
}
