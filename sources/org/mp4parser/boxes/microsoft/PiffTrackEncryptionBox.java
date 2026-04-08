package org.mp4parser.boxes.microsoft;

import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class PiffTrackEncryptionBox extends AbstractTrackEncryptionBox {

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f59066u;

    static {
        Factory factory = new Factory(PiffTrackEncryptionBox.class, "PiffTrackEncryptionBox.java");
        f59066u = factory.m21739e(factory.m21738d("getFlags", "org.mp4parser.boxes.microsoft.PiffTrackEncryptionBox", "", "", "", "int"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: c */
    public final byte[] mo21837c() {
        return new byte[]{-119, 116, -37, -50, 123, -25, 76, 81, -124, -7, 113, 72, -7, -120, 37, 84};
    }
}
