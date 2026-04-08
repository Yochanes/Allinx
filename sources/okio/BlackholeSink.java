package okio;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/BlackholeSink;", "Lokio/Sink;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class BlackholeSink implements Sink {
    @Override // okio.Sink
    /* JADX INFO: renamed from: o0 */
    public final void mo12451o0(Buffer source, long j) throws EOFException {
        Intrinsics.m18599g(source, "source");
        source.m21601r0(j);
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF57883b() {
        return Timeout.f57912d;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
    }
}
