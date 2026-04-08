package androidx.tracing;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class TraceApi29Impl {
    /* JADX INFO: renamed from: a */
    public static void m11953a(int i, String str) {
        android.os.Trace.beginAsyncSection(str, i);
    }

    /* JADX INFO: renamed from: b */
    public static void m11954b(int i, String str) {
        android.os.Trace.endAsyncSection(str, i);
    }

    @DoNotInline
    /* JADX INFO: renamed from: c */
    public static boolean m11955c() {
        return android.os.Trace.isEnabled();
    }
}
