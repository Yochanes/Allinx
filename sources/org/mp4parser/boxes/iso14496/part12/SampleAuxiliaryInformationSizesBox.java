package org.mp4parser.boxes.iso14496.part12;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.IsoFile;
import org.mp4parser.support.AbstractFullBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SampleAuxiliaryInformationSizesBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58702j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58703n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58704o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58705p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58706q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58707r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58708s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58709t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58710u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58711v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58712w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58713x;

    static {
        Factory factory = new Factory(SampleAuxiliaryInformationSizesBox.class, "SampleAuxiliaryInformationSizesBox.java");
        f58702j = factory.m21739e(factory.m21738d("getSize", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", FirebaseAnalytics.Param.INDEX, "", "short"));
        f58703n = factory.m21739e(factory.m21738d("getAuxInfoType", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"));
        f58712w = factory.m21739e(factory.m21738d("setSampleCount", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "sampleCount", "", "void"));
        f58713x = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"));
        f58704o = factory.m21739e(factory.m21738d("setAuxInfoType", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoType", "", "void"));
        f58705p = factory.m21739e(factory.m21738d("getAuxInfoTypeParameter", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"));
        f58706q = factory.m21739e(factory.m21738d("setAuxInfoTypeParameter", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoTypeParameter", "", "void"));
        f58707r = factory.m21739e(factory.m21738d("getDefaultSampleInfoSize", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"));
        f58708s = factory.m21739e(factory.m21738d("setDefaultSampleInfoSize", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "defaultSampleInfoSize", "", "void"));
        f58709t = factory.m21739e(factory.m21738d("getSampleInfoSizes", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "[S"));
        f58710u = factory.m21739e(factory.m21738d("setSampleInfoSizes", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "[S", "sampleInfoSizes", "", "void"));
        f58711v = factory.m21739e(factory.m21738d("getSampleCount", "org.mp4parser.boxes.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        if ((this.f59264f & 1) == 1) {
            byteBuffer.put(IsoFile.m21819g(null));
            byteBuffer.put(IsoFile.m21819g(null));
        }
        byteBuffer.put((byte) (0 & 255));
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58713x, this, this), "SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=");
        sbM26w.append(0);
        sbM26w.append(", sampleCount=");
        sbM26w.append(0);
        sbM26w.append(", auxInfoType='");
        sbM26w.append((String) null);
        sbM26w.append("', auxInfoTypeParameter='");
        return AbstractC0000a.m19p(sbM26w, null, "'}");
    }
}
