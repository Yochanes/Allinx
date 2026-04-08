package okio;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okio/Timeout$Companion$NONE$1", "Lokio/Timeout;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Timeout$Companion$NONE$1 extends Timeout {
    @Override // okio.Timeout
    /* JADX INFO: renamed from: g */
    public final Timeout mo21657g(long j, TimeUnit unit) {
        Intrinsics.m18599g(unit, "unit");
        return this;
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: f */
    public final void mo21656f() {
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: d */
    public final Timeout mo21654d(long j) {
        return this;
    }
}
