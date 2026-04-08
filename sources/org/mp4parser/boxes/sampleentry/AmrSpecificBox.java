package org.mp4parser.boxes.sampleentry;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.IsoFile;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.tools.IsoTypeWriter;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AmrSpecificBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f59100d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f59101f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f59102g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f59103i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59104j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59105n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59106o;

    static {
        Factory factory = new Factory(AmrSpecificBox.class, "AmrSpecificBox.java");
        f59100d = factory.m21739e(factory.m21738d("getVendor", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"));
        f59101f = factory.m21739e(factory.m21738d("getDecoderVersion", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"));
        f59102g = factory.m21739e(factory.m21738d("getModeSet", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"));
        f59103i = factory.m21739e(factory.m21738d("getModeChangePeriod", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"));
        f59104j = factory.m21739e(factory.m21738d("getFramesPerSample", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"));
        f59105n = factory.m21739e(factory.m21738d("getContent", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"));
        f59106o = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        AbstractC0000a.m29z(Factory.m21737c(f59105n, this, this, byteBuffer));
        byteBuffer.put(IsoFile.m21819g(null));
        byteBuffer.put((byte) (0 & 255));
        IsoTypeWriter.m21854e(0, byteBuffer);
        byteBuffer.put((byte) (0 & 255));
        byteBuffer.put((byte) (0 & 255));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 9L;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f59106o, this, this), "AmrSpecificBox[vendor=");
        AbstractC0000a.m29z(Factory.m21736b(f59100d, this, this));
        sbM26w.append((String) null);
        sbM26w.append(";decoderVersion=");
        AbstractC0000a.m29z(Factory.m21736b(f59101f, this, this));
        sbM26w.append(0);
        sbM26w.append(";modeSet=");
        AbstractC0000a.m29z(Factory.m21736b(f59102g, this, this));
        sbM26w.append(0);
        sbM26w.append(";modeChangePeriod=");
        AbstractC0000a.m29z(Factory.m21736b(f59103i, this, this));
        sbM26w.append(0);
        sbM26w.append(";framesPerSample=");
        AbstractC0000a.m29z(Factory.m21736b(f59104j, this, this));
        return AbstractC0000a.m11h(0, "]", sbM26w);
    }
}
