package okio;

import androidx.compose.animation.AbstractC0455a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RealBufferedSource implements BufferedSource {

    /* JADX INFO: renamed from: a */
    public final Source f57895a;

    /* JADX INFO: renamed from: b */
    public final Buffer f57896b;

    /* JADX INFO: renamed from: c */
    public boolean f57897c;

    public RealBufferedSource(Source source) {
        Intrinsics.m18599g(source, "source");
        this.f57895a = source;
        this.f57896b = new Buffer();
    }

    /* JADX INFO: renamed from: C */
    public final String m21691C(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jM21695b = m21695b((byte) 10, 0L, j2);
        Buffer buffer = this.f57896b;
        if (jM21695b != -1) {
            return okio.internal.Buffer.m21714a(buffer, jM21695b);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && buffer.m21597j(j2 - 1) == 13 && request(j2 + 1) && buffer.m21597j(j2) == 10) {
            return okio.internal.Buffer.m21714a(buffer, j2);
        }
        Buffer buffer2 = new Buffer();
        buffer.m21593h(buffer2, 0L, Math.min(32, buffer.f57830b));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.f57830b, j) + " content=" + buffer2.m21570L(buffer2.f57830b).mo21618e() + (char) 8230);
    }

    /* JADX INFO: renamed from: H */
    public final void m21692H(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    /* JADX INFO: renamed from: I */
    public final byte[] mo21568I() {
        Source source = this.f57895a;
        Buffer buffer = this.f57896b;
        buffer.mo21600q0(source);
        return buffer.m21566H(buffer.f57830b);
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: J0 */
    public final long mo12415J0(Buffer sink, long j) {
        Intrinsics.m18599g(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "byteCount < 0: ").toString());
        }
        if (this.f57897c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        Buffer buffer = this.f57896b;
        if (buffer.f57830b == 0 && this.f57895a.mo12415J0(buffer, 8192L) == -1) {
            return -1L;
        }
        return buffer.mo12415J0(sink, Math.min(j, buffer.f57830b));
    }

    /* JADX INFO: renamed from: L */
    public final void m21693L(long j) throws EOFException {
        if (this.f57897c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        while (j > 0) {
            Buffer buffer = this.f57896b;
            if (buffer.f57830b == 0 && this.f57895a.mo12415J0(buffer, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, buffer.f57830b);
            buffer.m21601r0(jMin);
            j -= jMin;
        }
    }

    @Override // okio.BufferedSource
    /* JADX INFO: renamed from: R0 */
    public final long mo21576R0(BufferedSink bufferedSink) {
        Buffer buffer;
        long j = 0;
        while (true) {
            buffer = this.f57896b;
            if (this.f57895a.mo12415J0(buffer, 8192L) == -1) {
                break;
            }
            long jM21590d = buffer.m21590d();
            if (jM21590d > 0) {
                j += jM21590d;
                bufferedSink.mo12451o0(buffer, jM21590d);
            }
        }
        long j2 = buffer.f57830b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        bufferedSink.mo12451o0(buffer, j2);
        return j3;
    }

    @Override // okio.BufferedSource
    /* JADX INFO: renamed from: X0 */
    public final InputStream mo21583X0() {
        return new RealBufferedSource$inputStream$1(this);
    }

    @Override // okio.BufferedSource
    /* JADX INFO: renamed from: Y0 */
    public final int mo21584Y0(Options options) {
        Intrinsics.m18599g(options, "options");
        if (this.f57897c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        while (true) {
            Buffer buffer = this.f57896b;
            int iM21715b = okio.internal.Buffer.m21715b(buffer, options, true);
            if (iM21715b != -2) {
                if (iM21715b != -1) {
                    buffer.m21601r0(options.f57880a[iM21715b].mo21617d());
                    return iM21715b;
                }
            } else if (this.f57895a.mo12415J0(buffer, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21694a() {
        if (this.f57897c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        Buffer buffer = this.f57896b;
        return buffer.m21595i() && this.f57895a.mo12415J0(buffer, 8192L) == -1;
    }

    /* JADX INFO: renamed from: b */
    public final long m21695b(byte b2, long j, long j2) {
        if (this.f57897c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (0 > j2) {
            throw new IllegalArgumentException(AbstractC0455a.m2238m(j2, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j2) {
            Buffer buffer = this.f57896b;
            byte b3 = b2;
            long j3 = j2;
            long jM21599k = buffer.m21599k(b3, jMax, j3);
            if (jM21599k != -1) {
                return jM21599k;
            }
            long j4 = buffer.f57830b;
            if (j4 >= j3 || this.f57895a.mo12415J0(buffer, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b2 = b3;
            j2 = j3;
        }
        return -1L;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Buffer getF57896b() {
        return this.f57896b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f57897c) {
            return;
        }
        this.f57897c = true;
        this.f57895a.close();
        this.f57896b.m21586a();
    }

    /* JADX INFO: renamed from: d */
    public final long m21696d(ByteString targetBytes) {
        Intrinsics.m18599g(targetBytes, "targetBytes");
        if (this.f57897c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        long jMax = 0;
        while (true) {
            Buffer buffer = this.f57896b;
            long jM21602u = buffer.m21602u(jMax, targetBytes);
            if (jM21602u != -1) {
                return jM21602u;
            }
            long j = buffer.f57830b;
            if (this.f57895a.mo12415J0(buffer, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // okio.BufferedSource
    /* JADX INFO: renamed from: e0 */
    public final boolean mo21591e0(long j, ByteString bytes) {
        Intrinsics.m18599g(bytes, "bytes");
        byte[] bArr = bytes.f57842a;
        int length = bArr.length;
        if (this.f57897c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (j >= 0 && length >= 0 && bArr.length >= length) {
            for (int i = 0; i < length; i++) {
                long j2 = ((long) i) + j;
                if (request(1 + j2) && this.f57896b.m21597j(j2) == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final byte m21697g() throws EOFException {
        m21692H(1L);
        return this.f57896b.m21562C();
    }

    /* JADX INFO: renamed from: h */
    public final ByteString m21698h(long j) throws EOFException {
        m21692H(j);
        return this.f57896b.m21570L(j);
    }

    /* JADX INFO: renamed from: i */
    public final void m21699i(Buffer buffer, long j) throws EOFException {
        Buffer buffer2 = this.f57896b;
        try {
            m21692H(j);
            long j2 = buffer2.f57830b;
            if (j2 >= j) {
                buffer.mo12451o0(buffer2, j);
            } else {
                buffer.mo12451o0(buffer2, j2);
                throw new EOFException();
            }
        } catch (EOFException e) {
            buffer.mo21600q0(buffer2);
            throw e;
        }
    }

    @Override // okio.BufferedSource
    /* JADX INFO: renamed from: i0 */
    public final String mo21596i0(Charset charset) {
        Buffer buffer = this.f57896b;
        buffer.mo21600q0(this.f57895a);
        return buffer.m21592g0(buffer.f57830b, charset);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f57897c;
    }

    /* JADX INFO: renamed from: j */
    public final int m21700j() throws EOFException {
        m21692H(4L);
        return this.f57896b.m21577S();
    }

    /* JADX INFO: renamed from: k */
    public final int m21701k() throws EOFException {
        m21692H(4L);
        int iM21577S = this.f57896b.m21577S();
        return ((iM21577S & 255) << 24) | (((-16777216) & iM21577S) >>> 24) | ((16711680 & iM21577S) >>> 8) | ((65280 & iM21577S) << 8);
    }

    /* JADX INFO: renamed from: n */
    public final long m21702n() throws EOFException {
        m21692H(8L);
        long jM21580V = this.f57896b.m21580V();
        return ((jM21580V & 255) << 56) | (((-72057594037927936L) & jM21580V) >>> 56) | ((71776119061217280L & jM21580V) >>> 40) | ((280375465082880L & jM21580V) >>> 24) | ((1095216660480L & jM21580V) >>> 8) | ((4278190080L & jM21580V) << 8) | ((16711680 & jM21580V) << 24) | ((65280 & jM21580V) << 40);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.m18599g(sink, "sink");
        Buffer buffer = this.f57896b;
        if (buffer.f57830b == 0 && this.f57895a.mo12415J0(buffer, 8192L) == -1) {
            return -1;
        }
        return buffer.read(sink);
    }

    @Override // okio.BufferedSource
    public final boolean request(long j) {
        Buffer buffer;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "byteCount < 0: ").toString());
        }
        if (this.f57897c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        do {
            buffer = this.f57896b;
            if (buffer.f57830b >= j) {
                return true;
            }
        } while (this.f57895a.mo12415J0(buffer, 8192L) != -1);
        return false;
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.f57895a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f57895a + ')';
    }

    /* JADX INFO: renamed from: u */
    public final short m21703u() throws EOFException {
        m21692H(2L);
        return this.f57896b.m21582W();
    }

    /* JADX INFO: renamed from: x */
    public final short m21704x() throws EOFException {
        m21692H(2L);
        return this.f57896b.m21588b0();
    }

    /* JADX INFO: renamed from: z */
    public final String m21705z(long j) throws EOFException {
        m21692H(j);
        Buffer buffer = this.f57896b;
        buffer.getClass();
        return buffer.m21592g0(j, Charsets.f55167a);
    }
}
