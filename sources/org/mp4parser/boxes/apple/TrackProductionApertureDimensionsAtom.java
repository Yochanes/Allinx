package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TrackProductionApertureDimensionsAtom extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58392j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58393n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58394o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58395p;

    static {
        Factory factory = new Factory(TrackProductionApertureDimensionsAtom.class, "TrackProductionApertureDimensionsAtom.java");
        f58392j = factory.m21739e(factory.m21738d("getWidth", "org.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "", "", "", "double"));
        f58393n = factory.m21739e(factory.m21738d("setWidth", "org.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "double", "width", "", "void"));
        f58394o = factory.m21739e(factory.m21738d("getHeight", "org.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "", "", "", "double"));
        f58395p = factory.m21739e(factory.m21738d("setHeight", "org.mp4parser.boxes.apple.TrackProductionApertureDimensionsAtom", "double", "height", "", "void"));
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
