package org.mp4parser.boxes.microsoft;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TfxdBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59071j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59072n;

    static {
        Factory factory = new Factory(TfxdBox.class, "TfxdBox.java");
        f59071j = factory.m21739e(factory.m21738d("getFragmentAbsoluteTime", "org.mp4parser.boxes.microsoft.TfxdBox", "", "", "", "long"));
        f59072n = factory.m21739e(factory.m21738d("getFragmentAbsoluteDuration", "org.mp4parser.boxes.microsoft.TfxdBox", "", "", "", "long"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        if (this.f59263d == 1) {
            byteBuffer.putLong(0L);
            byteBuffer.putLong(0L);
        } else {
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) 0);
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return this.f59263d == 1 ? 20 : 12;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: c */
    public final byte[] mo21837c() {
        return new byte[]{109, Ascii.f42538GS, -101, 5, 66, -43, 68, -26, UnsignedBytes.MAX_POWER_OF_TWO, -30, Ascii.DC4, Ascii.f42538GS, -81, -9, 87, -78};
    }
}
