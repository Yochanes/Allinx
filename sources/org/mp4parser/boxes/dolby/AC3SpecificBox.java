package org.mp4parser.boxes.dolby;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitWriterBuffer;
import org.mp4parser.support.AbstractBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AC3SpecificBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58432d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58433f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58434g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58435i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58436j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58437n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58438o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58439p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58440q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58441r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58442s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58443t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58444u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58445v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58446w;

    static {
        Factory factory = new Factory(AC3SpecificBox.class, "AC3SpecificBox.java");
        f58432d = factory.m21739e(factory.m21738d("getFscod", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"));
        f58433f = factory.m21739e(factory.m21738d("setFscod", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "fscod", "", "void"));
        f58442s = factory.m21739e(factory.m21738d("getBitRateCode", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"));
        f58443t = factory.m21739e(factory.m21738d("setBitRateCode", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "bitRateCode", "", "void"));
        f58444u = factory.m21739e(factory.m21738d("getReserved", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"));
        f58445v = factory.m21739e(factory.m21738d("setReserved", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "reserved", "", "void"));
        f58446w = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "java.lang.String"));
        f58434g = factory.m21739e(factory.m21738d("getBsid", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"));
        f58435i = factory.m21739e(factory.m21738d("setBsid", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "bsid", "", "void"));
        f58436j = factory.m21739e(factory.m21738d("getBsmod", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"));
        f58437n = factory.m21739e(factory.m21738d("setBsmod", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "bsmod", "", "void"));
        f58438o = factory.m21739e(factory.m21738d("getAcmod", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"));
        f58439p = factory.m21739e(factory.m21738d("setAcmod", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "acmod", "", "void"));
        f58440q = factory.m21739e(factory.m21738d("getLfeon", "org.mp4parser.boxes.dolby.AC3SpecificBox", "", "", "", "int"));
        f58441r = factory.m21739e(factory.m21738d("setLfeon", "org.mp4parser.boxes.dolby.AC3SpecificBox", "int", "lfeon", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.m21829a(0, 2);
        bitWriterBuffer.m21829a(0, 5);
        bitWriterBuffer.m21829a(0, 3);
        bitWriterBuffer.m21829a(0, 3);
        bitWriterBuffer.m21829a(0, 1);
        bitWriterBuffer.m21829a(0, 5);
        bitWriterBuffer.m21829a(0, 5);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 3L;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58446w, this, this), "AC3SpecificBox{fscod=");
        sbM26w.append(0);
        sbM26w.append(", bsid=");
        sbM26w.append(0);
        sbM26w.append(", bsmod=");
        sbM26w.append(0);
        sbM26w.append(", acmod=");
        sbM26w.append(0);
        sbM26w.append(", lfeon=");
        sbM26w.append(0);
        sbM26w.append(", bitRateCode=");
        sbM26w.append(0);
        sbM26w.append(", reserved=");
        return AbstractC0000a.m17n(sbM26w, 0, '}');
    }
}
