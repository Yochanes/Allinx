package org.mp4parser.boxes.microsoft;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class UuidBasedProtectionSystemSpecificHeaderBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final byte[] f59073j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59074n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59075o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59076p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59077q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59078r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f59079s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f59080t;

    static {
        Factory factory = new Factory(UuidBasedProtectionSystemSpecificHeaderBox.class, "UuidBasedProtectionSystemSpecificHeaderBox.java");
        f59074n = factory.m21739e(factory.m21738d("getSystemId", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.util.UUID"));
        f59075o = factory.m21739e(factory.m21738d("setSystemId", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "java.util.UUID", "systemId", "", "void"));
        f59076p = factory.m21739e(factory.m21738d("getSystemIdString", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"));
        f59077q = factory.m21739e(factory.m21738d("getProtectionSpecificHeader", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "org.mp4parser.boxes.microsoft.ProtectionSpecificHeader"));
        f59078r = factory.m21739e(factory.m21738d("setProtectionSpecificHeader", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "org.mp4parser.boxes.microsoft.ProtectionSpecificHeader", "protectionSpecificHeader", "", "void"));
        f59079s = factory.m21739e(factory.m21738d("getProtectionSpecificHeaderString", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"));
        f59080t = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.microsoft.UuidBasedProtectionSystemSpecificHeaderBox", "", "", "", "java.lang.String"));
        f59073j = new byte[]{-48, -118, 79, Ascii.CAN, Ascii.DLE, -13, 74, -126, -74, -56, 50, -40, -85, -95, -125, -45};
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: c */
    public final byte[] mo21837c() {
        return f59073j;
    }

    public final String toString() {
        AbstractC0000a.m26w(Factory.m21736b(f59080t, this, this), "UuidBasedProtectionSystemSpecificHeaderBox{systemId=");
        throw null;
    }
}
