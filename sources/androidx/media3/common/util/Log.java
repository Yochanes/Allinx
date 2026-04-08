package androidx.media3.common.util;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Log {

    /* JADX INFO: renamed from: a */
    public static final Object f25617a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Logger f25618b = Logger.f25619a;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Logger {

        /* JADX INFO: renamed from: a */
        public static final Logger f25619a = new C17451();

        /* JADX INFO: renamed from: androidx.media3.common.util.Log$Logger$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C17451 implements Logger {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m9505a(String str, Throwable th) {
        String strM9509e = m9509e(th);
        if (TextUtils.isEmpty(strM9509e)) {
            return str;
        }
        StringBuilder sbM21r = AbstractC0000a.m21r(str, "\n  ");
        sbM21r.append(strM9509e.replace("\n", "\n  "));
        sbM21r.append('\n');
        return sbM21r.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m9506b(String str, String str2) {
        synchronized (f25617a) {
            android.util.Log.d(str, m9505a(str2, null));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m9507c(String str, String str2) {
        synchronized (f25617a) {
            android.util.Log.e(str, m9505a(str2, null));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m9508d(String str, String str2, Throwable th) {
        synchronized (f25617a) {
            android.util.Log.e(str, m9505a(str2, th));
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m9509e(Throwable th) {
        boolean z2;
        if (th == null) {
            return null;
        }
        synchronized (f25617a) {
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    z2 = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z2 = true;
                        break;
                    }
                    cause = cause.getCause();
                } finally {
                }
            }
            if (z2) {
                return "UnknownHostException (no network)";
            }
            return android.util.Log.getStackTraceString(th).trim().replace("\t", com.king.logx.logger.Logger.INDENT);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m9510f(String str, String str2) {
        synchronized (f25617a) {
            android.util.Log.i(str, m9505a(str2, null));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m9511g(String str, String str2) {
        synchronized (f25617a) {
            android.util.Log.w(str, m9505a(str2, null));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m9512h(String str, String str2, Throwable th) {
        synchronized (f25617a) {
            android.util.Log.w(str, m9505a(str2, th));
        }
    }
}
