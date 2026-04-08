package com.intercom.twig;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class Twig {
    public static final int DISABLED = 8;
    private static final int MAX_LOG_LENGTH = 4000;
    private final boolean internalLoggingEnabled;
    private int logLevel;

    @NonNull
    private final String tag;

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public Twig(int i, @Nullable String str, boolean z2) {
        this.logLevel = i;
        this.tag = str == null ? "Twig" : str;
        this.internalLoggingEnabled = z2;
    }

    private String getStackTraceString(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    private void prepareLog(int i, @Nullable Throwable th, String str, Object... objArr) {
        String string;
        if (i < this.logLevel) {
            return;
        }
        String tag = getTag();
        if (str != null && str.length() == 0) {
            str = null;
        }
        if (str != null) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            if (th != null) {
                StringBuilder sbM21r = AbstractC0000a.m21r(str, "\n");
                sbM21r.append(getStackTraceString(th));
                string = sbM21r.toString();
            } else {
                string = str;
            }
        } else if (th == null) {
            return;
        } else {
            string = getStackTraceString(th);
        }
        log(i, tag, string);
    }

    private void printLog(int i, String str, String str2) {
        if (i == 7) {
            Log.wtf(str, str2);
        } else {
            Log.println(i, str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m15302d(String str, Object... objArr) {
        prepareLog(3, null, str, objArr);
    }

    /* JADX INFO: renamed from: e */
    public void m15305e(String str, Object... objArr) {
        prepareLog(6, null, str, objArr);
    }

    @VisibleForTesting
    public int getLogLevel() {
        return this.logLevel;
    }

    public String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: i */
    public void m15308i(String str, Object... objArr) {
        prepareLog(4, null, str, objArr);
    }

    public void internal(String str) {
        internal(this.tag, str);
    }

    @VisibleForTesting
    public void log(int i, String str, Object... objArr) {
        prepareLog(i, null, str, objArr);
    }

    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    /* JADX INFO: renamed from: v */
    public void m15311v(String str, Object... objArr) {
        prepareLog(2, null, str, objArr);
    }

    /* JADX INFO: renamed from: w */
    public void m15314w(String str, Object... objArr) {
        prepareLog(5, null, str, objArr);
    }

    public void wtf(String str, Object... objArr) {
        prepareLog(7, null, str, objArr);
    }

    private void log(int i, String str, String str2) {
        int iMin;
        if (str2.length() < 4000) {
            printLog(i, str, str2);
            return;
        }
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            int iIndexOf = str2.indexOf(10, i2);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i2 + 4000);
                printLog(i, str, str2.substring(i2, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i2 = iMin;
                }
            }
            i2 = iMin + 1;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m15304d(Throwable th, String str, Object... objArr) {
        prepareLog(3, th, str, objArr);
    }

    /* JADX INFO: renamed from: e */
    public void m15307e(Throwable th, String str, Object... objArr) {
        prepareLog(6, th, str, objArr);
    }

    /* JADX INFO: renamed from: i */
    public void m15310i(Throwable th, String str, Object... objArr) {
        prepareLog(4, th, str, objArr);
    }

    public void internal(String str, String str2) {
        if (this.internalLoggingEnabled) {
            Log.d(str, "INTERNAL: " + str2);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m15313v(Throwable th, String str, Object... objArr) {
        prepareLog(2, th, str, objArr);
    }

    /* JADX INFO: renamed from: w */
    public void m15316w(Throwable th, String str, Object... objArr) {
        prepareLog(5, th, str, objArr);
    }

    public void wtf(Throwable th, String str, Object... objArr) {
        prepareLog(7, th, str, objArr);
    }

    /* JADX INFO: renamed from: d */
    public void m15303d(Throwable th) {
        prepareLog(3, th, null, new Object[0]);
    }

    /* JADX INFO: renamed from: e */
    public void m15306e(Throwable th) {
        prepareLog(6, th, null, new Object[0]);
    }

    /* JADX INFO: renamed from: i */
    public void m15309i(Throwable th) {
        prepareLog(4, th, null, new Object[0]);
    }

    /* JADX INFO: renamed from: v */
    public void m15312v(Throwable th) {
        prepareLog(2, th, null, new Object[0]);
    }

    /* JADX INFO: renamed from: w */
    public void m15315w(Throwable th) {
        prepareLog(5, th, null, new Object[0]);
    }

    public void wtf(Throwable th) {
        prepareLog(7, th, null, new Object[0]);
    }
}
