package io.ktor.utils.p043io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/jvm/javaio/DefaultParking;", "Lio/ktor/utils/io/jvm/javaio/Parking;", "Ljava/lang/Thread;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
final class DefaultParking implements Parking<Thread> {

    /* JADX INFO: renamed from: a */
    public static final DefaultParking f47466a = new DefaultParking();

    @Override // io.ktor.utils.p043io.jvm.javaio.Parking
    /* JADX INFO: renamed from: a */
    public final void mo17571a(long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LockSupport.parkNanos(j);
    }

    @Override // io.ktor.utils.p043io.jvm.javaio.Parking
    /* JADX INFO: renamed from: b */
    public final void mo17572b(Object obj) {
        Thread token = (Thread) obj;
        Intrinsics.m18599g(token, "token");
        LockSupport.unpark(token);
    }
}
