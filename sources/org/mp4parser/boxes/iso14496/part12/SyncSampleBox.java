package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SyncSampleBox extends AbstractFullBox {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58768n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58769o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58770p;

    /* JADX INFO: renamed from: j */
    public long[] f58771j;

    static {
        Factory factory = new Factory(SyncSampleBox.class, "SyncSampleBox.java");
        f58768n = factory.m21739e(factory.m21738d("getSampleNumber", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "", "", "", "[J"));
        f58769o = factory.m21739e(factory.m21738d("setSampleNumber", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "[J", "sampleNumber", "", "void"));
        f58770p = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.SyncSampleBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.putInt(this.f58771j.length);
        for (long j : this.f58771j) {
            byteBuffer.putInt((int) j);
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return (((long) this.f58771j.length) * 4) + 8;
    }

    public final String toString() {
        return AbstractC0000a.m11h(this.f58771j.length, "]", AbstractC0000a.m26w(Factory.m21736b(f58770p, this, this), "SyncSampleBox[entryCount="));
    }
}
