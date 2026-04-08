package org.mp4parser.boxes.iso14496.part12;

import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TrackRunBox extends AbstractFullBox {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ JoinPoint.StaticPart f58870A;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ JoinPoint.StaticPart f58871B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ JoinPoint.StaticPart f58872C;

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ JoinPoint.StaticPart f58873D;

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ JoinPoint.StaticPart f58874E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ JoinPoint.StaticPart f58875F;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58876j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58877n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58878o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58879p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58880q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58881r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58882s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58883t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58884u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58885v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58886w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58887x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f58888y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f58889z;

    /* JADX INFO: compiled from: Proguard */
    public static class Entry {
        public final String toString() {
            return "Entry{duration=0, size=0, dlags=null, compTimeOffset=0}";
        }
    }

    static {
        Factory factory = new Factory(TrackRunBox.class, "TrackRunBox.java");
        f58876j = factory.m21739e(factory.m21738d("getEntries", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "java.util.List"));
        f58877n = factory.m21739e(factory.m21738d("setEntries", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "java.util.List", "entries", "", "void"));
        f58886w = factory.m21739e(factory.m21738d("setSampleDurationPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", AttributeType.BOOLEAN, "v", "", "void"));
        f58887x = factory.m21739e(factory.m21738d("isSampleFlagsPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", AttributeType.BOOLEAN));
        f58888y = factory.m21739e(factory.m21738d("setSampleFlagsPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", AttributeType.BOOLEAN, "v", "", "void"));
        f58889z = factory.m21739e(factory.m21738d("isSampleCompositionTimeOffsetPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", AttributeType.BOOLEAN));
        f58870A = factory.m21739e(factory.m21738d("setSampleCompositionTimeOffsetPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", AttributeType.BOOLEAN, "v", "", "void"));
        f58871B = factory.m21739e(factory.m21738d("getDataOffset", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "int"));
        f58872C = factory.m21739e(factory.m21738d("setDataOffset", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "int", "dataOffset", "", "void"));
        f58873D = factory.m21739e(factory.m21738d("getFirstSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "org.mp4parser.boxes.iso14496.part12.SampleFlags"));
        f58874E = factory.m21739e(factory.m21738d("setFirstSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "org.mp4parser.boxes.iso14496.part12.SampleFlags", "firstSampleFlags", "", "void"));
        f58875F = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "java.lang.String"));
        f58878o = factory.m21739e(factory.m21738d("getSampleCompositionTimeOffsets", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "[J"));
        f58879p = factory.m21739e(factory.m21738d("getSampleCount", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", "long"));
        f58880q = factory.m21739e(factory.m21738d("isDataOffsetPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", AttributeType.BOOLEAN));
        f58881r = factory.m21739e(factory.m21738d("setDataOffsetPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", AttributeType.BOOLEAN, "v", "", "void"));
        f58882s = factory.m21739e(factory.m21738d("isFirstSampleFlagsPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", AttributeType.BOOLEAN));
        f58883t = factory.m21739e(factory.m21738d("isSampleSizePresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", AttributeType.BOOLEAN));
        f58884u = factory.m21739e(factory.m21738d("setSampleSizePresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", AttributeType.BOOLEAN, "v", "", "void"));
        f58885v = factory.m21739e(factory.m21738d("isSampleDurationPresent", "org.mp4parser.boxes.iso14496.part12.TrackRunBox", "", "", "", AttributeType.BOOLEAN));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }

    public final String toString() {
        AbstractC0000a.m29z(Factory.m21736b(f58875F, this, this));
        throw null;
    }
}
