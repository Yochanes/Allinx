package org.mp4parser.boxes.dece;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.Utf8;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AssetInformationBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58398j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58399n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58400o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58401p;

    /* JADX INFO: compiled from: Proguard */
    public static class Entry {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "{namespace='null', profileLevelIdc='null', assetId='null'}";
        }
    }

    static {
        Factory factory = new Factory(AssetInformationBox.class, "AssetInformationBox.java");
        f58398j = factory.m21739e(factory.m21738d("getApid", "org.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"));
        f58399n = factory.m21739e(factory.m21738d("setApid", "org.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "apid", "", "void"));
        f58400o = factory.m21739e(factory.m21738d("getProfileVersion", "org.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"));
        f58401p = factory.m21739e(factory.m21738d("setProfileVersion", "org.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "profileVersion", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        if (this.f59263d != 0) {
            throw new RuntimeException("Unknown ainf version " + this.f59263d);
        }
        byteBuffer.put(Utf8.m21860a(null), 0, 4);
        byteBuffer.put(Utf8.m21860a(null));
        byteBuffer.put((byte) 0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return Utf8.m21861b(null) + 9;
    }
}
