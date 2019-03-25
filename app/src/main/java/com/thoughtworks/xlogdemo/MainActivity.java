package com.thoughtworks.xlogdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.elvishew.xlog.XLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        XLog.d("MainActivity onCreate");
    }

    public void clickButton(View view) {
        XLog.d("clickButton");
        startActivity(new Intent(this, MyPluginActivity.class));
    }
}
