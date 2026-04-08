package okio;

import androidx.compose.animation.AbstractC0455a;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "UnsafeCursor", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a */
    public Segment f57829a;

    /* JADX INFO: renamed from: b */
    public long f57830b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class UnsafeCursor implements Closeable {

        /* JADX INFO: renamed from: a */
        public Buffer f57831a;

        /* JADX INFO: renamed from: b */
        public boolean f57832b;

        /* JADX INFO: renamed from: c */
        public Segment f57833c;

        /* JADX INFO: renamed from: f */
        public byte[] f57835f;

        /* JADX INFO: renamed from: d */
        public long f57834d = -1;

        /* JADX INFO: renamed from: g */
        public int f57836g = -1;

        /* JADX INFO: renamed from: i */
        public int f57837i = -1;

        /* JADX INFO: renamed from: a */
        public final void m21609a(long j) {
            Buffer buffer = this.f57831a;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f57832b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long j2 = buffer.f57830b;
            if (j <= j2) {
                if (j < 0) {
                    throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "newSize < 0: ").toString());
                }
                long j3 = j2 - j;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    Segment segment = buffer.f57829a;
                    Intrinsics.m18596d(segment);
                    Segment segment2 = segment.f57905g;
                    Intrinsics.m18596d(segment2);
                    int i = segment2.f57901c;
                    long j4 = i - segment2.f57900b;
                    if (j4 > j3) {
                        segment2.f57901c = i - ((int) j3);
                        break;
                    } else {
                        buffer.f57829a = segment2.m21706a();
                        SegmentPool.m21710a(segment2);
                        j3 -= j4;
                    }
                }
                this.f57833c = null;
                this.f57834d = j;
                this.f57835f = null;
                this.f57836g = -1;
                this.f57837i = -1;
            } else if (j > j2) {
                long j5 = j - j2;
                int i2 = 1;
                boolean z2 = true;
                for (long j6 = 0; j5 > j6; j6 = 0) {
                    Segment segmentM21604w0 = buffer.m21604w0(i2);
                    int iMin = (int) Math.min(j5, 8192 - segmentM21604w0.f57901c);
                    int i3 = segmentM21604w0.f57901c + iMin;
                    segmentM21604w0.f57901c = i3;
                    j5 -= (long) iMin;
                    if (z2) {
                        this.f57833c = segmentM21604w0;
                        this.f57834d = j2;
                        this.f57835f = segmentM21604w0.f57899a;
                        this.f57836g = i3 - iMin;
                        this.f57837i = i3;
                        z2 = false;
                    }
                    i2 = 1;
                }
            }
            buffer.f57830b = j;
        }

        /* JADX INFO: renamed from: b */
        public final int m21610b(long j) {
            Buffer buffer = this.f57831a;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j >= -1) {
                long j2 = buffer.f57830b;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.f57833c = null;
                        this.f57834d = j;
                        this.f57835f = null;
                        this.f57836g = -1;
                        this.f57837i = -1;
                        return -1;
                    }
                    Segment segment = buffer.f57829a;
                    Segment segment2 = this.f57833c;
                    long j3 = 0;
                    if (segment2 != null) {
                        long j4 = this.f57834d - ((long) (this.f57836g - segment2.f57900b));
                        if (j4 > j) {
                            segment2 = segment;
                            segment = segment2;
                            j2 = j4;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        segment2 = segment;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            Intrinsics.m18596d(segment2);
                            long j5 = ((long) (segment2.f57901c - segment2.f57900b)) + j3;
                            if (j < j5) {
                                break;
                            }
                            segment2 = segment2.f57904f;
                            j3 = j5;
                        }
                    } else {
                        while (j2 > j) {
                            Intrinsics.m18596d(segment);
                            segment = segment.f57905g;
                            Intrinsics.m18596d(segment);
                            j2 -= (long) (segment.f57901c - segment.f57900b);
                        }
                        segment2 = segment;
                        j3 = j2;
                    }
                    if (this.f57832b) {
                        Intrinsics.m18596d(segment2);
                        if (segment2.f57902d) {
                            byte[] bArr = segment2.f57899a;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            Intrinsics.m18598f(bArrCopyOf, "copyOf(...)");
                            Segment segment3 = new Segment(bArrCopyOf, segment2.f57900b, segment2.f57901c, false, true);
                            if (buffer.f57829a == segment2) {
                                buffer.f57829a = segment3;
                            }
                            segment2.m21707b(segment3);
                            Segment segment4 = segment3.f57905g;
                            Intrinsics.m18596d(segment4);
                            segment4.m21706a();
                            segment2 = segment3;
                        }
                    }
                    this.f57833c = segment2;
                    this.f57834d = j;
                    Intrinsics.m18596d(segment2);
                    this.f57835f = segment2.f57899a;
                    int i = segment2.f57900b + ((int) (j - j3));
                    this.f57836g = i;
                    int i2 = segment2.f57901c;
                    this.f57837i = i2;
                    return i2 - i;
                }
            }
            StringBuilder sbM22s = AbstractC0000a.m22s("offset=", " > size=", j);
            sbM22s.append(buffer.f57830b);
            throw new ArrayIndexOutOfBoundsException(sbM22s.toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f57831a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f57831a = null;
            this.f57833c = null;
            this.f57834d = -1L;
            this.f57835f = null;
            this.f57836g = -1;
            this.f57837i = -1;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m21561B0(byte[] source, int i, int i2) {
        Intrinsics.m18599g(source, "source");
        long j = i2;
        SegmentedByteString.m21554b(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment segmentM21604w0 = m21604w0(1);
            int iMin = Math.min(i3 - i, 8192 - segmentM21604w0.f57901c);
            int i4 = i + iMin;
            ArraysKt.m18380o(source, segmentM21604w0.f57901c, segmentM21604w0.f57899a, i, i4);
            segmentM21604w0.f57901c += iMin;
            i = i4;
        }
        this.f57830b += j;
    }

    /* JADX INFO: renamed from: C */
    public final byte m21562C() throws EOFException {
        if (this.f57830b == 0) {
            throw new EOFException();
        }
        Segment segment = this.f57829a;
        Intrinsics.m18596d(segment);
        int i = segment.f57900b;
        int i2 = segment.f57901c;
        int i3 = i + 1;
        byte b2 = segment.f57899a[i];
        this.f57830b--;
        if (i3 != i2) {
            segment.f57900b = i3;
            return b2;
        }
        this.f57829a = segment.m21706a();
        SegmentPool.m21710a(segment);
        return b2;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m21563C0(int i) {
        Segment segmentM21604w0 = m21604w0(1);
        int i2 = segmentM21604w0.f57901c;
        segmentM21604w0.f57901c = i2 + 1;
        segmentM21604w0.f57899a[i2] = (byte) i;
        this.f57830b++;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m21564F0(long j) {
        boolean z2;
        byte[] bArr;
        if (j == 0) {
            m21563C0(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m21578S0("-9223372036854775808");
                return;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z2) {
            i++;
        }
        Segment segmentM21604w0 = m21604w0(i);
        int i2 = segmentM21604w0.f57901c + i;
        while (true) {
            bArr = segmentM21604w0.f57899a;
            if (j == 0) {
                break;
            }
            long j2 = 10;
            i2--;
            bArr[i2] = okio.internal.Buffer.f57920a[(int) (j % j2)];
            j /= j2;
        }
        if (z2) {
            bArr[i2 - 1] = 45;
        }
        segmentM21604w0.f57901c += i;
        this.f57830b += (long) i;
    }

    @Override // okio.BufferedSink
    /* JADX INFO: renamed from: G0 */
    public final /* bridge */ /* synthetic */ BufferedSink mo21565G0(ByteString byteString) {
        m21606x0(byteString);
        return this;
    }

    /* JADX INFO: renamed from: H */
    public final byte[] m21566H(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "byteCount: ").toString());
        }
        if (this.f57830b < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        m21573N(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m21567H0(long j) {
        if (j == 0) {
            m21563C0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentM21604w0 = m21604w0(i);
        int i2 = segmentM21604w0.f57901c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            segmentM21604w0.f57899a[i3] = okio.internal.Buffer.f57920a[(int) (15 & j)];
            j >>>= 4;
        }
        segmentM21604w0.f57901c += i;
        this.f57830b += (long) i;
    }

    @Override // okio.BufferedSource
    /* JADX INFO: renamed from: I */
    public final byte[] mo21568I() {
        return m21566H(this.f57830b);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m21569I0(int i) {
        Segment segmentM21604w0 = m21604w0(4);
        int i2 = segmentM21604w0.f57901c;
        byte[] bArr = segmentM21604w0.f57899a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        segmentM21604w0.f57901c = i2 + 4;
        this.f57830b += 4;
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: J0 */
    public final long mo12415J0(Buffer sink, long j) {
        Intrinsics.m18599g(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "byteCount < 0: ").toString());
        }
        long j2 = this.f57830b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        sink.mo12451o0(this, j);
        return j;
    }

    /* JADX INFO: renamed from: L */
    public final ByteString m21570L(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "byteCount: ").toString());
        }
        if (this.f57830b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(m21566H(j));
        }
        ByteString byteStringM21603u0 = m21603u0((int) j);
        m21601r0(j);
        return byteStringM21603u0;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m21571L0(int i) {
        Segment segmentM21604w0 = m21604w0(2);
        int i2 = segmentM21604w0.f57901c;
        byte[] bArr = segmentM21604w0.f57899a;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        segmentM21604w0.f57901c = i2 + 2;
        this.f57830b += 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r1 = new okio.Buffer();
        r1.m21564F0(r8);
        r1.m21563C0(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r2 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r1.m21562C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.m21594h0()));
     */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m21572M() throws EOFException {
        long j;
        long j2 = 0;
        if (this.f57830b == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z2 = false;
        long j3 = 0;
        long j4 = -7;
        boolean z3 = false;
        loop0: while (true) {
            Segment segment = this.f57829a;
            Intrinsics.m18596d(segment);
            int i2 = segment.f57900b;
            int i3 = segment.f57901c;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                byte b2 = segment.f57899a[i2];
                if (b2 < 48 || b2 > 57) {
                    j = j2;
                    if (b2 != 45 || i != 0) {
                        break;
                    }
                    j4--;
                    z2 = true;
                } else {
                    int i4 = 48 - b2;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    if (j3 == -922337203685477580L) {
                        j = j2;
                        if (i4 < j4) {
                            break loop0;
                        }
                    } else {
                        j = j2;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                }
                i2++;
                i++;
                j2 = j;
            }
            z3 = true;
            if (i2 == i3) {
                this.f57829a = segment.m21706a();
                SegmentPool.m21710a(segment);
            } else {
                segment.f57900b = i2;
            }
            if (z3 || this.f57829a == null) {
                break;
            }
            j2 = j;
        }
        long j5 = this.f57830b - ((long) i);
        this.f57830b = j5;
        if (i >= (z2 ? 2 : 1)) {
            return z2 ? j3 : -j3;
        }
        if (j5 == j) {
            throw new EOFException();
        }
        StringBuilder sbM21r = AbstractC0000a.m21r(z2 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        sbM21r.append(SegmentedByteString.m21555c(m21597j(j)));
        throw new NumberFormatException(sbM21r.toString());
    }

    /* JADX INFO: renamed from: N */
    public final void m21573N(byte[] sink) throws EOFException {
        Intrinsics.m18599g(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int i2 = read(sink, i, sink.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m21574O0(int i, int i2, String string) {
        char cCharAt;
        Intrinsics.m18599g(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC0455a.m2237l(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > string.length()) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i2, "endIndex > string.length: ", " > ");
            sbM20q.append(string.length());
            throw new IllegalArgumentException(sbM20q.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = string.charAt(i);
            if (cCharAt2 < 128) {
                Segment segmentM21604w0 = m21604w0(1);
                int i3 = segmentM21604w0.f57901c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = segmentM21604w0.f57899a;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = segmentM21604w0.f57901c;
                int i6 = (i3 + i) - i5;
                segmentM21604w0.f57901c = i5 + i6;
                this.f57830b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentM21604w02 = m21604w0(2);
                    int i7 = segmentM21604w02.f57901c;
                    byte[] bArr2 = segmentM21604w02.f57899a;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    segmentM21604w02.f57901c = i7 + 2;
                    this.f57830b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentM21604w03 = m21604w0(3);
                    int i8 = segmentM21604w03.f57901c;
                    byte[] bArr3 = segmentM21604w03.f57899a;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    segmentM21604w03.f57901c = i8 + 3;
                    this.f57830b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? string.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m21563C0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentM21604w04 = m21604w0(4);
                        int i11 = segmentM21604w04.f57901c;
                        byte[] bArr4 = segmentM21604w04.f57899a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        segmentM21604w04.f57901c = i11 + 4;
                        this.f57830b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[EDGE_INSN: B:43:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m21575R() throws EOFException {
        int i;
        if (this.f57830b == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z2 = false;
        long j = 0;
        do {
            Segment segment = this.f57829a;
            Intrinsics.m18596d(segment);
            int i3 = segment.f57900b;
            int i4 = segment.f57901c;
            while (i3 < i4) {
                byte b2 = segment.f57899a[i3];
                if (b2 >= 48 && b2 <= 57) {
                    i = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i = b2 - 87;
                } else if (b2 >= 65 && b2 <= 70) {
                    i = b2 - 55;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(SegmentedByteString.m21555c(b2)));
                    }
                    z2 = true;
                    if (i3 != i4) {
                        this.f57829a = segment.m21706a();
                        SegmentPool.m21710a(segment);
                    } else {
                        segment.f57900b = i3;
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    Buffer buffer = new Buffer();
                    buffer.m21567H0(j);
                    buffer.m21563C0(b2);
                    throw new NumberFormatException("Number too large: ".concat(buffer.m21594h0()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z2) {
            }
        } while (this.f57829a != null);
        this.f57830b -= (long) i2;
        return j;
    }

    @Override // okio.BufferedSource
    /* JADX INFO: renamed from: R0 */
    public final long mo21576R0(BufferedSink bufferedSink) {
        long j = this.f57830b;
        if (j > 0) {
            bufferedSink.mo12451o0(this, j);
        }
        return j;
    }

    /* JADX INFO: renamed from: S */
    public final int m21577S() throws EOFException {
        if (this.f57830b < 4) {
            throw new EOFException();
        }
        Segment segment = this.f57829a;
        Intrinsics.m18596d(segment);
        int i = segment.f57900b;
        int i2 = segment.f57901c;
        if (i2 - i < 4) {
            return ((m21562C() & UnsignedBytes.MAX_VALUE) << 24) | ((m21562C() & UnsignedBytes.MAX_VALUE) << 16) | ((m21562C() & UnsignedBytes.MAX_VALUE) << 8) | (m21562C() & UnsignedBytes.MAX_VALUE);
        }
        byte[] bArr = segment.f57899a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & UnsignedBytes.MAX_VALUE);
        this.f57830b -= 4;
        if (i5 != i2) {
            segment.f57900b = i5;
            return i6;
        }
        this.f57829a = segment.m21706a();
        SegmentPool.m21710a(segment);
        return i6;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m21578S0(String string) {
        Intrinsics.m18599g(string, "string");
        m21574O0(0, string.length(), string);
    }

    @Override // okio.BufferedSink
    /* JADX INFO: renamed from: U0 */
    public final /* bridge */ /* synthetic */ BufferedSink mo21579U0(long j) {
        m21564F0(j);
        return this;
    }

    /* JADX INFO: renamed from: V */
    public final long m21580V() throws EOFException {
        if (this.f57830b < 8) {
            throw new EOFException();
        }
        Segment segment = this.f57829a;
        Intrinsics.m18596d(segment);
        int i = segment.f57900b;
        int i2 = segment.f57901c;
        if (i2 - i < 8) {
            return ((((long) m21577S()) & 4294967295L) << 32) | (4294967295L & ((long) m21577S()));
        }
        byte[] bArr = segment.f57899a;
        int i3 = i + 7;
        long j = ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        this.f57830b -= 8;
        if (i4 != i2) {
            segment.f57900b = i4;
            return j2;
        }
        this.f57829a = segment.m21706a();
        SegmentPool.m21710a(segment);
        return j2;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m21581V0(int i) {
        if (i < 128) {
            m21563C0(i);
            return;
        }
        if (i < 2048) {
            Segment segmentM21604w0 = m21604w0(2);
            int i2 = segmentM21604w0.f57901c;
            byte[] bArr = segmentM21604w0.f57899a;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            segmentM21604w0.f57901c = i2 + 2;
            this.f57830b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m21563C0(63);
            return;
        }
        if (i < 65536) {
            Segment segmentM21604w02 = m21604w0(3);
            int i3 = segmentM21604w02.f57901c;
            byte[] bArr2 = segmentM21604w02.f57899a;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            bArr2[i3 + 2] = (byte) ((i & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            segmentM21604w02.f57901c = i3 + 3;
            this.f57830b += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(SegmentedByteString.m21556d(i)));
        }
        Segment segmentM21604w03 = m21604w0(4);
        int i4 = segmentM21604w03.f57901c;
        byte[] bArr3 = segmentM21604w03.f57899a;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        bArr3[i4 + 3] = (byte) ((i & 63) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        segmentM21604w03.f57901c = i4 + 4;
        this.f57830b += 4;
    }

    /* JADX INFO: renamed from: W */
    public final short m21582W() throws EOFException {
        if (this.f57830b < 2) {
            throw new EOFException();
        }
        Segment segment = this.f57829a;
        Intrinsics.m18596d(segment);
        int i = segment.f57900b;
        int i2 = segment.f57901c;
        if (i2 - i < 2) {
            return (short) (((m21562C() & UnsignedBytes.MAX_VALUE) << 8) | (m21562C() & UnsignedBytes.MAX_VALUE));
        }
        int i3 = i + 1;
        byte[] bArr = segment.f57899a;
        int i4 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & UnsignedBytes.MAX_VALUE) | i4;
        this.f57830b -= 2;
        if (i5 == i2) {
            this.f57829a = segment.m21706a();
            SegmentPool.m21710a(segment);
        } else {
            segment.f57900b = i5;
        }
        return (short) i6;
    }

    @Override // okio.BufferedSource
    /* JADX INFO: renamed from: X0 */
    public final InputStream mo21583X0() {
        return new Buffer$inputStream$1(this);
    }

    @Override // okio.BufferedSource
    /* JADX INFO: renamed from: Y0 */
    public final int mo21584Y0(Options options) throws EOFException {
        Intrinsics.m18599g(options, "options");
        int iM21715b = okio.internal.Buffer.m21715b(this, options, false);
        if (iM21715b == -1) {
            return -1;
        }
        m21601r0(options.f57880a[iM21715b].mo21617d());
        return iM21715b;
    }

    @Override // okio.BufferedSink
    /* JADX INFO: renamed from: Z */
    public final /* bridge */ /* synthetic */ BufferedSink mo21585Z(String str) {
        m21578S0(str);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final void m21586a() throws EOFException {
        m21601r0(this.f57830b);
    }

    /* JADX INFO: renamed from: b */
    public final Buffer m21587b() {
        Buffer buffer = new Buffer();
        if (this.f57830b == 0) {
            return buffer;
        }
        Segment segment = this.f57829a;
        Intrinsics.m18596d(segment);
        Segment segmentM21708c = segment.m21708c();
        buffer.f57829a = segmentM21708c;
        segmentM21708c.f57905g = segmentM21708c;
        segmentM21708c.f57904f = segmentM21708c;
        for (Segment segment2 = segment.f57904f; segment2 != segment; segment2 = segment2.f57904f) {
            Segment segment3 = segmentM21708c.f57905g;
            Intrinsics.m18596d(segment3);
            Intrinsics.m18596d(segment2);
            segment3.m21707b(segment2.m21708c());
        }
        buffer.f57830b = this.f57830b;
        return buffer;
    }

    /* JADX INFO: renamed from: b0 */
    public final short m21588b0() throws EOFException {
        short sM21582W = m21582W();
        return (short) (((sM21582W & 255) << 8) | ((65280 & sM21582W) >>> 8));
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m21587b();
    }

    /* JADX INFO: renamed from: d */
    public final long m21590d() {
        long j = this.f57830b;
        if (j == 0) {
            return 0L;
        }
        Segment segment = this.f57829a;
        Intrinsics.m18596d(segment);
        Segment segment2 = segment.f57905g;
        Intrinsics.m18596d(segment2);
        int i = segment2.f57901c;
        return (i >= 8192 || !segment2.f57903e) ? j : j - ((long) (i - segment2.f57900b));
    }

    @Override // okio.BufferedSource
    /* JADX INFO: renamed from: e0 */
    public final boolean mo21591e0(long j, ByteString bytes) {
        Intrinsics.m18599g(bytes, "bytes");
        int iMo21617d = bytes.mo21617d();
        if (j >= 0 && iMo21617d >= 0 && this.f57830b - j >= iMo21617d && bytes.mo21617d() >= iMo21617d) {
            for (int i = 0; i < iMo21617d; i++) {
                if (m21597j(((long) i) + j) == bytes.mo21621j(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z2 = true;
        if (this == obj) {
            return true;
        }
        boolean z3 = false;
        if (!(obj instanceof Buffer)) {
            return false;
        }
        long j = this.f57830b;
        Buffer buffer = (Buffer) obj;
        if (j != buffer.f57830b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        Segment segment = this.f57829a;
        Intrinsics.m18596d(segment);
        Segment segment2 = buffer.f57829a;
        Intrinsics.m18596d(segment2);
        int i = segment.f57900b;
        int i2 = segment2.f57900b;
        long j2 = 0;
        while (j2 < this.f57830b) {
            long jMin = Math.min(segment.f57901c - i, segment2.f57901c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                boolean z4 = z2;
                byte b2 = segment.f57899a[i];
                int i4 = i2 + 1;
                boolean z5 = z3;
                if (b2 != segment2.f57899a[i2]) {
                    return z5;
                }
                j3++;
                i2 = i4;
                i = i3;
                z2 = z4;
                z3 = z5;
            }
            boolean z6 = z2;
            boolean z7 = z3;
            if (i == segment.f57901c) {
                Segment segment3 = segment.f57904f;
                Intrinsics.m18596d(segment3);
                i = segment3.f57900b;
                segment = segment3;
            }
            if (i2 == segment2.f57901c) {
                segment2 = segment2.f57904f;
                Intrinsics.m18596d(segment2);
                i2 = segment2.f57900b;
            }
            j2 += jMin;
            z2 = z6;
            z3 = z7;
        }
        return z2;
    }

    /* JADX INFO: renamed from: g0 */
    public final String m21592g0(long j, Charset charset) throws EOFException {
        Intrinsics.m18599g(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "byteCount: ").toString());
        }
        if (this.f57830b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Segment segment = this.f57829a;
        Intrinsics.m18596d(segment);
        int i = segment.f57900b;
        if (((long) i) + j > segment.f57901c) {
            return new String(m21566H(j), charset);
        }
        int i2 = (int) j;
        String str = new String(segment.f57899a, i, i2, charset);
        int i3 = segment.f57900b + i2;
        segment.f57900b = i3;
        this.f57830b -= j;
        if (i3 == segment.f57901c) {
            this.f57829a = segment.m21706a();
            SegmentPool.m21710a(segment);
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public final void m21593h(Buffer out, long j, long j2) {
        Intrinsics.m18599g(out, "out");
        long j3 = j;
        SegmentedByteString.m21554b(this.f57830b, j3, j2);
        if (j2 == 0) {
            return;
        }
        out.f57830b += j2;
        Segment segment = this.f57829a;
        while (true) {
            Intrinsics.m18596d(segment);
            long j4 = segment.f57901c - segment.f57900b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            segment = segment.f57904f;
        }
        Segment segment2 = segment;
        long j5 = j2;
        while (j5 > 0) {
            Intrinsics.m18596d(segment2);
            Segment segmentM21708c = segment2.m21708c();
            int i = segmentM21708c.f57900b + ((int) j3);
            segmentM21708c.f57900b = i;
            segmentM21708c.f57901c = Math.min(i + ((int) j5), segmentM21708c.f57901c);
            Segment segment3 = out.f57829a;
            if (segment3 == null) {
                segmentM21708c.f57905g = segmentM21708c;
                segmentM21708c.f57904f = segmentM21708c;
                out.f57829a = segmentM21708c;
            } else {
                Segment segment4 = segment3.f57905g;
                Intrinsics.m18596d(segment4);
                segment4.m21707b(segmentM21708c);
            }
            j5 -= (long) (segmentM21708c.f57901c - segmentM21708c.f57900b);
            segment2 = segment2.f57904f;
            j3 = 0;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final String m21594h0() {
        return m21592g0(this.f57830b, Charsets.f55167a);
    }

    public final int hashCode() {
        Segment segment = this.f57829a;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.f57901c;
            for (int i3 = segment.f57900b; i3 < i2; i3++) {
                i = (i * 31) + segment.f57899a[i3];
            }
            segment = segment.f57904f;
            Intrinsics.m18596d(segment);
        } while (segment != this.f57829a);
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m21595i() {
        return this.f57830b == 0;
    }

    @Override // okio.BufferedSource
    /* JADX INFO: renamed from: i0 */
    public final String mo21596i0(Charset charset) {
        return m21592g0(this.f57830b, charset);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final byte m21597j(long j) {
        SegmentedByteString.m21554b(this.f57830b, j, 1L);
        Segment segment = this.f57829a;
        if (segment == null) {
            Intrinsics.m18596d(null);
            throw null;
        }
        long j2 = this.f57830b;
        if (j2 - j < j) {
            while (j2 > j) {
                segment = segment.f57905g;
                Intrinsics.m18596d(segment);
                j2 -= (long) (segment.f57901c - segment.f57900b);
            }
            return segment.f57899a[(int) ((((long) segment.f57900b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = segment.f57901c;
            int i2 = segment.f57900b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return segment.f57899a[(int) ((((long) i2) + j) - j3)];
            }
            segment = segment.f57904f;
            Intrinsics.m18596d(segment);
            j3 = j4;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final int m21598j0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f57830b == 0) {
            throw new EOFException();
        }
        byte bM21597j = m21597j(0L);
        if ((bM21597j & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
            i = bM21597j & Ascii.DEL;
            i3 = 0;
            i2 = 1;
        } else if ((bM21597j & 224) == 192) {
            i = bM21597j & Ascii.f42546US;
            i2 = 2;
            i3 = 128;
        } else if ((bM21597j & 240) == 224) {
            i = bM21597j & Ascii.f42543SI;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bM21597j & 248) != 240) {
                m21601r0(1L);
                return 65533;
            }
            i = bM21597j & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (this.f57830b < j) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i2, "size < ", ": ");
            sbM20q.append(this.f57830b);
            sbM20q.append(" (to read code point prefixed 0x");
            sbM20q.append(SegmentedByteString.m21555c(bM21597j));
            sbM20q.append(')');
            throw new EOFException(sbM20q.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bM21597j2 = m21597j(j2);
            if ((bM21597j2 & 192) != 128) {
                m21601r0(j2);
                return 65533;
            }
            i = (i << 6) | (bM21597j2 & 63);
        }
        m21601r0(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    /* JADX INFO: renamed from: k */
    public final long m21599k(byte b2, long j, long j2) {
        Segment segment;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.f57830b + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.f57830b;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (segment = this.f57829a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                segment = segment.f57905g;
                Intrinsics.m18596d(segment);
                j4 -= (long) (segment.f57901c - segment.f57900b);
            }
            while (j4 < j2) {
                int iMin = (int) Math.min(segment.f57901c, (((long) segment.f57900b) + j2) - j4);
                for (int i = (int) ((((long) segment.f57900b) + j) - j4); i < iMin; i++) {
                    if (segment.f57899a[i] == b2) {
                        return ((long) (i - segment.f57900b)) + j4;
                    }
                }
                j4 += (long) (segment.f57901c - segment.f57900b);
                segment = segment.f57904f;
                Intrinsics.m18596d(segment);
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (segment.f57901c - segment.f57900b)) + j3;
            if (j5 > j) {
                break;
            }
            segment = segment.f57904f;
            Intrinsics.m18596d(segment);
            j3 = j5;
        }
        while (j3 < j2) {
            int iMin2 = (int) Math.min(segment.f57901c, (((long) segment.f57900b) + j2) - j3);
            for (int i2 = (int) ((((long) segment.f57900b) + j) - j3); i2 < iMin2; i2++) {
                if (segment.f57899a[i2] == b2) {
                    return ((long) (i2 - segment.f57900b)) + j3;
                }
            }
            j3 += (long) (segment.f57901c - segment.f57900b);
            segment = segment.f57904f;
            Intrinsics.m18596d(segment);
            j = j3;
        }
        return -1L;
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: o0 */
    public final void mo12451o0(Buffer source, long j) {
        Segment segmentM21711b;
        Intrinsics.m18599g(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        SegmentedByteString.m21554b(source.f57830b, 0L, j);
        while (j > 0) {
            Segment segment = source.f57829a;
            Intrinsics.m18596d(segment);
            int i = segment.f57901c;
            Segment segment2 = source.f57829a;
            Intrinsics.m18596d(segment2);
            long j2 = i - segment2.f57900b;
            int i2 = 0;
            if (j < j2) {
                Segment segment3 = this.f57829a;
                Segment segment4 = segment3 != null ? segment3.f57905g : null;
                if (segment4 != null && segment4.f57903e) {
                    if ((((long) segment4.f57901c) + j) - ((long) (segment4.f57902d ? 0 : segment4.f57900b)) <= 8192) {
                        Segment segment5 = source.f57829a;
                        Intrinsics.m18596d(segment5);
                        segment5.m21709d(segment4, (int) j);
                        source.f57830b -= j;
                        this.f57830b += j;
                        return;
                    }
                }
                Segment segment6 = source.f57829a;
                Intrinsics.m18596d(segment6);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > segment6.f57901c - segment6.f57900b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    segmentM21711b = segment6.m21708c();
                } else {
                    segmentM21711b = SegmentPool.m21711b();
                    int i4 = segment6.f57900b;
                    ArraysKt.m18380o(segment6.f57899a, 0, segmentM21711b.f57899a, i4, i4 + i3);
                }
                segmentM21711b.f57901c = segmentM21711b.f57900b + i3;
                segment6.f57900b += i3;
                Segment segment7 = segment6.f57905g;
                Intrinsics.m18596d(segment7);
                segment7.m21707b(segmentM21711b);
                source.f57829a = segmentM21711b;
            }
            Segment segment8 = source.f57829a;
            Intrinsics.m18596d(segment8);
            long j3 = segment8.f57901c - segment8.f57900b;
            source.f57829a = segment8.m21706a();
            Segment segment9 = this.f57829a;
            if (segment9 == null) {
                this.f57829a = segment8;
                segment8.f57905g = segment8;
                segment8.f57904f = segment8;
            } else {
                Segment segment10 = segment9.f57905g;
                Intrinsics.m18596d(segment10);
                segment10.m21707b(segment8);
                Segment segment11 = segment8.f57905g;
                if (segment11 == segment8) {
                    throw new IllegalStateException("cannot compact");
                }
                Intrinsics.m18596d(segment11);
                if (segment11.f57903e) {
                    int i5 = segment8.f57901c - segment8.f57900b;
                    Segment segment12 = segment8.f57905g;
                    Intrinsics.m18596d(segment12);
                    int i6 = 8192 - segment12.f57901c;
                    Segment segment13 = segment8.f57905g;
                    Intrinsics.m18596d(segment13);
                    if (!segment13.f57902d) {
                        Segment segment14 = segment8.f57905g;
                        Intrinsics.m18596d(segment14);
                        i2 = segment14.f57900b;
                    }
                    if (i5 <= i6 + i2) {
                        Segment segment15 = segment8.f57905g;
                        Intrinsics.m18596d(segment15);
                        segment8.m21709d(segment15, i5);
                        segment8.m21706a();
                        SegmentPool.m21710a(segment8);
                    }
                }
            }
            source.f57830b -= j3;
            this.f57830b += j3;
            j -= j3;
        }
    }

    @Override // okio.BufferedSink
    /* JADX INFO: renamed from: q0 */
    public final long mo21600q0(Source source) {
        Intrinsics.m18599g(source, "source");
        long j = 0;
        while (true) {
            long jMo12415J0 = source.mo12415J0(this, 8192L);
            if (jMo12415J0 == -1) {
                return j;
            }
            j += jMo12415J0;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m21601r0(long j) throws EOFException {
        while (j > 0) {
            Segment segment = this.f57829a;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, segment.f57901c - segment.f57900b);
            long j2 = iMin;
            this.f57830b -= j2;
            j -= j2;
            int i = segment.f57900b + iMin;
            segment.f57900b = i;
            if (i == segment.f57901c) {
                this.f57829a = segment.m21706a();
                SegmentPool.m21710a(segment);
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.m18599g(sink, "sink");
        Segment segment = this.f57829a;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), segment.f57901c - segment.f57900b);
        sink.put(segment.f57899a, segment.f57900b, iMin);
        int i = segment.f57900b + iMin;
        segment.f57900b = i;
        this.f57830b -= (long) iMin;
        if (i == segment.f57901c) {
            this.f57829a = segment.m21706a();
            SegmentPool.m21710a(segment);
        }
        return iMin;
    }

    @Override // okio.BufferedSource
    public final boolean request(long j) {
        return this.f57830b >= j;
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF57877b() {
        return Timeout.f57912d;
    }

    public final String toString() {
        long j = this.f57830b;
        if (j <= 2147483647L) {
            return m21603u0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f57830b).toString());
    }

    /* JADX INFO: renamed from: u */
    public final long m21602u(long j, ByteString targetBytes) {
        Intrinsics.m18599g(targetBytes, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "fromIndex < 0: ").toString());
        }
        Segment segment = this.f57829a;
        if (segment == null) {
            return -1L;
        }
        long j3 = this.f57830b;
        if (j3 - j < j) {
            while (j3 > j) {
                segment = segment.f57905g;
                Intrinsics.m18596d(segment);
                j3 -= (long) (segment.f57901c - segment.f57900b);
            }
            if (targetBytes.mo21617d() == 2) {
                byte bMo21621j = targetBytes.mo21621j(0);
                byte bMo21621j2 = targetBytes.mo21621j(1);
                while (j3 < this.f57830b) {
                    int i = segment.f57901c;
                    for (int i2 = (int) ((((long) segment.f57900b) + j) - j3); i2 < i; i2++) {
                        byte b2 = segment.f57899a[i2];
                        if (b2 == bMo21621j || b2 == bMo21621j2) {
                            return ((long) (i2 - segment.f57900b)) + j3;
                        }
                    }
                    j3 += (long) (segment.f57901c - segment.f57900b);
                    segment = segment.f57904f;
                    Intrinsics.m18596d(segment);
                    j = j3;
                }
            } else {
                byte[] bArrMo21620i = targetBytes.getF57842a();
                while (j3 < this.f57830b) {
                    int i3 = segment.f57901c;
                    for (int i4 = (int) ((((long) segment.f57900b) + j) - j3); i4 < i3; i4++) {
                        byte b3 = segment.f57899a[i4];
                        for (byte b4 : bArrMo21620i) {
                            if (b3 == b4) {
                                return ((long) (i4 - segment.f57900b)) + j3;
                            }
                        }
                    }
                    j3 += (long) (segment.f57901c - segment.f57900b);
                    segment = segment.f57904f;
                    Intrinsics.m18596d(segment);
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (segment.f57901c - segment.f57900b)) + j2;
            if (j4 > j) {
                break;
            }
            segment = segment.f57904f;
            Intrinsics.m18596d(segment);
            j2 = j4;
        }
        if (targetBytes.mo21617d() == 2) {
            byte bMo21621j3 = targetBytes.mo21621j(0);
            byte bMo21621j4 = targetBytes.mo21621j(1);
            while (j2 < this.f57830b) {
                int i5 = segment.f57901c;
                for (int i6 = (int) ((((long) segment.f57900b) + j) - j2); i6 < i5; i6++) {
                    byte b5 = segment.f57899a[i6];
                    if (b5 == bMo21621j3 || b5 == bMo21621j4) {
                        return ((long) (i6 - segment.f57900b)) + j2;
                    }
                }
                j2 += (long) (segment.f57901c - segment.f57900b);
                segment = segment.f57904f;
                Intrinsics.m18596d(segment);
                j = j2;
            }
        } else {
            byte[] bArrMo21620i2 = targetBytes.getF57842a();
            while (j2 < this.f57830b) {
                int i7 = segment.f57901c;
                for (int i8 = (int) ((((long) segment.f57900b) + j) - j2); i8 < i7; i8++) {
                    byte b6 = segment.f57899a[i8];
                    for (byte b7 : bArrMo21620i2) {
                        if (b6 == b7) {
                            return ((long) (i8 - segment.f57900b)) + j2;
                        }
                    }
                }
                j2 += (long) (segment.f57901c - segment.f57900b);
                segment = segment.f57904f;
                Intrinsics.m18596d(segment);
                j = j2;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: u0 */
    public final ByteString m21603u0(int i) {
        if (i == 0) {
            return ByteString.f57841f;
        }
        SegmentedByteString.m21554b(this.f57830b, 0L, i);
        Segment segment = this.f57829a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Intrinsics.m18596d(segment);
            int i5 = segment.f57901c;
            int i6 = segment.f57900b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            segment = segment.f57904f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = this.f57829a;
        int i7 = 0;
        while (i2 < i) {
            Intrinsics.m18596d(segment2);
            bArr[i7] = segment2.f57899a;
            i2 += segment2.f57901c - segment2.f57900b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.f57900b;
            segment2.f57902d = true;
            i7++;
            segment2 = segment2.f57904f;
        }
        return new C6465SegmentedByteString(bArr, iArr);
    }

    /* JADX INFO: renamed from: w0 */
    public final Segment m21604w0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = this.f57829a;
        if (segment == null) {
            Segment segmentM21711b = SegmentPool.m21711b();
            this.f57829a = segmentM21711b;
            segmentM21711b.f57905g = segmentM21711b;
            segmentM21711b.f57904f = segmentM21711b;
            return segmentM21711b;
        }
        Segment segment2 = segment.f57905g;
        Intrinsics.m18596d(segment2);
        if (segment2.f57901c + i <= 8192 && segment2.f57903e) {
            return segment2;
        }
        Segment segmentM21711b2 = SegmentPool.m21711b();
        segment2.m21707b(segmentM21711b2);
        return segmentM21711b2;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr) {
        m21607y0(bArr);
        return this;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink writeByte(int i) {
        m21563C0(i);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final long m21605x(ByteString targetBytes) {
        Intrinsics.m18599g(targetBytes, "targetBytes");
        return m21602u(0L, targetBytes);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m21606x0(ByteString byteString) {
        Intrinsics.m18599g(byteString, "byteString");
        byteString.mo21630u(this, byteString.mo21617d());
    }

    /* JADX INFO: renamed from: y0 */
    public final void m21607y0(byte[] source) {
        Intrinsics.m18599g(source, "source");
        m21561B0(source, 0, source.length);
    }

    /* JADX INFO: renamed from: z */
    public final UnsafeCursor m21608z(UnsafeCursor unsafeCursor) {
        Intrinsics.m18599g(unsafeCursor, "unsafeCursor");
        byte[] bArr = okio.internal.Buffer.f57920a;
        if (unsafeCursor == SegmentedByteString.f57816a) {
            unsafeCursor = new UnsafeCursor();
        }
        if (unsafeCursor.f57831a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.f57831a = this;
        unsafeCursor.f57832b = true;
        return unsafeCursor;
    }

    @Override // okio.BufferedSink
    public final /* bridge */ /* synthetic */ BufferedSink write(byte[] bArr, int i, int i2) {
        m21561B0(bArr, i, i2);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.m18599g(source, "source");
        int iRemaining = source.remaining();
        int i = iRemaining;
        while (i > 0) {
            Segment segmentM21604w0 = m21604w0(1);
            int iMin = Math.min(i, 8192 - segmentM21604w0.f57901c);
            source.get(segmentM21604w0.f57899a, segmentM21604w0.f57901c, iMin);
            i -= iMin;
            segmentM21604w0.f57901c += iMin;
        }
        this.f57830b += (long) iRemaining;
        return iRemaining;
    }

    public final int read(byte[] sink, int i, int i2) {
        Intrinsics.m18599g(sink, "sink");
        SegmentedByteString.m21554b(sink.length, i, i2);
        Segment segment = this.f57829a;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i2, segment.f57901c - segment.f57900b);
        int i3 = segment.f57900b;
        ArraysKt.m18380o(segment.f57899a, i, sink, i3, i3 + iMin);
        int i4 = segment.f57900b + iMin;
        segment.f57900b = i4;
        this.f57830b -= (long) iMin;
        if (i4 == segment.f57901c) {
            this.f57829a = segment.m21706a();
            SegmentPool.m21710a(segment);
        }
        return iMin;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    /* JADX INFO: renamed from: c */
    public final Buffer getF57893b() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, okio.Sink
    public final void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
    }
}
