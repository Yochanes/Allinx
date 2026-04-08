package org.mp4parser.boxes.webm;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SMPTE2086MasteringDisplayMetadataBox extends AbstractFullBox {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ JoinPoint.StaticPart f59218A;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ JoinPoint.StaticPart f59219B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ JoinPoint.StaticPart f59220C;

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ JoinPoint.StaticPart f59221D;

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ JoinPoint.StaticPart f59222E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ JoinPoint.StaticPart f59223F;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59224j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59225n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59226o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59227p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59228q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59229r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f59230s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f59231t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f59232u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f59233v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f59234w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f59235x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f59236y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f59237z;

    static {
        Factory factory = new Factory(SMPTE2086MasteringDisplayMetadataBox.class, "SMPTE2086MasteringDisplayMetadataBox.java");
        f59224j = factory.m21739e(factory.m21738d("getPrimaryRChromaticity_x", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "", "", "", "int"));
        f59225n = factory.m21739e(factory.m21738d("setPrimaryRChromaticity_x", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "int", "primaryRChromaticity_x", "", "void"));
        f59234w = factory.m21739e(factory.m21738d("getPrimaryBChromaticity_y", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "", "", "", "int"));
        f59235x = factory.m21739e(factory.m21738d("setPrimaryBChromaticity_y", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "int", "primaryBChromaticity_y", "", "void"));
        f59236y = factory.m21739e(factory.m21738d("getWhitePointChromaticity_x", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "", "", "", "int"));
        f59237z = factory.m21739e(factory.m21738d("setWhitePointChromaticity_x", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "int", "whitePointChromaticity_x", "", "void"));
        f59218A = factory.m21739e(factory.m21738d("getWhitePointChromaticity_y", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "", "", "", "int"));
        f59219B = factory.m21739e(factory.m21738d("setWhitePointChromaticity_y", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "int", "whitePointChromaticity_y", "", "void"));
        f59220C = factory.m21739e(factory.m21738d("getLuminanceMax", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "", "", "", "long"));
        f59221D = factory.m21739e(factory.m21738d("setLuminanceMax", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "long", "luminanceMax", "", "void"));
        f59222E = factory.m21739e(factory.m21738d("getLuminanceMin", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "", "", "", "long"));
        f59223F = factory.m21739e(factory.m21738d("setLuminanceMin", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "long", "luminanceMin", "", "void"));
        f59226o = factory.m21739e(factory.m21738d("getPrimaryRChromaticity_y", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "", "", "", "int"));
        f59227p = factory.m21739e(factory.m21738d("setPrimaryRChromaticity_y", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "int", "primaryRChromaticity_y", "", "void"));
        f59228q = factory.m21739e(factory.m21738d("getPrimaryGChromaticity_x", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "", "", "", "int"));
        f59229r = factory.m21739e(factory.m21738d("setPrimaryGChromaticity_x", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "int", "primaryGChromaticity_x", "", "void"));
        f59230s = factory.m21739e(factory.m21738d("getPrimaryGChromaticity_y", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "", "", "", "int"));
        f59231t = factory.m21739e(factory.m21738d("setPrimaryGChromaticity_y", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "int", "primaryGChromaticity_y", "", "void"));
        f59232u = factory.m21739e(factory.m21738d("getPrimaryBChromaticity_x", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "", "", "", "int"));
        f59233v = factory.m21739e(factory.m21738d("setPrimaryBChromaticity_x", "org.mp4parser.boxes.webm.SMPTE2086MasteringDisplayMetadataBox", "int", "primaryBChromaticity_x", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 28L;
    }
}
