package androidx.media3.exoplayer;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
@UnstableApi
public final class PlaybackLooperProvider {

    /* JADX INFO: renamed from: a */
    public final Object f26322a = new Object();

    /* JADX INFO: renamed from: b */
    public Looper f26323b = null;

    /* JADX INFO: renamed from: c */
    public HandlerThread f26324c = null;

    /* JADX INFO: renamed from: d */
    public int f26325d = 0;

    /* JADX INFO: renamed from: a */
    public final void m10029a() {
        HandlerThread handlerThread;
        synchronized (this.f26322a) {
            try {
                Assertions.m9464e(this.f26325d > 0);
                int i = this.f26325d - 1;
                this.f26325d = i;
                if (i == 0 && (handlerThread = this.f26324c) != null) {
                    handlerThread.quit();
                    this.f26324c = null;
                    this.f26323b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
