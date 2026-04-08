package org.mp4parser.boxes.iso14496.part12;

import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.tools.IsoTypeWriter;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SoundMediaHeaderBox extends AbstractMediaHeaderBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58759j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58760n;

    static {
        Factory factory = new Factory(SoundMediaHeaderBox.class, "SoundMediaHeaderBox.java");
        f58759j = factory.m21739e(factory.m21738d("getBalance", "org.mp4parser.boxes.iso14496.part12.SoundMediaHeaderBox", "", "", "", AttributeType.FLOAT));
        f58760n = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.SoundMediaHeaderBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        IsoTypeWriter.m21852c(byteBuffer, 0.0f);
        IsoTypeWriter.m21854e(0, byteBuffer);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 8L;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58760n, this, this), "SoundMediaHeaderBox[balance=");
        AbstractC0000a.m29z(Factory.m21736b(f58759j, this, this));
        sbM26w.append(0.0f);
        sbM26w.append("]");
        return sbM26w.toString();
    }
}
