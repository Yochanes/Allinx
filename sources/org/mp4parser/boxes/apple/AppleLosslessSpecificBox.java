package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AppleLosslessSpecificBox extends AbstractFullBox {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ JoinPoint.StaticPart f58287A;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ JoinPoint.StaticPart f58288B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ JoinPoint.StaticPart f58289C;

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ JoinPoint.StaticPart f58290D;

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ JoinPoint.StaticPart f58291E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ JoinPoint.StaticPart f58292F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ JoinPoint.StaticPart f58293G;

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ JoinPoint.StaticPart f58294H;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58295j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58296n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58297o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58298p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58299q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58300r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58301s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58302t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58303u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58304v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58305w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58306x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f58307y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f58308z;

    static {
        Factory factory = new Factory(AppleLosslessSpecificBox.class, "AppleLosslessSpecificBox.java");
        f58295j = factory.m21739e(factory.m21738d("getMaxSamplePerFrame", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"));
        f58296n = factory.m21739e(factory.m21738d("setMaxSamplePerFrame", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "maxSamplePerFrame", "", "void"));
        f58305w = factory.m21739e(factory.m21738d("getKModifier", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        f58306x = factory.m21739e(factory.m21738d("setKModifier", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "kModifier", "", "void"));
        f58307y = factory.m21739e(factory.m21738d("getChannels", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        f58308z = factory.m21739e(factory.m21738d("setChannels", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "channels", "", "void"));
        f58287A = factory.m21739e(factory.m21738d("getUnknown2", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        f58288B = factory.m21739e(factory.m21738d("setUnknown2", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "unknown2", "", "void"));
        f58289C = factory.m21739e(factory.m21738d("getMaxCodedFrameSize", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"));
        f58290D = factory.m21739e(factory.m21738d("setMaxCodedFrameSize", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "maxCodedFrameSize", "", "void"));
        f58291E = factory.m21739e(factory.m21738d("getBitRate", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"));
        f58292F = factory.m21739e(factory.m21738d("setBitRate", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "bitRate", "", "void"));
        f58297o = factory.m21739e(factory.m21738d("getUnknown1", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        f58293G = factory.m21739e(factory.m21738d("getSampleRate", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "long"));
        f58294H = factory.m21739e(factory.m21738d("setSampleRate", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "sampleRate", "", "void"));
        f58298p = factory.m21739e(factory.m21738d("setUnknown1", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "unknown1", "", "void"));
        f58299q = factory.m21739e(factory.m21738d("getSampleSize", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        f58300r = factory.m21739e(factory.m21738d("setSampleSize", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "sampleSize", "", "void"));
        f58301s = factory.m21739e(factory.m21738d("getHistoryMult", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        f58302t = factory.m21739e(factory.m21738d("setHistoryMult", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "historyMult", "", "void"));
        f58303u = factory.m21739e(factory.m21738d("getInitialHistory", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"));
        f58304v = factory.m21739e(factory.m21738d("setInitialHistory", "org.mp4parser.boxes.apple.AppleLosslessSpecificBox", "int", "initialHistory", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.putInt((int) 0);
        byteBuffer.put((byte) (0 & 255));
        byteBuffer.put((byte) (0 & 255));
        byteBuffer.put((byte) (0 & 255));
        byteBuffer.put((byte) (0 & 255));
        byteBuffer.put((byte) (0 & 255));
        byteBuffer.put((byte) (0 & 255));
        IsoTypeWriter.m21854e(0, byteBuffer);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 28L;
    }
}
