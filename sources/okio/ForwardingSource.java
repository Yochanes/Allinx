package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/ForwardingSource;", "Lokio/Source;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class ForwardingSource implements Source {

    /* JADX INFO: renamed from: a */
    public final Source f57865a;

    public ForwardingSource(Source delegate) {
        Intrinsics.m18599g(delegate, "delegate");
        this.f57865a = delegate;
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: J0 */
    public long mo12415J0(Buffer sink, long j) {
        Intrinsics.m18599g(sink, "sink");
        return this.f57865a.mo12415J0(sink, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f57865a.close();
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF57877b() {
        return this.f57865a.getF57877b();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f57865a + ')';
    }
}
