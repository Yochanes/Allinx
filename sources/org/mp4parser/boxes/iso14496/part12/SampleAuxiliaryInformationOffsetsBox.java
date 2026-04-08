package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.IsoFile;
import org.mp4parser.support.AbstractFullBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SampleAuxiliaryInformationOffsetsBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58696j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58697n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58698o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58699p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58700q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58701r;

    static {
        Factory factory = new Factory(SampleAuxiliaryInformationOffsetsBox.class, "SampleAuxiliaryInformationOffsetsBox.java");
        f58696j = factory.m21739e(factory.m21738d("getAuxInfoType", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"));
        f58697n = factory.m21739e(factory.m21738d("setAuxInfoType", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoType", "", "void"));
        f58698o = factory.m21739e(factory.m21738d("getAuxInfoTypeParameter", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"));
        f58699p = factory.m21739e(factory.m21738d("setAuxInfoTypeParameter", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoTypeParameter", "", "void"));
        f58700q = factory.m21739e(factory.m21738d("getOffsets", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "[J"));
        f58701r = factory.m21739e(factory.m21738d("setOffsets", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "[J", "offsets", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        if ((this.f59264f & 1) == 1) {
            byteBuffer.put(IsoFile.m21819g(null));
            byteBuffer.put(IsoFile.m21819g(null));
        }
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        if (this.f59263d == 0) {
            throw null;
        }
        throw null;
    }
}
