package org.mp4parser.boxes.dece;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AvcNalUnitStorageBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58402d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58403f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58404g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58405i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58406j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58407n;

    static {
        Factory factory = new Factory(AvcNalUnitStorageBox.class, "AvcNalUnitStorageBox.java");
        f58402d = factory.m21739e(factory.m21738d("getAvcDecoderConfigurationRecord", "org.mp4parser.boxes.dece.AvcNalUnitStorageBox", "", "", "", "org.mp4parser.boxes.iso14496.part15.AvcDecoderConfigurationRecord"));
        f58403f = factory.m21739e(factory.m21738d("getLengthSizeMinusOne", "org.mp4parser.boxes.dece.AvcNalUnitStorageBox", "", "", "", "int"));
        f58404g = factory.m21739e(factory.m21738d("getSequenceParameterSetsAsStrings", "org.mp4parser.boxes.dece.AvcNalUnitStorageBox", "", "", "", "java.util.List"));
        f58405i = factory.m21739e(factory.m21738d("getSequenceParameterSetExtsAsStrings", "org.mp4parser.boxes.dece.AvcNalUnitStorageBox", "", "", "", "java.util.List"));
        f58406j = factory.m21739e(factory.m21738d("getPictureParameterSetsAsStrings", "org.mp4parser.boxes.dece.AvcNalUnitStorageBox", "", "", "", "java.util.List"));
        f58407n = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.dece.AvcNalUnitStorageBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }

    public final String toString() {
        AbstractC0000a.m26w(Factory.m21736b(f58407n, this, this), "AvcNalUnitStorageBox{SPS=");
        throw null;
    }
}
