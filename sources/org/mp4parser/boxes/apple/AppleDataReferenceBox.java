package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.IsoFile;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.Utf8;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AppleDataReferenceBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58277j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58278n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58279o;

    static {
        Factory factory = new Factory(AppleDataReferenceBox.class, "AppleDataReferenceBox.java");
        f58277j = factory.m21739e(factory.m21738d("getDataReferenceSize", "org.mp4parser.boxes.apple.AppleDataReferenceBox", "", "", "", "long"));
        f58278n = factory.m21739e(factory.m21738d("getDataReferenceType", "org.mp4parser.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"));
        f58279o = factory.m21739e(factory.m21738d("getDataReference", "org.mp4parser.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.put(IsoFile.m21819g(null));
        byteBuffer.putInt(0);
        byteBuffer.put(Utf8.m21860a(null));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 0 + 12;
    }
}
