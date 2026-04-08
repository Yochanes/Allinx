package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TrackReferenceTypeBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58868d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58869f;

    static {
        Factory factory = new Factory(TrackReferenceTypeBox.class, "TrackReferenceTypeBox.java");
        f58868d = factory.m21739e(factory.m21738d("getTrackIds", "org.mp4parser.boxes.iso14496.part12.TrackReferenceTypeBox", "", "", "", "[J"));
        f58869f = factory.m21739e(factory.m21738d("setTrackIds", "org.mp4parser.boxes.iso14496.part12.TrackReferenceTypeBox", "[J", "trackIds", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }
}
