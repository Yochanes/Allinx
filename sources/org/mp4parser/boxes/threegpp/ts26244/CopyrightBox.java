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
public class CopyrightBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59155j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59156n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59157o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59158p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59159q;

    static {
        Factory factory = new Factory(CopyrightBox.class, "CopyrightBox.java");
        f59155j = factory.m21739e(factory.m21738d("getLanguage", "org.mp4parser.boxes.threegpp.ts26244.CopyrightBox", "", "", "", "java.lang.String"));
        f59156n = factory.m21739e(factory.m21738d("setLanguage", "org.mp4parser.boxes.threegpp.ts26244.CopyrightBox", "java.lang.String", "language", "", "void"));
        f59157o = factory.m21739e(factory.m21738d("getCopyright", "org.mp4parser.boxes.threegpp.ts26244.CopyrightBox", "", "", "", "java.lang.String"));
        f59158p = factory.m21739e(factory.m21738d("setCopyright", "org.mp4parser.boxes.threegpp.ts26244.CopyrightBox", "java.lang.String", "copyright", "", "void"));
        f59159q = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.threegpp.ts26244.CopyrightBox", "", "", "", "java.lang.String"));
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
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f59159q, this, this), "CopyrightBox[language=");
        AbstractC0000a.m29z(Factory.m21736b(f59155j, this, this));
        sbM26w.append((String) null);
        sbM26w.append(";copyright=");
        AbstractC0000a.m29z(Factory.m21736b(f59157o, this, this));
        return AbstractC0000a.m19p(sbM26w, null, "]");
    }
}
