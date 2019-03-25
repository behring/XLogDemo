package com.thoughtworks.xlogdemo;

import android.app.Application;

import com.elvishew.xlog.XLog;
import com.elvishew.xlog.printer.Printer;
import com.elvishew.xlog.printer.file.FilePrinter;
import com.elvishew.xlog.printer.file.backup.NeverBackupStrategy;
import com.elvishew.xlog.printer.file.naming.DateFileNameGenerator;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Printer filePrinter = new FilePrinter
                .Builder("/sdcard/xlog/")
                .fileNameGenerator(new DateFileNameGenerator())
                .backupStrategy(new NeverBackupStrategy())
                .build();

        XLog.init(filePrinter);
    }
}

