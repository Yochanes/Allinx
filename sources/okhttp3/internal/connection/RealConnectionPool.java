package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Address;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RealConnectionPool {

    /* JADX INFO: renamed from: a */
    public final long f57449a;

    /* JADX INFO: renamed from: b */
    public final TaskQueue f57450b;

    /* JADX INFO: renamed from: c */
    public final RealConnectionPool$cleanupTask$1 f57451c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentLinkedQueue f57452d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public RealConnectionPool(TaskRunner taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.m18599g(taskRunner, "taskRunner");
        Intrinsics.m18599g(timeUnit, "timeUnit");
        this.f57449a = timeUnit.toNanos(5L);
        this.f57450b = taskRunner.m21379e();
        this.f57451c = new RealConnectionPool$cleanupTask$1(this, AbstractC0000a.m19p(new StringBuilder(), Util.f57280g, " ConnectionPool"));
        this.f57452d = new ConcurrentLinkedQueue();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21414a(Address address, RealCall call, ArrayList arrayList, boolean z2) {
        Intrinsics.m18599g(call, "call");
        Iterator it = this.f57452d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            RealConnection connection = (RealConnection) it.next();
            Intrinsics.m18598f(connection, "connection");
            synchronized (connection) {
                if (z2) {
                    if (!(connection.f57432g != null)) {
                        continue;
                    }
                }
                if (connection.m21409h(address, arrayList)) {
                    call.m21394b(connection);
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m21415b(RealConnection realConnection, long j) {
        byte[] bArr = Util.f57274a;
        ArrayList arrayList = realConnection.f57441p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + realConnection.f57427b.f57264a.f56983h + " was leaked. Did you forget to close a response body?";
                Platform platform = Platform.f57701a;
                Platform.f57701a.mo21512k(((RealCall.CallReference) reference).f57425a, str);
                arrayList.remove(i);
                realConnection.f57435j = true;
                if (arrayList.isEmpty()) {
                    realConnection.f57442q = j - this.f57449a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
