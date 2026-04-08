package org.mp4parser.boxes.iso14496.part15;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TierInfoBox extends AbstractBox {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ JoinPoint.StaticPart f59000A;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ JoinPoint.StaticPart f59001B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ JoinPoint.StaticPart f59002C;

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ JoinPoint.StaticPart f59003D;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f59004d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f59005f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f59006g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f59007i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59008j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59009n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59010o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59011p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59012q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59013r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f59014s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f59015t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f59016u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f59017v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f59018w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f59019x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f59020y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f59021z;

    static {
        Factory factory = new Factory(TierInfoBox.class, "TierInfoBox.java");
        f59004d = factory.m21739e(factory.m21738d("getTierID", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"));
        f59005f = factory.m21739e(factory.m21738d("setTierID", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "tierID", "", "void"));
        f59014s = factory.m21739e(factory.m21738d("getVisualWidth", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"));
        f59015t = factory.m21739e(factory.m21738d("setVisualWidth", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "visualWidth", "", "void"));
        f59016u = factory.m21739e(factory.m21738d("getVisualHeight", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"));
        f59017v = factory.m21739e(factory.m21738d("setVisualHeight", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "visualHeight", "", "void"));
        f59018w = factory.m21739e(factory.m21738d("getDiscardable", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"));
        f59019x = factory.m21739e(factory.m21738d("setDiscardable", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "discardable", "", "void"));
        f59020y = factory.m21739e(factory.m21738d("getConstantFrameRate", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"));
        f59021z = factory.m21739e(factory.m21738d("setConstantFrameRate", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "constantFrameRate", "", "void"));
        f59000A = factory.m21739e(factory.m21738d("getReserved2", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"));
        f59001B = factory.m21739e(factory.m21738d("setReserved2", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "reserved2", "", "void"));
        f59006g = factory.m21739e(factory.m21738d("getProfileIndication", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"));
        f59002C = factory.m21739e(factory.m21738d("getFrameRate", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"));
        f59003D = factory.m21739e(factory.m21738d("setFrameRate", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "frameRate", "", "void"));
        f59007i = factory.m21739e(factory.m21738d("setProfileIndication", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "profileIndication", "", "void"));
        f59008j = factory.m21739e(factory.m21738d("getProfile_compatibility", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"));
        f59009n = factory.m21739e(factory.m21738d("setProfile_compatibility", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "profile_compatibility", "", "void"));
        f59010o = factory.m21739e(factory.m21738d("getLevelIndication", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"));
        f59011p = factory.m21739e(factory.m21738d("setLevelIndication", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "levelIndication", "", "void"));
        f59012q = factory.m21739e(factory.m21738d("getReserved1", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "", "", "", "int"));
        f59013r = factory.m21739e(factory.m21738d("setReserved1", "org.mp4parser.boxes.iso14496.part15.TierInfoBox", "int", "reserved1", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        IsoTypeWriter.m21854e(0, byteBuffer);
        byteBuffer.put((byte) (0 & 255));
        byteBuffer.put((byte) (0 & 255));
        byteBuffer.put((byte) (0 & 255));
        byteBuffer.put((byte) (0 & 255));
        IsoTypeWriter.m21854e(0, byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
        byteBuffer.put((byte) (((0 << 6) + (0 << 4) + 0) & 255));
        IsoTypeWriter.m21854e(0, byteBuffer);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 13L;
    }
}
