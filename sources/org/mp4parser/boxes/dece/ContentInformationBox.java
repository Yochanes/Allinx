package org.mp4parser.boxes.dece;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Utf8;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ContentInformationBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58415j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58416n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58417o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58418p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58419q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58420r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58421s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58422t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58423u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58424v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58425w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58426x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f58427y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f58428z;

    /* JADX INFO: compiled from: Proguard */
    public static class BrandEntry {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 0;
        }
    }

    static {
        Factory factory = new Factory(ContentInformationBox.class, "ContentInformationBox.java");
        f58415j = factory.m21739e(factory.m21738d("getMimeSubtypeName", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"));
        f58416n = factory.m21739e(factory.m21738d("setMimeSubtypeName", "org.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "mimeSubtypeName", "", "void"));
        f58425w = factory.m21739e(factory.m21738d("getBrandEntries", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"));
        f58426x = factory.m21739e(factory.m21738d("setBrandEntries", "org.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "brandEntries", "", "void"));
        f58427y = factory.m21739e(factory.m21738d("getIdEntries", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"));
        f58428z = factory.m21739e(factory.m21738d("setIdEntries", "org.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "idEntries", "", "void"));
        f58417o = factory.m21739e(factory.m21738d("getProfileLevelIdc", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"));
        f58418p = factory.m21739e(factory.m21738d("setProfileLevelIdc", "org.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "profileLevelIdc", "", "void"));
        f58419q = factory.m21739e(factory.m21738d("getCodecs", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"));
        f58420r = factory.m21739e(factory.m21738d("setCodecs", "org.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "codecs", "", "void"));
        f58421s = factory.m21739e(factory.m21738d("getProtection", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"));
        f58422t = factory.m21739e(factory.m21738d("setProtection", "org.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "protection", "", "void"));
        f58423u = factory.m21739e(factory.m21738d("getLanguages", "org.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"));
        f58424v = factory.m21739e(factory.m21738d("setLanguages", "org.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "languages", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        IsoTypeWriter.m21858i(byteBuffer, null);
        IsoTypeWriter.m21858i(byteBuffer, null);
        IsoTypeWriter.m21858i(byteBuffer, null);
        IsoTypeWriter.m21858i(byteBuffer, null);
        IsoTypeWriter.m21858i(byteBuffer, null);
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        Utf8.m21861b(null);
        Utf8.m21861b(null);
        Utf8.m21861b(null);
        Utf8.m21861b(null);
        Utf8.m21861b(null);
        throw null;
    }
}
