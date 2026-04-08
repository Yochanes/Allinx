package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TrackExtendsBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58778j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58779n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58780o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58781p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58782q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58783r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58784s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58785t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58786u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58787v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58788w;

    static {
        Factory factory = new Factory(TrackExtendsBox.class, "TrackExtendsBox.java");
        f58778j = factory.m21739e(factory.m21738d("getTrackId", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "", "", "", "long"));
        f58779n = factory.m21739e(factory.m21738d("setTrackId", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "long", "trackId", "", "void"));
        f58788w = factory.m21739e(factory.m21738d("getDefaultSampleFlagsStr", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "", "", "", "java.lang.String"));
        f58780o = factory.m21739e(factory.m21738d("getDefaultSampleDescriptionIndex", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "", "", "", "long"));
        f58781p = factory.m21739e(factory.m21738d("setDefaultSampleDescriptionIndex", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "long", "defaultSampleDescriptionIndex", "", "void"));
        f58782q = factory.m21739e(factory.m21738d("getDefaultSampleDuration", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "", "", "", "long"));
        f58783r = factory.m21739e(factory.m21738d("setDefaultSampleDuration", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "long", "defaultSampleDuration", "", "void"));
        f58784s = factory.m21739e(factory.m21738d("getDefaultSampleSize", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "", "", "", "long"));
        f58785t = factory.m21739e(factory.m21738d("setDefaultSampleSize", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "long", "defaultSampleSize", "", "void"));
        f58786u = factory.m21739e(factory.m21738d("getDefaultSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "", "", "", "org.mp4parser.boxes.iso14496.part12.SampleFlags"));
        f58787v = factory.m21739e(factory.m21738d("setDefaultSampleFlags", "org.mp4parser.boxes.iso14496.part12.TrackExtendsBox", "org.mp4parser.boxes.iso14496.part12.SampleFlags", "defaultSampleFlags", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 24L;
    }
}
