package okhttp3.internal.platform.android;

import android.util.Log;
import com.king.logx.logger.Logger;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class AndroidLogHandler extends Handler {

    /* JADX INFO: renamed from: a */
    public static final AndroidLogHandler f57707a = new AndroidLogHandler();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int iMin;
        Intrinsics.m18599g(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = AndroidLog.f57705a;
        String loggerName = record.getLoggerName();
        Intrinsics.m18598f(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i = iIntValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        Intrinsics.m18598f(message, "record.message");
        Throwable thrown = record.getThrown();
        String strM20425W = (String) AndroidLog.f57706b.get(loggerName);
        if (strM20425W == null) {
            strM20425W = StringsKt.m20425W(23, loggerName);
        }
        if (Log.isLoggable(strM20425W, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iM20445u = StringsKt.m20445u(message, '\n', i2, 4);
                if (iM20445u == -1) {
                    iM20445u = length;
                }
                while (true) {
                    iMin = Math.min(iM20445u, i2 + Logger.MAX_LOG_LENGTH);
                    String strSubstring = message.substring(i2, iMin);
                    Intrinsics.m18598f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, strM20425W, strSubstring);
                    if (iMin >= iM20445u) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
