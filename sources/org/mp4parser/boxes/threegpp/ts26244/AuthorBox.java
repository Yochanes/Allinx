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
public class AuthorBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59141j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59142n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59143o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59144p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59145q;

    static {
        Factory factory = new Factory(AuthorBox.class, "AuthorBox.java");
        f59141j = factory.m21739e(factory.m21738d("getLanguage", "org.mp4parser.boxes.threegpp.ts26244.AuthorBox", "", "", "", "java.lang.String"));
        f59142n = factory.m21739e(factory.m21738d("setLanguage", "org.mp4parser.boxes.threegpp.ts26244.AuthorBox", "java.lang.String", "language", "", "void"));
        f59143o = factory.m21739e(factory.m21738d("getAuthor", "org.mp4parser.boxes.threegpp.ts26244.AuthorBox", "", "", "", "java.lang.String"));
        f59144p = factory.m21739e(factory.m21738d("setAuthor", "org.mp4parser.boxes.threegpp.ts26244.AuthorBox", "java.lang.String", "author", "", "void"));
        f59145q = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.threegpp.ts26244.AuthorBox", "", "", "", "java.lang.String"));
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
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f59145q, this, this), "AuthorBox[language=");
        AbstractC0000a.m29z(Factory.m21736b(f59141j, this, this));
        sbM26w.append((String) null);
        sbM26w.append(";author=");
        AbstractC0000a.m29z(Factory.m21736b(f59143o, this, this));
        return AbstractC0000a.m19p(sbM26w, null, "]");
    }
}
