package org.mp4parser.boxes.iso14496.part12;

import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TrackFragmentHeaderBox extends AbstractFullBox {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ JoinPoint.StaticPart f58792A;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ JoinPoint.StaticPart f58793B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ JoinPoint.StaticPart f58794C;

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ JoinPoint.StaticPart f58795D;

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ JoinPoint.StaticPart f58796E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ JoinPoint.StaticPart f58797F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ JoinPoint.StaticPart f58798G;

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ JoinPoint.StaticPart f58799H;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58800j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58801n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58802o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58803p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58804q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58805r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58806s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58807t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58808u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58809v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58810w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58811x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f58812y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f58813z;

    static {
        Factory factory = new Factory(TrackFragmentHeaderBox.class, "TrackFragmentHeaderBox.java");
        f58800j = factory.m21739e(factory.m21738d("hasBaseDataOffset", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", AttributeType.BOOLEAN));
        f58801n = factory.m21739e(factory.m21738d("hasSampleDescriptionIndex", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", AttributeType.BOOLEAN));
        f58810w = factory.m21739e(factory.m21738d("setSampleDescriptionIndex", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "long", "sampleDescriptionIndex", "", "void"));
        f58811x = factory.m21739e(factory.m21738d("getDefaultSampleDuration", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "long"));
        f58812y = factory.m21739e(factory.m21738d("setDefaultSampleDuration", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "long", "defaultSampleDuration", "", "void"));
        f58813z = factory.m21739e(factory.m21738d("getDefaultSampleSize", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "long"));
        f58792A = factory.m21739e(factory.m21738d("setDefaultSampleSize", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "long", "defaultSampleSize", "", "void"));
        f58793B = factory.m21739e(factory.m21738d("getDefaultSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "org.mp4parser.boxes.iso14496.part12.SampleFlags"));
        f58794C = factory.m21739e(factory.m21738d("setDefaultSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "org.mp4parser.boxes.iso14496.part12.SampleFlags", "defaultSampleFlags", "", "void"));
        f58795D = factory.m21739e(factory.m21738d("isDurationIsEmpty", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", AttributeType.BOOLEAN));
        f58796E = factory.m21739e(factory.m21738d("setDurationIsEmpty", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", AttributeType.BOOLEAN, "durationIsEmpty", "", "void"));
        f58797F = factory.m21739e(factory.m21738d("isDefaultBaseIsMoof", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", AttributeType.BOOLEAN));
        f58802o = factory.m21739e(factory.m21738d("hasDefaultSampleDuration", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", AttributeType.BOOLEAN));
        f58798G = factory.m21739e(factory.m21738d("setDefaultBaseIsMoof", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", AttributeType.BOOLEAN, "defaultBaseIsMoof", "", "void"));
        f58799H = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "java.lang.String"));
        f58803p = factory.m21739e(factory.m21738d("hasDefaultSampleSize", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", AttributeType.BOOLEAN));
        f58804q = factory.m21739e(factory.m21738d("hasDefaultSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", AttributeType.BOOLEAN));
        f58805r = factory.m21739e(factory.m21738d("getTrackId", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "long"));
        f58806s = factory.m21739e(factory.m21738d("setTrackId", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "long", "trackId", "", "void"));
        f58807t = factory.m21739e(factory.m21738d("getBaseDataOffset", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "long"));
        f58808u = factory.m21739e(factory.m21738d("setBaseDataOffset", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "long", "baseDataOffset", "", "void"));
        f58809v = factory.m21739e(factory.m21738d("getSampleDescriptionIndex", "org.mp4parser.boxes.iso14496.part12.TrackFragmentHeaderBox", "", "", "", "long"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.putInt((int) 0);
        if ((this.f59264f & 1) == 1) {
            AbstractC0000a.m29z(Factory.m21736b(f58807t, this, this));
            byteBuffer.putLong(0L);
        }
        if ((this.f59264f & 2) == 2) {
            AbstractC0000a.m29z(Factory.m21736b(f58809v, this, this));
            byteBuffer.putInt((int) 0);
        }
        if ((this.f59264f & 8) == 8) {
            AbstractC0000a.m29z(Factory.m21736b(f58811x, this, this));
            byteBuffer.putInt((int) 0);
        }
        if ((this.f59264f & 16) == 16) {
            AbstractC0000a.m29z(Factory.m21736b(f58813z, this, this));
            byteBuffer.putInt((int) 0);
        }
        if ((this.f59264f & 32) == 32) {
            throw null;
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        int i = this.f59264f;
        long j = (i & 1) == 1 ? 16L : 8L;
        if ((i & 2) == 2) {
            j += 4;
        }
        if ((i & 8) == 8) {
            j += 4;
        }
        if ((i & 16) == 16) {
            j += 4;
        }
        return (i & 32) == 32 ? j + 4 : j;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58799H, this, this), "TrackFragmentHeaderBox{trackId=");
        sbM26w.append(0L);
        sbM26w.append(", baseDataOffset=");
        sbM26w.append(0L);
        sbM26w.append(", sampleDescriptionIndex=");
        sbM26w.append(0L);
        sbM26w.append(", defaultSampleDuration=");
        sbM26w.append(0L);
        sbM26w.append(", defaultSampleSize=");
        sbM26w.append(0L);
        sbM26w.append(", defaultSampleFlags=");
        sbM26w.append((Object) null);
        sbM26w.append(", durationIsEmpty=true, defaultBaseIsMoof=true}");
        return sbM26w.toString();
    }
}
