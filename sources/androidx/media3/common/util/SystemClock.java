package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class SystemClock implements Clock {
    @Override // androidx.media3.common.util.Clock
    /* JADX INFO: renamed from: a */
    public final HandlerWrapper mo9469a(Looper looper, Handler.Callback callback) {
        return new SystemHandlerWrapper(new Handler(looper, callback));
    }

    @Override // androidx.media3.common.util.Clock
    public final long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }
}
