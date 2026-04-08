package org.mp4parser.boxes.iso23001.part7;

import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.IsoTypeWriter;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractTrackEncryptionBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59032j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59033n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59034o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59035p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59036q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59037r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f59038s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f59039t;

    static {
        Factory factory = new Factory(AbstractTrackEncryptionBox.class, "AbstractTrackEncryptionBox.java");
        f59032j = factory.m21739e(factory.m21738d("getDefaultAlgorithmId", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "", "", "", "int"));
        f59033n = factory.m21739e(factory.m21738d("setDefaultAlgorithmId", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "int", "defaultAlgorithmId", "", "void"));
        f59034o = factory.m21739e(factory.m21738d("getDefaultIvSize", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "", "", "", "int"));
        f59035p = factory.m21739e(factory.m21738d("setDefaultIvSize", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "int", "defaultIvSize", "", "void"));
        f59036q = factory.m21739e(factory.m21738d("getDefault_KID", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "", "", "", "java.util.UUID"));
        f59037r = factory.m21739e(factory.m21738d("setDefault_KID", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "java.util.UUID", "uuid", "", "void"));
        f59038s = factory.m21739e(factory.m21738d("equals", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "java.lang.Object", "o", "", AttributeType.BOOLEAN));
        f59039t = factory.m21739e(factory.m21738d("hashCode", "org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox", "", "", "", "int"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        IsoTypeWriter.m21856g(0, byteBuffer);
        byteBuffer.put((byte) (0 & 255));
        byteBuffer.put((byte[]) null);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 24L;
    }

    public final boolean equals(Object obj) {
        AbstractC0000a.m29z(Factory.m21737c(f59038s, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals((byte[]) null, (byte[]) null);
    }

    public final int hashCode() {
        AbstractC0000a.m29z(Factory.m21736b(f59039t, this, this));
        return Arrays.hashCode((byte[]) null) + (((0 * 31) + 0) * 31);
    }
}
