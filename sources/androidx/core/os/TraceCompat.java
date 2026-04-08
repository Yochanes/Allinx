package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class TraceCompat {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f23262a = 0;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }
}
