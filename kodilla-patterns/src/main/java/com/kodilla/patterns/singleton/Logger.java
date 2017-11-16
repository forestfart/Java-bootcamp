package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger settingsLoggerEngineInstance = null;
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if (settingsLoggerEngineInstance == null) {
            settingsLoggerEngineInstance = new Logger();
        }
        return settingsLoggerEngineInstance;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}