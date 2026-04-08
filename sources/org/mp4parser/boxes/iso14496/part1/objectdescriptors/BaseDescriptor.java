package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Descriptor(tags = {0})
public abstract class BaseDescriptor {

    /* JADX INFO: renamed from: a */
    public int f58532a;

    /* JADX INFO: renamed from: a */
    public abstract int mo21825a();

    /* JADX INFO: renamed from: b */
    public final int m21826b() {
        return m21827c() + mo21825a() + 1;
    }

    /* JADX INFO: renamed from: c */
    public final int m21827c() {
        int iMo21825a = mo21825a();
        int i = 0;
        while (true) {
            if (iMo21825a <= 0 && i >= 0) {
                return i;
            }
            iMo21825a >>>= 7;
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m21828d(int i, ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i2 = 0;
        while (true) {
            if (i <= 0 && i2 >= 0) {
                byteBuffer.position(m21827c() + iPosition);
                return;
            }
            i2++;
            if (i > 0) {
                byteBuffer.put((m21827c() + iPosition) - i2, (byte) (i & 127));
            } else {
                byteBuffer.put((m21827c() + iPosition) - i2, UnsignedBytes.MAX_POWER_OF_TWO);
            }
            i >>>= 7;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseDescriptor{tag=");
        sb.append(this.f58532a);
        sb.append(", sizeOfInstance=");
        return AbstractC0000a.m17n(sb, 0, '}');
    }
}
