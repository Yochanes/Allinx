package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/ForwardingTimeout;", "Lokio/Timeout;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public class ForwardingTimeout extends Timeout {

    /* JADX INFO: renamed from: e */
    public Timeout f57866e;

    public ForwardingTimeout(Timeout delegate) {
        Intrinsics.m18599g(delegate, "delegate");
        this.f57866e = delegate;
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: a */
    public final Timeout mo21651a() {
        return this.f57866e.mo21651a();
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: b */
    public final Timeout mo21652b() {
        return this.f57866e.mo21652b();
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: c */
    public final long mo21653c() {
        return this.f57866e.mo21653c();
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: d */
    public final Timeout mo21654d(long j) {
        return this.f57866e.mo21654d(j);
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: e */
    public final boolean getF57913a() {
        return this.f57866e.getF57913a();
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: f */
    public final void mo21656f() throws InterruptedIOException {
        this.f57866e.mo21656f();
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: g */
    public final Timeout mo21657g(long j, TimeUnit unit) {
        Intrinsics.m18599g(unit, "unit");
        return this.f57866e.mo21657g(j, unit);
    }

    @Override // okio.Timeout
    /* JADX INFO: renamed from: h */
    public final long getF57915c() {
        return this.f57866e.getF57915c();
    }
}
