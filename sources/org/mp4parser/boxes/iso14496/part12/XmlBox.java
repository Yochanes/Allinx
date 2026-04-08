package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.Utf8;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class XmlBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58897j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58898n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58899o;

    static {
        Factory factory = new Factory(XmlBox.class, "XmlBox.java");
        f58897j = factory.m21739e(factory.m21738d("getXml", "org.mp4parser.boxes.iso14496.part12.XmlBox", "", "", "", "java.lang.String"));
        f58898n = factory.m21739e(factory.m21738d("setXml", "org.mp4parser.boxes.iso14496.part12.XmlBox", "java.lang.String", "xml", "", "void"));
        f58899o = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.XmlBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.put(Utf8.m21860a(null));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return Utf8.m21861b(null) + 4;
    }

    public final String toString() {
        return AbstractC0000a.m19p(AbstractC0000a.m26w(Factory.m21736b(f58899o, this, this), "XmlBox{xml='"), null, "'}");
    }
}
