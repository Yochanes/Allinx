package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class CleanApertureAtom extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58332j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58333n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58334o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58335p;

    static {
        Factory factory = new Factory(CleanApertureAtom.class, "CleanApertureAtom.java");
        f58332j = factory.m21739e(factory.m21738d("getWidth", "org.mp4parser.boxes.apple.CleanApertureAtom", "", "", "", "double"));
        f58333n = factory.m21739e(factory.m21738d("setWidth", "org.mp4parser.boxes.apple.CleanApertureAtom", "double", "width", "", "void"));
        f58334o = factory.m21739e(factory.m21738d("getHeight", "org.mp4parser.boxes.apple.CleanApertureAtom", "", "", "", "double"));
        f58335p = factory.m21739e(factory.m21738d("setHeight", "org.mp4parser.boxes.apple.CleanApertureAtom", "double", "height", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        IsoTypeWriter.m21851b(byteBuffer, 0.0d);
        IsoTypeWriter.m21851b(byteBuffer, 0.0d);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 12L;
    }
}
