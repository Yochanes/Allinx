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
public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59026j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59027n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59028o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59029p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59030q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59031r;

    static {
        Factory factory = new Factory(AbstractSampleEncryptionBox.class, "AbstractSampleEncryptionBox.java");
        f59026j = factory.m21739e(factory.m21738d("getOffsetToFirstIV", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "", "", "", "int"));
        f59027n = factory.m21739e(factory.m21738d("getEntries", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "", "", "", "java.util.List"));
        f59028o = factory.m21739e(factory.m21738d("setEntries", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "java.util.List", "entries", "", "void"));
        f59029p = factory.m21739e(factory.m21738d("equals", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", AttributeType.BOOLEAN));
        f59030q = factory.m21739e(factory.m21738d("hashCode", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "", "", "", "int"));
        f59031r = factory.m21739e(factory.m21738d("getEntrySizes", "org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox", "", "", "", "java.util.List"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        if (mo21834g()) {
            IsoTypeWriter.m21856g(0, byteBuffer);
            byteBuffer.put((byte) (0 & 255));
            byteBuffer.put((byte[]) null);
        }
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        if (mo21834g()) {
            throw null;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        AbstractC0000a.m29z(Factory.m21737c(f59029p, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals((byte[]) null, (byte[]) null);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo21834g() {
        return (this.f59264f & 1) > 0;
    }

    public final int hashCode() {
        AbstractC0000a.m29z(Factory.m21736b(f59030q, this, this));
        return ((Arrays.hashCode((byte[]) null) + (((0 * 31) + 0) * 31)) * 31) + 0;
    }
}
