package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BitRateBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58555d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58556f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58557g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58558i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58559j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58560n;

    static {
        Factory factory = new Factory(BitRateBox.class, "BitRateBox.java");
        f58555d = factory.m21739e(factory.m21738d("getBufferSizeDb", "org.mp4parser.boxes.iso14496.part12.BitRateBox", "", "", "", "long"));
        f58556f = factory.m21739e(factory.m21738d("setBufferSizeDb", "org.mp4parser.boxes.iso14496.part12.BitRateBox", "long", "bufferSizeDb", "", "void"));
        f58557g = factory.m21739e(factory.m21738d("getMaxBitrate", "org.mp4parser.boxes.iso14496.part12.BitRateBox", "", "", "", "long"));
        f58558i = factory.m21739e(factory.m21738d("setMaxBitrate", "org.mp4parser.boxes.iso14496.part12.BitRateBox", "long", "maxBitrate", "", "void"));
        f58559j = factory.m21739e(factory.m21738d("getAvgBitrate", "org.mp4parser.boxes.iso14496.part12.BitRateBox", "", "", "", "long"));
        f58560n = factory.m21739e(factory.m21738d("setAvgBitrate", "org.mp4parser.boxes.iso14496.part12.BitRateBox", "long", "avgBitrate", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 12L;
    }
}
