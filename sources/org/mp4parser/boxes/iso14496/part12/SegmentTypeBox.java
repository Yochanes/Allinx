package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.IsoFile;
import org.mp4parser.support.AbstractBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SegmentTypeBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58753d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58754f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58755g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58756i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58757j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58758n;

    static {
        Factory factory = new Factory(SegmentTypeBox.class, "SegmentTypeBox.java");
        f58753d = factory.m21739e(factory.m21738d("getMajorBrand", "org.mp4parser.boxes.iso14496.part12.SegmentTypeBox", "", "", "", "java.lang.String"));
        f58754f = factory.m21739e(factory.m21738d("setMajorBrand", "org.mp4parser.boxes.iso14496.part12.SegmentTypeBox", "java.lang.String", "majorBrand", "", "void"));
        f58755g = factory.m21739e(factory.m21738d("getMinorVersion", "org.mp4parser.boxes.iso14496.part12.SegmentTypeBox", "", "", "", "long"));
        f58756i = factory.m21739e(factory.m21738d("setMinorVersion", "org.mp4parser.boxes.iso14496.part12.SegmentTypeBox", "long", "minorVersion", "", "void"));
        f58757j = factory.m21739e(factory.m21738d("getCompatibleBrands", "org.mp4parser.boxes.iso14496.part12.SegmentTypeBox", "", "", "", "java.util.List"));
        f58758n = factory.m21739e(factory.m21738d("setCompatibleBrands", "org.mp4parser.boxes.iso14496.part12.SegmentTypeBox", "java.util.List", "compatibleBrands", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.put(IsoFile.m21819g(null));
        byteBuffer.putInt((int) 0);
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentTypeBox[majorBrand=");
        AbstractC0000a.m29z(Factory.m21736b(f58753d, this, this));
        sb.append((String) null);
        sb.append(";minorVersion=");
        AbstractC0000a.m29z(Factory.m21736b(f58755g, this, this));
        sb.append(0L);
        throw null;
    }
}
