package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface Clock {

    /* JADX INFO: renamed from: a */
    public static final SystemClock f25579a = new SystemClock();

    /* JADX INFO: renamed from: a */
    HandlerWrapper mo9469a(Looper looper, Handler.Callback callback);

    long elapsedRealtime();
}
