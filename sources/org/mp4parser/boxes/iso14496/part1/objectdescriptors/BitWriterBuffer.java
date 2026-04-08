package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class BitWriterBuffer {

    /* JADX INFO: renamed from: a */
    public final int f58533a;

    /* JADX INFO: renamed from: b */
    public int f58534b = 0;

    /* JADX INFO: renamed from: c */
    public final ByteBuffer f58535c;

    public BitWriterBuffer(ByteBuffer byteBuffer) {
        this.f58535c = byteBuffer;
        this.f58533a = byteBuffer.position();
    }

    /* JADX INFO: renamed from: a */
    public final void m21829a(int i, int i2) {
        int i3 = this.f58534b;
        int i4 = 8 - (i3 % 8);
        int i5 = this.f58533a;
        ByteBuffer byteBuffer = this.f58535c;
        if (i2 <= i4) {
            int i6 = byteBuffer.get((i3 / 8) + i5);
            if (i6 < 0) {
                i6 += 256;
            }
            int i7 = i6 + (i << (i4 - i2));
            int i8 = (this.f58534b / 8) + i5;
            if (i7 > 127) {
                i7 -= 256;
            }
            byteBuffer.put(i8, (byte) i7);
            this.f58534b += i2;
        } else {
            int i9 = i2 - i4;
            m21829a(i >> i9, i4);
            m21829a(i & ((1 << i9) - 1), i9);
        }
        int i10 = this.f58534b;
        byteBuffer.position((i10 / 8) + i5 + (i10 % 8 <= 0 ? 0 : 1));
    }
}
