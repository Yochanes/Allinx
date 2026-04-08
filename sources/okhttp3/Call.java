package okhttp3;

import kotlin.Metadata;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/Call;", "", "Factory", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface Call extends Cloneable {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/Call$Factory;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public interface Factory {
        /* JADX INFO: renamed from: a */
        RealCall mo21188a(Request request);
    }

    void cancel();

    /* JADX INFO: renamed from: g */
    void mo21187g(Callback callback);

    /* JADX INFO: renamed from: isCanceled */
    boolean getF57419u();

    /* JADX INFO: renamed from: request */
    Request getF57405b();

    /* JADX INFO: renamed from: timeout */
    RealCall.C63591 getF57409g();
}
