package com.thoughtworks.xlogdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.elvishew.xlog.Logger;

public class MyPluginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_plugin);
        Logger logger = XLogUtils.init("plugin1", "/sdcard/xlog/plugin1/");
        logger.d("MyPluginActivity onCreate");
    }
}
