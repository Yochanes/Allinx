package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.IsoFile;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.Utf8;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SchemeTypeBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58733j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58734n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58735o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58736p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58737q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58738r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58739s;

    static {
        Factory factory = new Factory(SchemeTypeBox.class, "SchemeTypeBox.java");
        f58733j = factory.m21739e(factory.m21738d("getSchemeType", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "", "", "", "java.lang.String"));
        f58734n = factory.m21739e(factory.m21738d("setSchemeType", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "java.lang.String", "schemeType", "", "void"));
        f58735o = factory.m21739e(factory.m21738d("getSchemeVersion", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "", "", "", "long"));
        f58736p = factory.m21739e(factory.m21738d("setSchemeVersion", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "int", "schemeVersion", "", "void"));
        f58737q = factory.m21739e(factory.m21738d("getSchemeUri", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "", "", "", "java.lang.String"));
        f58738r = factory.m21739e(factory.m21738d("setSchemeUri", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "java.lang.String", "schemeUri", "", "void"));
        f58739s = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.SchemeTypeBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.put(IsoFile.m21819g(null));
        byteBuffer.putInt((int) 0);
        if ((this.f59264f & 1) == 1) {
            byteBuffer.put(Utf8.m21860a(null));
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return ((this.f59264f & 1) == 1 ? Utf8.m21861b(null) + 1 : 0) + 12;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58739s, this, this), "Schema Type Box[schemeUri=");
        sbM26w.append((String) null);
        sbM26w.append("; schemeType=");
        sbM26w.append((String) null);
        sbM26w.append("; schemeVersion=");
        return AbstractC0000a.m12i(0L, "; ]", sbM26w);
    }
}
