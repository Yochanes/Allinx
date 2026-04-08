package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okio/Pipe$source$1", "Lokio/Source;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Pipe$source$1 implements Source {
    @Override // okio.Source
    /* JADX INFO: renamed from: J0 */
    public final long mo12415J0(Buffer sink, long j) {
        Intrinsics.m18599g(sink, "sink");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF57877b() {
        return null;
    }
}
