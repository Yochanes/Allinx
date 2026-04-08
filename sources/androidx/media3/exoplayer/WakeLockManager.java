package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.SystemClock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class WakeLockManager {

    /* JADX INFO: renamed from: a */
    public final HandlerWrapper f26357a;

    /* JADX INFO: renamed from: b */
    public boolean f26358b;

    /* JADX INFO: compiled from: Proguard */
    public static final class WakeLockManagerInternal {
    }

    public WakeLockManager(Context context, Looper looper, SystemClock systemClock) {
        context.getApplicationContext();
        this.f26357a = systemClock.mo9469a(looper, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m10049a(boolean z2) {
        if (this.f26358b == z2) {
            return;
        }
        this.f26358b = z2;
    }
}
