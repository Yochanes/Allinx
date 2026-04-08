package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class VolleyLog {

    /* JADX INFO: renamed from: a */
    public static final boolean f34978a = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: b */
    public static final String f34979b = VolleyLog.class.getName();

    /* JADX INFO: compiled from: Proguard */
    public static class MarkerLog {

        /* JADX INFO: renamed from: c */
        public static final boolean f34980c = VolleyLog.f34978a;

        /* JADX INFO: renamed from: a */
        public final ArrayList f34981a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public boolean f34982b = false;

        /* JADX INFO: compiled from: Proguard */
        public static class Marker {

            /* JADX INFO: renamed from: a */
            public final String f34983a;

            /* JADX INFO: renamed from: b */
            public final long f34984b;

            /* JADX INFO: renamed from: c */
            public final long f34985c;

            public Marker(String str, long j, long j2) {
                this.f34983a = str;
                this.f34984b = j;
                this.f34985c = j2;
            }
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m12812a(long j, String str) {
            if (this.f34982b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f34981a.add(new Marker(str, j, SystemClock.elapsedRealtime()));
        }

        /* JADX INFO: renamed from: b */
        public final synchronized void m12813b(String str) {
            long j;
            this.f34982b = true;
            ArrayList arrayList = this.f34981a;
            if (arrayList.size() == 0) {
                j = 0;
            } else {
                j = ((Marker) arrayList.get(arrayList.size() - 1)).f34985c - ((Marker) arrayList.get(0)).f34985c;
            }
            if (j <= 0) {
                return;
            }
            long j2 = ((Marker) this.f34981a.get(0)).f34985c;
            VolleyLog.m12809b("(%-4d ms) %s", Long.valueOf(j), str);
            for (Marker marker : this.f34981a) {
                long j3 = marker.f34985c;
                VolleyLog.m12809b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(marker.f34984b), marker.f34983a);
                j2 = j3;
            }
        }

        public final void finalize() {
            if (this.f34982b) {
                return;
            }
            m12813b("Request on the loose");
            VolleyLog.m12810c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m12808a(String str, Object... objArr) {
        String string;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                string = "<unknown>";
                break;
            }
            if (!stackTrace[i].getClassName().equals(f34979b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbM21r = AbstractC0000a.m21r(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".");
                sbM21r.append(stackTrace[i].getMethodName());
                string = sbM21r.toString();
                break;
            }
            i++;
        }
        Locale locale = Locale.US;
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder("[");
        sb.append(id);
        sb.append("] ");
        sb.append(string);
        return AbstractC0000a.m19p(sb, ": ", str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m12809b(String str, Object... objArr) {
        Log.d("Volley", m12808a(str, objArr));
    }

    /* JADX INFO: renamed from: c */
    public static void m12810c(String str, Object... objArr) {
        Log.e("Volley", m12808a(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    public static void m12811d(String str, Object... objArr) {
        if (f34978a) {
            Log.v("Volley", m12808a(str, objArr));
        }
    }
}
