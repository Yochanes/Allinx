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
public class RatingBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59196j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59197n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59198o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59199p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59200q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59201r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f59202s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f59203t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f59204u;

    static {
        Factory factory = new Factory(RatingBox.class, "RatingBox.java");
        f59196j = factory.m21739e(factory.m21738d("getLanguage", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "", "", "", "java.lang.String"));
        f59197n = factory.m21739e(factory.m21738d("setLanguage", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "java.lang.String", "language", "", "void"));
        f59198o = factory.m21739e(factory.m21738d("getRatingEntity", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "", "", "", "java.lang.String"));
        f59199p = factory.m21739e(factory.m21738d("setRatingEntity", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "java.lang.String", "ratingEntity", "", "void"));
        f59200q = factory.m21739e(factory.m21738d("getRatingCriteria", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "", "", "", "java.lang.String"));
        f59201r = factory.m21739e(factory.m21738d("setRatingCriteria", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "java.lang.String", "ratingCriteria", "", "void"));
        f59202s = factory.m21739e(factory.m21738d("getRatingInfo", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "", "", "", "java.lang.String"));
        f59203t = factory.m21739e(factory.m21738d("setRatingInfo", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "java.lang.String", "ratingInfo", "", "void"));
        f59204u = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.threegpp.ts26244.RatingBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.put(IsoFile.m21819g(null));
        byteBuffer.put(IsoFile.m21819g(null));
        IsoTypeWriter.m21853d(byteBuffer, null);
        byteBuffer.put(Utf8.m21860a(null));
        byteBuffer.put((byte) 0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return Utf8.m21861b(null) + 15;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f59204u, this, this), "RatingBox[language=");
        AbstractC0000a.m29z(Factory.m21736b(f59196j, this, this));
        sbM26w.append((String) null);
        sbM26w.append("ratingEntity=");
        AbstractC0000a.m29z(Factory.m21736b(f59198o, this, this));
        sbM26w.append((String) null);
        sbM26w.append(";ratingCriteria=");
        AbstractC0000a.m29z(Factory.m21736b(f59200q, this, this));
        sbM26w.append((String) null);
        sbM26w.append(";language=");
        AbstractC0000a.m29z(Factory.m21736b(f59196j, this, this));
        sbM26w.append((String) null);
        sbM26w.append(";ratingInfo=");
        AbstractC0000a.m29z(Factory.m21736b(f59202s, this, this));
        return AbstractC0000a.m19p(sbM26w, null, "]");
    }
}
