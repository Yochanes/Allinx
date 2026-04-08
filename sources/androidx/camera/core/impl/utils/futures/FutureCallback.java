package androidx.camera.core.impl.utils.futures;

import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface FutureCallback<V> {
    void onFailure(Throwable th);

    void onSuccess(Object obj);
}
