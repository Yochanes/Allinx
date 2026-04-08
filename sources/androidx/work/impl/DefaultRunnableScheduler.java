package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class DefaultRunnableScheduler implements RunnableScheduler {

    /* JADX INFO: renamed from: a */
    public final Handler f32666a = HandlerCompat.m7647a(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public final void m12114a(Runnable runnable) {
        this.f32666a.removeCallbacks(runnable);
    }

    /* JADX INFO: renamed from: b */
    public final void m12115b(Runnable runnable, long j) {
        this.f32666a.postDelayed(runnable, j);
    }
}
