package com.thoughtworks.xlogdemo;

import com.elvishew.xlog.Logger;
import com.elvishew.xlog.XLog;
import com.elvishew.xlog.printer.Printer;
import com.elvishew.xlog.printer.file.FilePrinter;
import com.elvishew.xlog.printer.file.backup.NeverBackupStrategy;
import com.elvishew.xlog.printer.file.naming.DateFileNameGenerator;

public class XLogUtils {
    public static Logger init(String pluginName, String logFileDir) {
        Printer filePrinter = new FilePrinter
                .Builder(logFileDir)
                .fileNameGenerator(new DateFileNameGenerator())
                .backupStrategy(new NeverBackupStrategy())
                .build();

        return XLog.tag(pluginName)
                .printers(filePrinter)
                .build();
    }
}
