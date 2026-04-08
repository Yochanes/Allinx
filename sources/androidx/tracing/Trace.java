package androidx.tracing;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class Trace {

    /* JADX INFO: renamed from: a */
    public static long f32154a;

    /* JADX INFO: renamed from: b */
    public static Method f32155b;

    /* JADX INFO: renamed from: c */
    public static Method f32156c;

    /* JADX INFO: renamed from: d */
    public static Method f32157d;

    /* JADX INFO: renamed from: a */
    public static void m11948a(int i, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.m11953a(i, m11952e(str));
            return;
        }
        String strM11952e = m11952e(str);
        try {
            if (f32156c == null) {
                f32156c = android.os.Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f32156c.invoke(null, Long.valueOf(f32154a), strM11952e, Integer.valueOf(i));
        } catch (Exception e) {
            m11950c("asyncTraceBegin", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11949b(int i, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.m11954b(i, m11952e(str));
            return;
        }
        String strM11952e = m11952e(str);
        try {
            if (f32157d == null) {
                f32157d = android.os.Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f32157d.invoke(null, Long.valueOf(f32154a), strM11952e, Integer.valueOf(i));
        } catch (Exception e) {
            m11950c("asyncTraceEnd", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11950c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11951d() {
        if (Build.VERSION.SDK_INT >= 29) {
            return TraceApi29Impl.m11955c();
        }
        try {
            if (f32155b == null) {
                f32154a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f32155b = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f32155b.invoke(null, Long.valueOf(f32154a))).booleanValue();
        } catch (Exception e) {
            m11950c("isTagEnabled", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m11952e(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
