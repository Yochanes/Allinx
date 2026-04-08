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
public class AlbumBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59134j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59135n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59136o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59137p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59138q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59139r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f59140s;

    static {
        Factory factory = new Factory(AlbumBox.class, "AlbumBox.java");
        f59134j = factory.m21739e(factory.m21738d("getLanguage", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "", "", "", "java.lang.String"));
        f59135n = factory.m21739e(factory.m21738d("setLanguage", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "java.lang.String", "language", "", "void"));
        f59136o = factory.m21739e(factory.m21738d("getAlbumTitle", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "", "", "", "java.lang.String"));
        f59137p = factory.m21739e(factory.m21738d("setAlbumTitle", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "java.lang.String", "albumTitle", "", "void"));
        f59138q = factory.m21739e(factory.m21738d("getTrackNumber", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "", "", "", "int"));
        f59139r = factory.m21739e(factory.m21738d("setTrackNumber", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "int", "trackNumber", "", "void"));
        f59140s = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.threegpp.ts26244.AlbumBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        IsoTypeWriter.m21853d(byteBuffer, null);
        byteBuffer.put(Utf8.m21860a(null));
        byteBuffer.put((byte) 0);
        byteBuffer.put((byte) (0 & 255));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return Utf8.m21861b(null) + 7 + 1;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f59140s, this, this), "AlbumBox[language=");
        AbstractC0000a.m29z(Factory.m21736b(f59134j, this, this));
        sbM26w.append((String) null);
        sbM26w.append(";albumTitle=");
        AbstractC0000a.m29z(Factory.m21736b(f59136o, this, this));
        sbM26w.append((String) null);
        sbM26w.append(";trackNumber=");
        AbstractC0000a.m29z(Factory.m21736b(f59138q, this, this));
        sbM26w.append(0);
        sbM26w.append("]");
        return sbM26w.toString();
    }
}
