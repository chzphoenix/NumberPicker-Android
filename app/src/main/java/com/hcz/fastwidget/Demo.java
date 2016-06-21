package com.hcz.fastwidget;

import android.app.Activity;
import android.os.Bundle;

import com.hcz.fastwidget.numberpicker.NumberPicker;

public class Demo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        NumberPicker picker = (NumberPicker)findViewById(R.id.picker);
        picker.setMinValue(0);
        picker.setMaxValue(9);
        picker.setDisplayedValues(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
    }
}
