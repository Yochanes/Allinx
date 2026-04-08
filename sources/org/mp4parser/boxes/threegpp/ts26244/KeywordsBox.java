package org.mp4parser.boxes.threegpp.ts26244;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeWriter;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class KeywordsBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59170j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59171n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59172o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59173p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59174q;

    static {
        Factory factory = new Factory(KeywordsBox.class, "KeywordsBox.java");
        f59170j = factory.m21739e(factory.m21738d("getLanguage", "org.mp4parser.boxes.threegpp.ts26244.KeywordsBox", "", "", "", "java.lang.String"));
        f59171n = factory.m21739e(factory.m21738d("setLanguage", "org.mp4parser.boxes.threegpp.ts26244.KeywordsBox", "java.lang.String", "language", "", "void"));
        f59172o = factory.m21739e(factory.m21738d("getKeywords", "org.mp4parser.boxes.threegpp.ts26244.KeywordsBox", "", "", "", "[Ljava.lang.String;"));
        f59173p = factory.m21739e(factory.m21738d("setKeywords", "org.mp4parser.boxes.threegpp.ts26244.KeywordsBox", "[Ljava.lang.String;", "keywords", "", "void"));
        f59174q = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.threegpp.ts26244.KeywordsBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        IsoTypeWriter.m21853d(byteBuffer, null);
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }

    public final String toString() {
        JoinPoint joinPointM21736b = Factory.m21736b(f59174q, this, this);
        RequiresParseDetailAspect.m21845a().getClass();
        RequiresParseDetailAspect.m21846b(joinPointM21736b);
        StringBuffer stringBuffer = new StringBuffer("KeywordsBox[language=");
        AbstractC0000a.m29z(Factory.m21736b(f59170j, this, this));
        stringBuffer.append((String) null);
        throw null;
    }
}
