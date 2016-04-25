package net.imknown.bettertextclockbackport;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import net.imknown.bettertextclockbackportlibrary.TextClock;

public class MainActivity extends Activity implements View.OnClickListener {
    TextClock tc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tc = (TextClock) findViewById(R.id.normal);
        findViewById(R.id.focus_use_12).setOnClickListener(this);
        findViewById(R.id.focus_use_24).setOnClickListener(this);
        findViewById(R.id.use_system).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.focus_use_12:
                tc.setForceUse(TextClock.FORMAT_12);
                break;
            case R.id.focus_use_24:
                tc.setForceUse(TextClock.FORMAT_24);
                break;
            case R.id.use_system:
                tc.setForceUse(TextClock.FORMAT_AUTO);
                break;
        }
    }
}
