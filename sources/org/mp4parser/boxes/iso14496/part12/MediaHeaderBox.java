package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.DateHelper;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class MediaHeaderBox extends AbstractFullBox {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ JoinPoint.StaticPart f58628A;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ JoinPoint.StaticPart f58629B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ JoinPoint.StaticPart f58630C;

    /* JADX INFO: renamed from: r */
    public static final Logger f58631r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58632s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58633t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58634u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58635v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58636w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58637x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f58638y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f58639z;

    /* JADX INFO: renamed from: j */
    public Date f58640j;

    /* JADX INFO: renamed from: n */
    public Date f58641n;

    /* JADX INFO: renamed from: o */
    public long f58642o;

    /* JADX INFO: renamed from: p */
    public long f58643p;

    /* JADX INFO: renamed from: q */
    public String f58644q;

    static {
        Factory factory = new Factory(MediaHeaderBox.class, "MediaHeaderBox.java");
        f58632s = factory.m21739e(factory.m21738d("getCreationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.util.Date"));
        f58633t = factory.m21739e(factory.m21738d("setCreationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"));
        f58630C = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.lang.String"));
        f58634u = factory.m21739e(factory.m21738d("getModificationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.util.Date"));
        f58635v = factory.m21739e(factory.m21738d("setModificationTime", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"));
        f58636w = factory.m21739e(factory.m21738d("getTimescale", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "long"));
        f58637x = factory.m21739e(factory.m21738d("setTimescale", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "long", "timescale", "", "void"));
        f58638y = factory.m21739e(factory.m21738d("getDuration", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "long"));
        f58639z = factory.m21739e(factory.m21738d("setDuration", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "long", "duration", "", "void"));
        f58628A = factory.m21739e(factory.m21738d("getLanguage", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "", "", "", "java.lang.String"));
        f58629B = factory.m21739e(factory.m21738d("setLanguage", "org.mp4parser.boxes.iso14496.part12.MediaHeaderBox", "java.lang.String", "language", "", "void"));
        f58631r = LoggerFactory.getLogger((Class<?>) MediaHeaderBox.class);
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        if (this.f59263d == 1) {
            byteBuffer.putLong(DateHelper.m21847a(this.f58640j));
            byteBuffer.putLong(DateHelper.m21847a(this.f58641n));
            byteBuffer.putInt((int) this.f58642o);
            byteBuffer.putLong(this.f58643p);
        } else {
            byteBuffer.putInt((int) DateHelper.m21847a(this.f58640j));
            byteBuffer.putInt((int) DateHelper.m21847a(this.f58641n));
            byteBuffer.putInt((int) this.f58642o);
            byteBuffer.putInt((int) this.f58643p);
        }
        IsoTypeWriter.m21853d(byteBuffer, this.f58644q);
        IsoTypeWriter.m21854e(0, byteBuffer);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return (this.f59263d == 1 ? 32L : 20L) + 4;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58630C, this, this), "MediaHeaderBox[creationTime=");
        AbstractC0000a.m29z(Factory.m21736b(f58632s, this, this));
        sbM26w.append(this.f58640j);
        sbM26w.append(";modificationTime=");
        AbstractC0000a.m29z(Factory.m21736b(f58634u, this, this));
        sbM26w.append(this.f58641n);
        sbM26w.append(";timescale=");
        AbstractC0000a.m29z(Factory.m21736b(f58636w, this, this));
        sbM26w.append(this.f58642o);
        sbM26w.append(";duration=");
        AbstractC0000a.m29z(Factory.m21736b(f58638y, this, this));
        sbM26w.append(this.f58643p);
        sbM26w.append(";language=");
        AbstractC0000a.m29z(Factory.m21736b(f58628A, this, this));
        return AbstractC0000a.m19p(sbM26w, this.f58644q, "]");
    }
}
