package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.IsoFile;
import org.mp4parser.support.AbstractBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class OriginalFormatBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58690d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58691f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58692g;

    static {
        Factory factory = new Factory(OriginalFormatBox.class, "OriginalFormatBox.java");
        f58690d = factory.m21739e(factory.m21738d("getDataFormat", "org.mp4parser.boxes.iso14496.part12.OriginalFormatBox", "", "", "", "java.lang.String"));
        f58691f = factory.m21739e(factory.m21738d("setDataFormat", "org.mp4parser.boxes.iso14496.part12.OriginalFormatBox", "java.lang.String", "dataFormat", "", "void"));
        f58692g = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.OriginalFormatBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.put(IsoFile.m21819g(null));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 4L;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58692g, this, this), "OriginalFormatBox[dataFormat=");
        AbstractC0000a.m29z(Factory.m21736b(f58690d, this, this));
        return AbstractC0000a.m19p(sbM26w, null, "]");
    }
}
