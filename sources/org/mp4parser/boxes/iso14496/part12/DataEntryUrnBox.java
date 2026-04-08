package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.Utf8;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DataEntryUrnBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58577j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58578n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58579o;

    static {
        Factory factory = new Factory(DataEntryUrnBox.class, "DataEntryUrnBox.java");
        f58577j = factory.m21739e(factory.m21738d("getName", "org.mp4parser.boxes.iso14496.part12.DataEntryUrnBox", "", "", "", "java.lang.String"));
        f58578n = factory.m21739e(factory.m21738d("getLocation", "org.mp4parser.boxes.iso14496.part12.DataEntryUrnBox", "", "", "", "java.lang.String"));
        f58579o = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.DataEntryUrnBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.put(Utf8.m21860a(null));
        byteBuffer.put((byte) 0);
        byteBuffer.put(Utf8.m21860a(null));
        byteBuffer.put((byte) 0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return Utf8.m21861b(null) + Utf8.m21861b(null) + 1 + 1;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58579o, this, this), "DataEntryUrlBox[name=");
        AbstractC0000a.m29z(Factory.m21736b(f58577j, this, this));
        sbM26w.append((String) null);
        sbM26w.append(";location=");
        AbstractC0000a.m29z(Factory.m21736b(f58578n, this, this));
        return AbstractC0000a.m19p(sbM26w, null, "]");
    }
}
