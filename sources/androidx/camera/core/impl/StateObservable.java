package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Observable;
import com.google.auto.value.AutoValue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public abstract class StateObservable<T> implements Observable<T> {

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class ErrorWrapper {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ObserverWrapper<T> implements Runnable {

        /* JADX INFO: renamed from: a */
        public static final Object f2780a = null;

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                throw null;
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    /* JADX INFO: renamed from: a */
    public final void mo1474a(Observable.Observer observer) {
        throw null;
    }

    @Override // androidx.camera.core.impl.Observable
    /* JADX INFO: renamed from: b */
    public final void mo1475b(Executor executor, Observable.Observer observer) {
        throw null;
    }
}
