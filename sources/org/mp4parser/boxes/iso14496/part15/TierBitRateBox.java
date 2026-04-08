package org.mp4parser.boxes.iso14496.part15;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TierBitRateBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58988d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58989f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58990g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58991i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58992j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58993n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58994o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58995p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58996q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58997r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58998s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58999t;

    static {
        Factory factory = new Factory(TierBitRateBox.class, "TierBitRateBox.java");
        f58988d = factory.m21739e(factory.m21738d("getBaseBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "", "", "", "long"));
        f58989f = factory.m21739e(factory.m21738d("setBaseBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "long", "baseBitRate", "", "void"));
        f58998s = factory.m21739e(factory.m21738d("getTierAvgBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "", "", "", "long"));
        f58999t = factory.m21739e(factory.m21738d("setTierAvgBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "long", "tierAvgBitRate", "", "void"));
        f58990g = factory.m21739e(factory.m21738d("getMaxBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "", "", "", "long"));
        f58991i = factory.m21739e(factory.m21738d("setMaxBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "long", "maxBitRate", "", "void"));
        f58992j = factory.m21739e(factory.m21738d("getAvgBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "", "", "", "long"));
        f58993n = factory.m21739e(factory.m21738d("setAvgBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "long", "avgBitRate", "", "void"));
        f58994o = factory.m21739e(factory.m21738d("getTierBaseBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "", "", "", "long"));
        f58995p = factory.m21739e(factory.m21738d("setTierBaseBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "long", "tierBaseBitRate", "", "void"));
        f58996q = factory.m21739e(factory.m21738d("getTierMaxBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "", "", "", "long"));
        f58997r = factory.m21739e(factory.m21738d("setTierMaxBitRate", "org.mp4parser.boxes.iso14496.part15.TierBitRateBox", "long", "tierMaxBitRate", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 24L;
    }
}
