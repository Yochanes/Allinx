package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.SystemClock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class WifiLockManager {

    /* JADX INFO: renamed from: a */
    public final HandlerWrapper f26359a;

    /* JADX INFO: renamed from: b */
    public boolean f26360b;

    /* JADX INFO: compiled from: Proguard */
    public static final class WifiLockManagerInternal {
    }

    public WifiLockManager(Context context, Looper looper, SystemClock systemClock) {
        context.getApplicationContext();
        this.f26359a = systemClock.mo9469a(looper, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m10050a(boolean z2) {
        if (this.f26360b == z2) {
            return;
        }
        this.f26360b = z2;
    }
}
