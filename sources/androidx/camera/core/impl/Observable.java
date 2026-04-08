package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface Observable<T> {

    /* JADX INFO: compiled from: Proguard */
    public interface Observer<T> {
        /* JADX INFO: renamed from: a */
        void mo1510a(Object obj);

        void onError(Throwable th);
    }

    /* JADX INFO: renamed from: a */
    void mo1474a(Observer observer);

    /* JADX INFO: renamed from: b */
    void mo1475b(Executor executor, Observer observer);
}
