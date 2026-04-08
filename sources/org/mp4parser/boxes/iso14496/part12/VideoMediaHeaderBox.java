package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.tools.IsoTypeWriter;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class VideoMediaHeaderBox extends AbstractMediaHeaderBox {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58890o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58891p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58892q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58893r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58894s;

    /* JADX INFO: renamed from: j */
    public int f58895j;

    /* JADX INFO: renamed from: n */
    public int[] f58896n;

    static {
        Factory factory = new Factory(VideoMediaHeaderBox.class, "VideoMediaHeaderBox.java");
        f58890o = factory.m21739e(factory.m21738d("getGraphicsmode", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "", "int"));
        f58891p = factory.m21739e(factory.m21738d("setGraphicsmode", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "int", "graphicsmode", "", "void"));
        f58892q = factory.m21739e(factory.m21738d("getOpcolor", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "", "[I"));
        f58893r = factory.m21739e(factory.m21738d("setOpcolor", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "[I", "opcolor", "", "void"));
        f58894s = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        IsoTypeWriter.m21854e(this.f58895j, byteBuffer);
        for (int i : this.f58896n) {
            IsoTypeWriter.m21854e(i, byteBuffer);
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 12L;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58894s, this, this), "VideoMediaHeaderBox[graphicsmode=");
        AbstractC0000a.m29z(Factory.m21736b(f58890o, this, this));
        sbM26w.append(this.f58895j);
        sbM26w.append(";opcolor0=");
        AbstractC0000a.m29z(Factory.m21736b(f58892q, this, this));
        sbM26w.append(this.f58896n[0]);
        sbM26w.append(";opcolor1=");
        AbstractC0000a.m29z(Factory.m21736b(f58892q, this, this));
        sbM26w.append(this.f58896n[1]);
        sbM26w.append(";opcolor2=");
        AbstractC0000a.m29z(Factory.m21736b(f58892q, this, this));
        return AbstractC0000a.m11h(this.f58896n[2], "]", sbM26w);
    }
}
