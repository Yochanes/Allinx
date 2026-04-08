package org.mp4parser.boxes.microsoft;

import com.google.common.base.Ascii;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class PiffSampleEncryptionBox extends AbstractSampleEncryptionBox {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f59060s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f59061t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f59062u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f59063v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f59064w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f59065x;

    static {
        Factory factory = new Factory(PiffSampleEncryptionBox.class, "PiffSampleEncryptionBox.java");
        f59060s = factory.m21739e(factory.m21738d("getAlgorithmId", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "", "", "", "int"));
        f59061t = factory.m21739e(factory.m21738d("setAlgorithmId", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "int", "algorithmId", "", "void"));
        f59062u = factory.m21739e(factory.m21738d("getIvSize", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "", "", "", "int"));
        f59063v = factory.m21739e(factory.m21738d("setIvSize", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "int", "ivSize", "", "void"));
        f59064w = factory.m21739e(factory.m21738d("getKid", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "", "", "", "[B"));
        f59065x = factory.m21739e(factory.m21738d("setKid", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "[B", "kid", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: c */
    public final byte[] mo21837c() {
        return new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    }

    @Override // org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox
    /* JADX INFO: renamed from: g */
    public final boolean mo21834g() {
        return (this.f59264f & 1) > 0;
    }
}
