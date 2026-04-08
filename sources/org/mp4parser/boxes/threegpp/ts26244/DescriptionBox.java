package org.mp4parser.boxes.threegpp.ts26244;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DescriptionBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59160j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59161n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59162o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59163p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59164q;

    static {
        Factory factory = new Factory(DescriptionBox.class, "DescriptionBox.java");
        f59160j = factory.m21739e(factory.m21738d("getLanguage", "org.mp4parser.boxes.threegpp.ts26244.DescriptionBox", "", "", "", "java.lang.String"));
        f59161n = factory.m21739e(factory.m21738d("setLanguage", "org.mp4parser.boxes.threegpp.ts26244.DescriptionBox", "java.lang.String", "language", "", "void"));
        f59162o = factory.m21739e(factory.m21738d("getDescription", "org.mp4parser.boxes.threegpp.ts26244.DescriptionBox", "", "", "", "java.lang.String"));
        f59163p = factory.m21739e(factory.m21738d("setDescription", "org.mp4parser.boxes.threegpp.ts26244.DescriptionBox", "java.lang.String", "description", "", "void"));
        f59164q = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.threegpp.ts26244.DescriptionBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        IsoTypeWriter.m21853d(byteBuffer, null);
        byteBuffer.put(Utf8.m21860a(null));
        byteBuffer.put((byte) 0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return Utf8.m21861b(null) + 7;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f59164q, this, this), "DescriptionBox[language=");
        AbstractC0000a.m29z(Factory.m21736b(f59160j, this, this));
        sbM26w.append((String) null);
        sbM26w.append(";description=");
        AbstractC0000a.m29z(Factory.m21736b(f59162o, this, this));
        return AbstractC0000a.m19p(sbM26w, null, "]");
    }
}
