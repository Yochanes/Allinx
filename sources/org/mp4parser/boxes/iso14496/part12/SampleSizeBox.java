package org.mp4parser.boxes.iso14496.part12;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SampleSizeBox extends AbstractFullBox {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58717n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58718o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58719p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58720q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58721r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58722s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58723t;

    /* JADX INFO: renamed from: j */
    public long[] f58724j;

    static {
        Factory factory = new Factory(SampleSizeBox.class, "SampleSizeBox.java");
        f58717n = factory.m21739e(factory.m21738d("getSampleSize", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "long"));
        f58718o = factory.m21739e(factory.m21738d("setSampleSize", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "long", "sampleSize", "", "void"));
        f58719p = factory.m21739e(factory.m21738d("getSampleSizeAtIndex", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "int", FirebaseAnalytics.Param.INDEX, "", "long"));
        f58720q = factory.m21739e(factory.m21738d("getSampleCount", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "long"));
        f58721r = factory.m21739e(factory.m21738d("getSampleSizes", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "[J"));
        f58722s = factory.m21739e(factory.m21738d("setSampleSizes", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "[J", "sampleSizes", "", "void"));
        f58723t = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.SampleSizeBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.putInt((int) 0);
        if (0 != 0) {
            byteBuffer.putInt(0);
            return;
        }
        byteBuffer.putInt(this.f58724j.length);
        for (long j : this.f58724j) {
            byteBuffer.putInt((int) j);
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return (0 == 0 ? this.f58724j.length * 4 : 0) + 12;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58723t, this, this), "SampleSizeBox[sampleSize=");
        AbstractC0000a.m29z(Factory.m21736b(f58717n, this, this));
        sbM26w.append(0L);
        sbM26w.append(";sampleCount=");
        AbstractC0000a.m29z(Factory.m21736b(f58720q, this, this));
        return AbstractC0000a.m12i(0 > 0 ? 0 : this.f58724j.length, "]", sbM26w);
    }
}
