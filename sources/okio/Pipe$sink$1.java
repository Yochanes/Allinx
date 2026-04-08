package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okio/Pipe$sink$1", "Lokio/Sink;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Pipe$sink$1 implements Sink {
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        throw null;
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: o0 */
    public final void mo12451o0(Buffer source, long j) {
        Intrinsics.m18599g(source, "source");
        throw null;
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF57883b() {
        return null;
    }
}
