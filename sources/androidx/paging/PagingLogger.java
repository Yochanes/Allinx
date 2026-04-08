package androidx.paging;

import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/PagingLogger;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final class PagingLogger {
    /* JADX INFO: renamed from: a */
    public static boolean m11396a(int i) {
        return Build.ID != null && Log.isLoggable("Paging", i);
    }

    /* JADX INFO: renamed from: b */
    public static void m11397b(int i, String message) {
        Intrinsics.m18599g(message, "message");
        if (i == 2) {
            Log.v("Paging", message, null);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC0000a.m10g(i, "debug level ", " is requested but Paging only supports default logging for level 2 (VERBOSE) or level 3 (DEBUG)"));
            }
            Log.d("Paging", message, null);
        }
    }
}
