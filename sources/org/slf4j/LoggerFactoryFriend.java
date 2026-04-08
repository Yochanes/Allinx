package org.slf4j;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class LoggerFactoryFriend {
    public static void reset() {
        LoggerFactory.reset();
    }

    public static void setDetectLoggerNameMismatch(boolean z2) {
        LoggerFactory.DETECT_LOGGER_NAME_MISMATCH = z2;
    }
}
