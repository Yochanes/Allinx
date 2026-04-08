package io.intercom.android.sdk.errorreporting;

import java.lang.Thread;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class IntercomExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler originalHandler;
    private final ErrorReporter reporter;

    public IntercomExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ErrorReporter errorReporter) {
        this.originalHandler = uncaughtExceptionHandler;
        this.reporter = errorReporter;
    }

    public static void disable() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof IntercomExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(((IntercomExceptionHandler) defaultUncaughtExceptionHandler).originalHandler);
        }
    }

    public static void enable(ErrorReporter errorReporter) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof IntercomExceptionHandler) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new IntercomExceptionHandler(defaultUncaughtExceptionHandler, errorReporter));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.reporter.saveReport(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.originalHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            System.err.printf("Exception in thread \"%s\" ", thread.getName());
            th.printStackTrace(System.err);
        }
    }
}
