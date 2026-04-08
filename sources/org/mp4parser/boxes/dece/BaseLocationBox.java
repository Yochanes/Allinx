package org.mp4parser.boxes.dece;

import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.Utf8;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class BaseLocationBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58408j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58409n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58410o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58411p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58412q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58413r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58414s;

    static {
        Factory factory = new Factory(BaseLocationBox.class, "BaseLocationBox.java");
        f58408j = factory.m21739e(factory.m21738d("getBaseLocation", "org.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"));
        f58409n = factory.m21739e(factory.m21738d("setBaseLocation", "org.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "baseLocation", "", "void"));
        f58410o = factory.m21739e(factory.m21738d("getPurchaseLocation", "org.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"));
        f58411p = factory.m21739e(factory.m21738d("setPurchaseLocation", "org.mp4parser.boxes.dece.BaseLocationBox", "java.lang.String", "purchaseLocation", "", "void"));
        f58412q = factory.m21739e(factory.m21738d("equals", "org.mp4parser.boxes.dece.BaseLocationBox", "java.lang.Object", "o", "", AttributeType.BOOLEAN));
        f58413r = factory.m21739e(factory.m21738d("hashCode", "org.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "int"));
        f58414s = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.dece.BaseLocationBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.put(Utf8.m21860a(null));
        byteBuffer.put(new byte[256 - Utf8.m21861b(null)]);
        byteBuffer.put(Utf8.m21860a(null));
        byteBuffer.put(new byte[256 - Utf8.m21861b(null)]);
        byteBuffer.put(new byte[512]);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 1028L;
    }

    public final boolean equals(Object obj) {
        AbstractC0000a.m29z(Factory.m21737c(f58412q, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AbstractC0000a.m29z(Factory.m21736b(f58413r, this, this));
        return (0 * 31) + 0;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58414s, this, this), "BaseLocationBox{baseLocation='");
        sbM26w.append((String) null);
        sbM26w.append("', purchaseLocation='");
        return AbstractC0000a.m19p(sbM26w, null, "'}");
    }
}
