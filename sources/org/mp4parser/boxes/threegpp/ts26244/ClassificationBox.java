package org.mp4parser.boxes.threegpp.ts26244;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.IsoFile;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ClassificationBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59146j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59147n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59148o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59149p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59150q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59151r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f59152s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f59153t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f59154u;

    static {
        Factory factory = new Factory(ClassificationBox.class, "ClassificationBox.java");
        f59146j = factory.m21739e(factory.m21738d("getLanguage", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "", "", "", "java.lang.String"));
        f59147n = factory.m21739e(factory.m21738d("setLanguage", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "java.lang.String", "language", "", "void"));
        f59148o = factory.m21739e(factory.m21738d("getClassificationEntity", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "", "", "", "java.lang.String"));
        f59149p = factory.m21739e(factory.m21738d("setClassificationEntity", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "java.lang.String", "classificationEntity", "", "void"));
        f59150q = factory.m21739e(factory.m21738d("getClassificationTableIndex", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "", "", "", "int"));
        f59151r = factory.m21739e(factory.m21738d("setClassificationTableIndex", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "int", "classificationTableIndex", "", "void"));
        f59152s = factory.m21739e(factory.m21738d("getClassificationInfo", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "", "", "", "java.lang.String"));
        f59153t = factory.m21739e(factory.m21738d("setClassificationInfo", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "java.lang.String", "classificationInfo", "", "void"));
        f59154u = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.threegpp.ts26244.ClassificationBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.put(IsoFile.m21819g(null));
        IsoTypeWriter.m21854e(0, byteBuffer);
        IsoTypeWriter.m21853d(byteBuffer, null);
        byteBuffer.put(Utf8.m21860a(null));
        byteBuffer.put((byte) 0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return Utf8.m21861b(null) + 9;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f59154u, this, this), "ClassificationBox[language=");
        AbstractC0000a.m29z(Factory.m21736b(f59146j, this, this));
        sbM26w.append((String) null);
        sbM26w.append("classificationEntity=");
        AbstractC0000a.m29z(Factory.m21736b(f59148o, this, this));
        sbM26w.append((String) null);
        sbM26w.append(";classificationTableIndex=");
        AbstractC0000a.m29z(Factory.m21736b(f59150q, this, this));
        sbM26w.append(0);
        sbM26w.append(";language=");
        AbstractC0000a.m29z(Factory.m21736b(f59146j, this, this));
        sbM26w.append((String) null);
        sbM26w.append(";classificationInfo=");
        AbstractC0000a.m29z(Factory.m21736b(f59152s, this, this));
        return AbstractC0000a.m19p(sbM26w, null, "]");
    }
}
