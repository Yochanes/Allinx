package androidx.work;

import android.util.Log;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public abstract class Logger {

    /* JADX INFO: renamed from: a */
    public static final Object f32583a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile LogcatLogger f32584b;

    /* JADX INFO: compiled from: Proguard */
    public static class LogcatLogger extends Logger {

        /* JADX INFO: renamed from: c */
        public final int f32585c;

        public LogcatLogger(int i) {
            this.f32585c = i;
        }

        @Override // androidx.work.Logger
        /* JADX INFO: renamed from: a */
        public final void mo12102a(String str, String str2) {
            if (this.f32585c <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.Logger
        /* JADX INFO: renamed from: b */
        public final void mo12103b(String str, String str2, Throwable th) {
            if (this.f32585c <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // androidx.work.Logger
        /* JADX INFO: renamed from: c */
        public final void mo12104c(String str, String str2) {
            if (this.f32585c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.Logger
        /* JADX INFO: renamed from: d */
        public final void mo12105d(String str, String str2, Throwable th) {
            if (this.f32585c <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // androidx.work.Logger
        /* JADX INFO: renamed from: f */
        public final void mo12106f(String str, String str2) {
            if (this.f32585c <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.Logger
        /* JADX INFO: renamed from: h */
        public final void mo12107h(String str, String str2) {
            if (this.f32585c <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // androidx.work.Logger
        /* JADX INFO: renamed from: i */
        public final void mo12108i(String str, String str2, RuntimeException runtimeException) {
            if (this.f32585c <= 5) {
                Log.w(str, str2, runtimeException);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static Logger m12100e() {
        LogcatLogger logcatLogger;
        synchronized (f32583a) {
            try {
                if (f32584b == null) {
                    f32584b = new LogcatLogger(3);
                }
                logcatLogger = f32584b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return logcatLogger;
    }

    /* JADX INFO: renamed from: g */
    public static String m12101g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo12102a(String str, String str2);

    /* JADX INFO: renamed from: b */
    public abstract void mo12103b(String str, String str2, Throwable th);

    /* JADX INFO: renamed from: c */
    public abstract void mo12104c(String str, String str2);

    /* JADX INFO: renamed from: d */
    public abstract void mo12105d(String str, String str2, Throwable th);

    /* JADX INFO: renamed from: f */
    public abstract void mo12106f(String str, String str2);

    /* JADX INFO: renamed from: h */
    public abstract void mo12107h(String str, String str2);

    /* JADX INFO: renamed from: i */
    public abstract void mo12108i(String str, String str2, RuntimeException runtimeException);
}
