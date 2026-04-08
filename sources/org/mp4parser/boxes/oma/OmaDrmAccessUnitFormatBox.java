package org.mp4parser.boxes.oma;

import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class OmaDrmAccessUnitFormatBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59093j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59094n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59095o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59096p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59097q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59098r;

    static {
        Factory factory = new Factory(OmaDrmAccessUnitFormatBox.class, "OmaDrmAccessUnitFormatBox.java");
        f59093j = factory.m21739e(factory.m21738d("isSelectiveEncryption", "org.mp4parser.boxes.oma.OmaDrmAccessUnitFormatBox", "", "", "", AttributeType.BOOLEAN));
        f59094n = factory.m21739e(factory.m21738d("getKeyIndicatorLength", "org.mp4parser.boxes.oma.OmaDrmAccessUnitFormatBox", "", "", "", "int"));
        f59095o = factory.m21739e(factory.m21738d("setKeyIndicatorLength", "org.mp4parser.boxes.oma.OmaDrmAccessUnitFormatBox", "int", "keyIndicatorLength", "", "void"));
        f59096p = factory.m21739e(factory.m21738d("getInitVectorLength", "org.mp4parser.boxes.oma.OmaDrmAccessUnitFormatBox", "", "", "", "int"));
        f59097q = factory.m21739e(factory.m21738d("setInitVectorLength", "org.mp4parser.boxes.oma.OmaDrmAccessUnitFormatBox", "int", "initVectorLength", "", "void"));
        f59098r = factory.m21739e(factory.m21738d("setAllBits", "org.mp4parser.boxes.oma.OmaDrmAccessUnitFormatBox", "byte", "allBits", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.put((byte) (0 & 255));
        byteBuffer.put((byte) (0 & 255));
        byteBuffer.put((byte) (0 & 255));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 7L;
    }
}
