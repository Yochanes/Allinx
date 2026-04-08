package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.IsoTypeWriter;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SegmentIndexBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58740j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58741n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58742o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58743p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58744q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58745r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58746s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58747t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58748u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58749v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58750w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58751x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f58752y;

    /* JADX INFO: compiled from: Proguard */
    public static class Entry {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return ((int) 0) * 29791;
        }

        public final String toString() {
            return "Entry{referenceType=0, referencedSize=0, subsegmentDuration=0, startsWithSap=0, sapType=0, sapDeltaTime=0}";
        }
    }

    static {
        Factory factory = new Factory(SegmentIndexBox.class, "SegmentIndexBox.java");
        f58740j = factory.m21739e(factory.m21738d("getEntries", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "java.util.List"));
        f58741n = factory.m21739e(factory.m21738d("setEntries", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "java.util.List", "entries", "", "void"));
        f58750w = factory.m21739e(factory.m21738d("getReserved", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "int"));
        f58751x = factory.m21739e(factory.m21738d("setReserved", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "int", "reserved", "", "void"));
        f58752y = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "java.lang.String"));
        f58742o = factory.m21739e(factory.m21738d("getReferenceId", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "long"));
        f58743p = factory.m21739e(factory.m21738d("setReferenceId", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "long", "referenceId", "", "void"));
        f58744q = factory.m21739e(factory.m21738d("getTimeScale", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "long"));
        f58745r = factory.m21739e(factory.m21738d("setTimeScale", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "long", "timeScale", "", "void"));
        f58746s = factory.m21739e(factory.m21738d("getEarliestPresentationTime", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "long"));
        f58747t = factory.m21739e(factory.m21738d("setEarliestPresentationTime", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "long", "earliestPresentationTime", "", "void"));
        f58748u = factory.m21739e(factory.m21738d("getFirstOffset", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "", "", "", "long"));
        f58749v = factory.m21739e(factory.m21738d("setFirstOffset", "org.mp4parser.boxes.iso14496.part12.SegmentIndexBox", "long", "firstOffset", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        if (this.f59263d == 0) {
            byteBuffer.putInt((int) 0);
            byteBuffer.putInt((int) 0);
        } else {
            byteBuffer.putLong(0L);
            byteBuffer.putLong(0L);
        }
        IsoTypeWriter.m21854e(0, byteBuffer);
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58752y, this, this), "SegmentIndexBox{entries=null, referenceId=");
        sbM26w.append(0L);
        sbM26w.append(", timeScale=");
        sbM26w.append(0L);
        sbM26w.append(", earliestPresentationTime=");
        sbM26w.append(0L);
        sbM26w.append(", firstOffset=");
        sbM26w.append(0L);
        sbM26w.append(", reserved=");
        return AbstractC0000a.m17n(sbM26w, 0, '}');
    }
}
