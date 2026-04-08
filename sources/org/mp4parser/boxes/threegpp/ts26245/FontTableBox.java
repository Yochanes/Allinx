package org.mp4parser.boxes.threegpp.ts26245;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class FontTableBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f59212d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f59213f;

    /* JADX INFO: compiled from: Proguard */
    public static class FontRecord {
        public final String toString() {
            return "FontRecord{fontId=0, fontname='null'}";
        }
    }

    static {
        Factory factory = new Factory(FontTableBox.class, "FontTableBox.java");
        f59212d = factory.m21739e(factory.m21738d("getEntries", "org.mp4parser.boxes.threegpp.ts26245.FontTableBox", "", "", "", "java.util.List"));
        f59213f = factory.m21739e(factory.m21738d("setEntries", "org.mp4parser.boxes.threegpp.ts26245.FontTableBox", "java.util.List", "entries", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }
}
