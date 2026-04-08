package androidx.camera.core.impl.utils;

import android.os.Looper;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Threads {
    /* JADX INFO: renamed from: a */
    public static void m1607a() {
        Preconditions.m7699f(m1608b(), "Not in application's main thread");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1608b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
