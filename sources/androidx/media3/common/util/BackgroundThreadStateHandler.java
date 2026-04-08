package androidx.media3.common.util;

import android.os.Looper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BackgroundThreadStateHandler<T> {

    /* JADX INFO: renamed from: a */
    public final HandlerWrapper f25574a;

    /* JADX INFO: renamed from: b */
    public final HandlerWrapper f25575b;

    /* JADX INFO: renamed from: c */
    public final StateChangeListener f25576c;

    /* JADX INFO: renamed from: d */
    public Object f25577d;

    /* JADX INFO: renamed from: e */
    public Object f25578e;

    /* JADX INFO: compiled from: Proguard */
    public interface StateChangeListener<T> {
        /* JADX INFO: renamed from: a */
        void mo9468a(Object obj, Object obj2);
    }

    public BackgroundThreadStateHandler(Object obj, Looper looper, Looper looper2, SystemClock systemClock, StateChangeListener stateChangeListener) {
        this.f25574a = systemClock.mo9469a(looper, null);
        this.f25575b = systemClock.mo9469a(looper2, null);
        this.f25577d = obj;
        this.f25578e = obj;
        this.f25576c = stateChangeListener;
    }
}
