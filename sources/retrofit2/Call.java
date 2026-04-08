package retrofit2;

import okhttp3.Request;
import okio.Timeout;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    /* JADX INFO: renamed from: clone */
    Call mo22754clone();

    void enqueue(Callback callback);

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    Timeout timeout();
}
