package org.mp4parser.boxes.iso14496.part15;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class PriotityRangeBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58980d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58981f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58982g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58983i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58984j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58985n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58986o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58987p;

    static {
        Factory factory = new Factory(PriotityRangeBox.class, "PriotityRangeBox.java");
        f58980d = factory.m21739e(factory.m21738d("getReserved1", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "", "", "", "int"));
        f58981f = factory.m21739e(factory.m21738d("setReserved1", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "int", "reserved1", "", "void"));
        f58982g = factory.m21739e(factory.m21738d("getMin_priorityId", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "", "", "", "int"));
        f58983i = factory.m21739e(factory.m21738d("setMin_priorityId", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "int", "min_priorityId", "", "void"));
        f58984j = factory.m21739e(factory.m21738d("getReserved2", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "", "", "", "int"));
        f58985n = factory.m21739e(factory.m21738d("setReserved2", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "int", "reserved2", "", "void"));
        f58986o = factory.m21739e(factory.m21738d("getMax_priorityId", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "", "", "", "int"));
        f58987p = factory.m21739e(factory.m21738d("setMax_priorityId", "org.mp4parser.boxes.iso14496.part15.PriotityRangeBox", "int", "max_priorityId", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        IsoTypeWriter.m21857h((0 << 6) + 0, byteBuffer);
        byteBuffer.put((byte) (((0 << 6) + 0) & 255));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 2L;
    }
}
