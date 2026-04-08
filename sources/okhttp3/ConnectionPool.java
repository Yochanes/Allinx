package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/ConnectionPool;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ConnectionPool {

    /* JADX INFO: renamed from: a */
    public final RealConnectionPool f57061a;

    public ConnectionPool() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.m18599g(timeUnit, "timeUnit");
        this.f57061a = new RealConnectionPool(TaskRunner.f57360i);
    }
}
