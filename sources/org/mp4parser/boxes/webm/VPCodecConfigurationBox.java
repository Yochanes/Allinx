package org.mp4parser.boxes.webm;

import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitWriterBuffer;
import org.mp4parser.support.AbstractFullBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class VPCodecConfigurationBox extends AbstractFullBox {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ JoinPoint.StaticPart f59238A;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ JoinPoint.StaticPart f59239B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ JoinPoint.StaticPart f59240C;

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ JoinPoint.StaticPart f59241D;

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ JoinPoint.StaticPart f59242E;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59243j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59244n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59245o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59246p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59247q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59248r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f59249s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f59250t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f59251u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f59252v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f59253w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f59254x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f59255y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f59256z;

    static {
        Factory factory = new Factory(VPCodecConfigurationBox.class, "VPCodecConfigurationBox.java");
        f59243j = factory.m21739e(factory.m21738d("getProfile", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "", "", "", "int"));
        f59244n = factory.m21739e(factory.m21738d("setProfile", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "int", Scopes.PROFILE, "", "void"));
        f59253w = factory.m21739e(factory.m21738d("getColourPrimaries", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "", "", "", "int"));
        f59254x = factory.m21739e(factory.m21738d("setColourPrimaries", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "int", "colourPrimaries", "", "void"));
        f59255y = factory.m21739e(factory.m21738d("getTransferCharacteristics", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "", "", "", "int"));
        f59256z = factory.m21739e(factory.m21738d("setTransferCharacteristics", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "int", "transferCharacteristics", "", "void"));
        f59238A = factory.m21739e(factory.m21738d("getMatrixCoefficients", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "", "", "", "int"));
        f59239B = factory.m21739e(factory.m21738d("setMatrixCoefficients", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "int", "matrixCoefficients", "", "void"));
        f59240C = factory.m21739e(factory.m21738d("getCodecIntializationData", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "", "", "", "[B"));
        f59241D = factory.m21739e(factory.m21738d("setCodecIntializationData", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "[B", "codecIntializationData", "", "void"));
        f59242E = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "", "", "", "java.lang.String"));
        f59245o = factory.m21739e(factory.m21738d("getLevel", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "", "", "", "int"));
        f59246p = factory.m21739e(factory.m21738d("setLevel", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "int", FirebaseAnalytics.Param.LEVEL, "", "void"));
        f59247q = factory.m21739e(factory.m21738d("getBitDepth", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "", "", "", "int"));
        f59248r = factory.m21739e(factory.m21738d("setBitDepth", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "int", "bitDepth", "", "void"));
        f59249s = factory.m21739e(factory.m21738d("getChromaSubsampling", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "", "", "", "int"));
        f59250t = factory.m21739e(factory.m21738d("setChromaSubsampling", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "int", "chromaSubsampling", "", "void"));
        f59251u = factory.m21739e(factory.m21738d("getVideoFullRangeFlag", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "", "", "", "int"));
        f59252v = factory.m21739e(factory.m21738d("setVideoFullRangeFlag", "org.mp4parser.boxes.webm.VPCodecConfigurationBox", "int", "videoFullRangeFlag", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.m21829a(0, 8);
        bitWriterBuffer.m21829a(0, 8);
        bitWriterBuffer.m21829a(0, 4);
        bitWriterBuffer.m21829a(0, 3);
        bitWriterBuffer.m21829a(0, 1);
        bitWriterBuffer.m21829a(0, 8);
        bitWriterBuffer.m21829a(0, 8);
        bitWriterBuffer.m21829a(0, 8);
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f59242E, this, this), "VPCodecConfigurationBox{profile=");
        sbM26w.append(0);
        sbM26w.append(", level=");
        sbM26w.append(0);
        sbM26w.append(", bitDepth=");
        sbM26w.append(0);
        sbM26w.append(", chromaSubsampling=");
        sbM26w.append(0);
        sbM26w.append(", videoFullRangeFlag=");
        sbM26w.append(0);
        sbM26w.append(", colourPrimaries=");
        sbM26w.append(0);
        sbM26w.append(", transferCharacteristics=");
        sbM26w.append(0);
        sbM26w.append(", matrixCoefficients=");
        sbM26w.append(0);
        sbM26w.append(", codecIntializationData=");
        sbM26w.append(Arrays.toString((byte[]) null));
        sbM26w.append('}');
        return sbM26w.toString();
    }
}
