package org.mp4parser.boxes.microsoft;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TfrfBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59068j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59069n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59070o;

    /* JADX INFO: compiled from: Proguard */
    public class Entry {
        public final String toString() {
            return "Entry{fragmentAbsoluteTime=0, fragmentAbsoluteDuration=0}";
        }
    }

    static {
        Factory factory = new Factory(TfrfBox.class, "TfrfBox.java");
        f59068j = factory.m21739e(factory.m21738d("getFragmentCount", "org.mp4parser.boxes.microsoft.TfrfBox", "", "", "", "long"));
        f59069n = factory.m21739e(factory.m21738d("getEntries", "org.mp4parser.boxes.microsoft.TfrfBox", "", "", "", "java.util.List"));
        f59070o = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.microsoft.TfrfBox", "", "", "", "java.lang.String"));
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
        return new byte[]{-44, UnsignedBytes.MAX_POWER_OF_TWO, 126, -14, -54, 57, 70, -107, -114, 84, 38, -53, -98, 70, -89, -97};
    }

    public final String toString() {
        AbstractC0000a.m29z(Factory.m21736b(f59070o, this, this));
        return "TfrfBox{entries=null}";
    }
}
