package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.IsoTypeWriter;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class BaseMediaInfoAtom extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58319j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58320n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58321o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58322p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58323q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58324r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58325s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58326t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58327u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58328v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58329w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58330x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f58331y;

    static {
        Factory factory = new Factory(BaseMediaInfoAtom.class, "BaseMediaInfoAtom.java");
        f58319j = factory.m21739e(factory.m21738d("getGraphicsMode", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"));
        f58320n = factory.m21739e(factory.m21738d("setGraphicsMode", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "graphicsMode", "", "void"));
        f58329w = factory.m21739e(factory.m21738d("getReserved", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"));
        f58330x = factory.m21739e(factory.m21738d("setReserved", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "reserved", "", "void"));
        f58331y = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "java.lang.String"));
        f58321o = factory.m21739e(factory.m21738d("getOpColorR", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"));
        f58322p = factory.m21739e(factory.m21738d("setOpColorR", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorR", "", "void"));
        f58323q = factory.m21739e(factory.m21738d("getOpColorG", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"));
        f58324r = factory.m21739e(factory.m21738d("setOpColorG", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorG", "", "void"));
        f58325s = factory.m21739e(factory.m21738d("getOpColorB", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "int"));
        f58326t = factory.m21739e(factory.m21738d("setOpColorB", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "int", "opColorB", "", "void"));
        f58327u = factory.m21739e(factory.m21738d("getBalance", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "", "", "", "short"));
        f58328v = factory.m21739e(factory.m21738d("setBalance", "org.mp4parser.boxes.apple.BaseMediaInfoAtom", "short", "balance", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.putShort((short) 0);
        IsoTypeWriter.m21854e(0, byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
        byteBuffer.putShort((short) 0);
        byteBuffer.putShort((short) 0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 16L;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58331y, this, this), "BaseMediaInfoAtom{graphicsMode=");
        sbM26w.append(0);
        sbM26w.append(", opColorR=");
        sbM26w.append(0);
        sbM26w.append(", opColorG=");
        sbM26w.append(0);
        sbM26w.append(", opColorB=");
        sbM26w.append(0);
        sbM26w.append(", balance=");
        sbM26w.append(0);
        sbM26w.append(", reserved=");
        return AbstractC0000a.m17n(sbM26w, 0, '}');
    }
}
