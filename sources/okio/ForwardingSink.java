package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/ForwardingSink;", "Lokio/Sink;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class ForwardingSink implements Sink {

    /* JADX INFO: renamed from: a */
    public final Sink f57864a;

    public ForwardingSink(Sink delegate) {
        Intrinsics.m18599g(delegate, "delegate");
        this.f57864a = delegate;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f57864a.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.f57864a.flush();
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: o0 */
    public void mo12451o0(Buffer source, long j) {
        Intrinsics.m18599g(source, "source");
        this.f57864a.mo12451o0(source, j);
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return this.f57864a.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f57864a + ')';
    }
}
