package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/DeflaterSink;", "Lokio/Sink;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DeflaterSink implements Sink {

    /* JADX INFO: renamed from: a */
    public final RealBufferedSink f57845a;

    /* JADX INFO: renamed from: b */
    public final Deflater f57846b;

    /* JADX INFO: renamed from: c */
    public boolean f57847c;

    public DeflaterSink(Buffer buffer, Deflater deflater) {
        this.f57845a = Okio.m21670c(buffer);
        this.f57846b = deflater;
    }

    /* JADX INFO: renamed from: a */
    public final void m21635a(boolean z2) throws IOException {
        Segment segmentM21604w0;
        int iDeflate;
        RealBufferedSink realBufferedSink = this.f57845a;
        Buffer buffer = realBufferedSink.f57893b;
        while (true) {
            segmentM21604w0 = buffer.m21604w0(1);
            Deflater deflater = this.f57846b;
            byte[] bArr = segmentM21604w0.f57899a;
            if (z2) {
                try {
                    int i = segmentM21604w0.f57901c;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i2 = segmentM21604w0.f57901c;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                segmentM21604w0.f57901c += iDeflate;
                buffer.f57830b += (long) iDeflate;
                realBufferedSink.m21689a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (segmentM21604w0.f57900b == segmentM21604w0.f57901c) {
            buffer.f57829a = segmentM21604w0.m21706a();
            SegmentPool.m21710a(segmentM21604w0);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f57846b;
        if (this.f57847c) {
            return;
        }
        try {
            deflater.finish();
            m21635a(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f57845a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f57847c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        m21635a(true);
        this.f57845a.flush();
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: o0 */
    public final void mo12451o0(Buffer source, long j) throws IOException {
        Intrinsics.m18599g(source, "source");
        SegmentedByteString.m21554b(source.f57830b, 0L, j);
        while (j > 0) {
            Segment segment = source.f57829a;
            Intrinsics.m18596d(segment);
            int iMin = (int) Math.min(j, segment.f57901c - segment.f57900b);
            this.f57846b.setInput(segment.f57899a, segment.f57900b, iMin);
            m21635a(false);
            long j2 = iMin;
            source.f57830b -= j2;
            int i = segment.f57900b + iMin;
            segment.f57900b = i;
            if (i == segment.f57901c) {
                source.f57829a = segment.m21706a();
                SegmentPool.m21710a(segment);
            }
            j -= j2;
        }
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF57883b() {
        return this.f57845a.f57892a.getF57883b();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f57845a + ')';
    }
}
