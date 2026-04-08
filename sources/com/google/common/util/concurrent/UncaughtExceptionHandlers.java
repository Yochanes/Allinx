package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.lang.Thread;
import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class UncaughtExceptionHandlers {

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public static final class Exiter implements Thread.UncaughtExceptionHandler {
        private static final LazyLogger logger = new LazyLogger(Exiter.class);
        private final Runtime runtime;

        public Exiter(Runtime runtime) {
            this.runtime = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            try {
                logger.get().log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", thread), th);
            } catch (Throwable th2) {
                try {
                    System.err.println(th.getMessage());
                    System.err.println(th2.getMessage());
                } finally {
                    this.runtime.exit(1);
                }
            }
        }
    }

    private UncaughtExceptionHandlers() {
    }

    public static Thread.UncaughtExceptionHandler systemExit() {
        return new Exiter(Runtime.getRuntime());
    }
}
