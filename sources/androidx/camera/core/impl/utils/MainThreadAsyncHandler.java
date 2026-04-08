package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import androidx.core.os.HandlerCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class MainThreadAsyncHandler {

    /* JADX INFO: renamed from: a */
    public static volatile Handler f2895a;

    /* JADX INFO: renamed from: a */
    public static Handler m1604a() {
        if (f2895a != null) {
            return f2895a;
        }
        synchronized (MainThreadAsyncHandler.class) {
            try {
                if (f2895a == null) {
                    f2895a = HandlerCompat.m7647a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2895a;
    }
}
