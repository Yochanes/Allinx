package io.ktor.utils.p043io.core;

import io.ktor.utils.p043io.core.internal.DangerousInternalIoApi;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/core/Buffer;", "", "Companion", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
@DangerousInternalIoApi
public class Buffer {

    /* JADX INFO: renamed from: a */
    public final BufferSharedState f47348a;

    /* JADX INFO: renamed from: b */
    public final int f47349b;

    /* JADX INFO: renamed from: c */
    public final ByteBuffer f47350c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/core/Buffer$Companion;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    public Buffer(ByteBuffer byteBuffer) {
        this.f47350c = byteBuffer;
        int iLimit = byteBuffer.limit();
        BufferSharedState bufferSharedState = new BufferSharedState();
        bufferSharedState.f47355d = iLimit;
        this.f47348a = bufferSharedState;
        this.f47349b = byteBuffer.limit();
    }

    /* JADX INFO: renamed from: a */
    public final void m17459a(int i) throws EOFException {
        BufferSharedState bufferSharedState = this.f47348a;
        int i2 = bufferSharedState.f47353b;
        int i3 = i2 + i;
        if (i < 0 || i3 > bufferSharedState.f47355d) {
            BufferKt.m17472a(i, bufferSharedState.f47355d - i2);
            throw null;
        }
        bufferSharedState.f47353b = i3;
    }

    /* JADX INFO: renamed from: b */
    public final void m17460b(int i) throws EOFException {
        BufferSharedState bufferSharedState = this.f47348a;
        int i2 = bufferSharedState.f47355d;
        int i3 = bufferSharedState.f47353b;
        if (i < i3) {
            BufferKt.m17472a(i - i3, i2 - i3);
            throw null;
        }
        if (i < i2) {
            bufferSharedState.f47353b = i;
        } else if (i == i2) {
            bufferSharedState.f47353b = i;
        } else {
            BufferKt.m17472a(i - i3, i2 - i3);
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m17461d(int i) throws EOFException {
        if (i == 0) {
            return;
        }
        BufferSharedState bufferSharedState = this.f47348a;
        int i2 = bufferSharedState.f47352a;
        int i3 = i2 + i;
        if (i < 0 || i3 > bufferSharedState.f47353b) {
            BufferKt.m17473b(i, bufferSharedState.f47353b - i2);
            throw null;
        }
        bufferSharedState.f47352a = i3;
    }

    /* JADX INFO: renamed from: g */
    public final void m17462g(int i) throws EOFException {
        BufferSharedState bufferSharedState = this.f47348a;
        if (i < 0 || i > bufferSharedState.f47353b) {
            int i2 = bufferSharedState.f47352a;
            BufferKt.m17473b(i - i2, bufferSharedState.f47353b - i2);
            throw null;
        }
        if (bufferSharedState.f47352a != i) {
            bufferSharedState.f47352a = i;
        }
    }

    /* JADX INFO: renamed from: h */
    public final byte m17463h() throws EOFException {
        BufferSharedState bufferSharedState = this.f47348a;
        int i = bufferSharedState.f47352a;
        if (i == bufferSharedState.f47353b) {
            throw new EOFException("No readable bytes available.");
        }
        bufferSharedState.f47352a = i + 1;
        return this.f47350c.get(i);
    }

    /* JADX INFO: renamed from: i */
    public final void m17464i(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "newReadPosition shouldn't be negative: "));
        }
        BufferSharedState bufferSharedState = this.f47348a;
        if (!(i <= bufferSharedState.f47352a)) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "newReadPosition shouldn't be ahead of the read position: ", " > ");
            sbM20q.append(bufferSharedState.f47352a);
            throw new IllegalArgumentException(sbM20q.toString());
        }
        bufferSharedState.f47352a = i;
        if (bufferSharedState.f47354c > i) {
            bufferSharedState.f47354c = i;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m17465j() {
        int i = this.f47349b;
        int i2 = i - 8;
        BufferSharedState bufferSharedState = this.f47348a;
        int i3 = bufferSharedState.f47353b;
        if (i2 >= i3) {
            bufferSharedState.f47355d = i2;
            return;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "End gap 8 is too big: capacity is "));
        }
        if (i2 < bufferSharedState.f47354c) {
            throw new IllegalArgumentException(AbstractC0000a.m11h(bufferSharedState.f47354c, " bytes reserved in the beginning", new StringBuilder("End gap 8 is too big: there are already ")));
        }
        if (bufferSharedState.f47352a == i3) {
            bufferSharedState.f47355d = i2;
            bufferSharedState.f47352a = i2;
            bufferSharedState.f47353b = i2;
        } else {
            throw new IllegalArgumentException("Unable to reserve end gap 8: there are already " + (bufferSharedState.f47353b - bufferSharedState.f47352a) + " content bytes at offset " + bufferSharedState.f47352a);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m17466k() {
        m17467n(this.f47349b - this.f47348a.f47354c);
    }

    /* JADX INFO: renamed from: n */
    public final void m17467n(int i) {
        BufferSharedState bufferSharedState = this.f47348a;
        int i2 = bufferSharedState.f47354c;
        bufferSharedState.f47352a = i2;
        bufferSharedState.f47353b = i2;
        bufferSharedState.f47355d = i;
    }

    /* JADX INFO: renamed from: p0 */
    public final long m17468p0(long j) throws EOFException {
        BufferSharedState bufferSharedState = this.f47348a;
        int iMin = (int) Math.min(j, bufferSharedState.f47353b - bufferSharedState.f47352a);
        m17461d(iMin);
        return iMin;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Buffer(");
        BufferSharedState bufferSharedState = this.f47348a;
        sb.append(bufferSharedState.f47353b - bufferSharedState.f47352a);
        sb.append(" used, ");
        sb.append(bufferSharedState.f47355d - bufferSharedState.f47353b);
        sb.append(" free, ");
        int i = bufferSharedState.f47354c;
        int i2 = bufferSharedState.f47355d;
        int i3 = this.f47349b;
        sb.append((i3 - i2) + i);
        sb.append(" reserved of ");
        return AbstractC0000a.m17n(sb, i3, ')');
    }
}
