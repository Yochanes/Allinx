package org.mp4parser.boxes.dolby;

import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DoViConfigurationBox extends AbstractBox {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ JoinPoint.StaticPart f58479A;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ JoinPoint.StaticPart f58480B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ JoinPoint.StaticPart f58481C;

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ JoinPoint.StaticPart f58482D;

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ JoinPoint.StaticPart f58483E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ JoinPoint.StaticPart f58484F;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58485d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58486f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58487g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58488i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58489j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58490n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58491o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58492p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58493q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58494r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58495s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58496t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58497u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58498v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58499w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58500x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f58501y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f58502z;

    static {
        Factory factory = new Factory(DoViConfigurationBox.class, "DoViConfigurationBox.java");
        f58485d = factory.m21739e(factory.m21738d("getDvVersionMajor", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "int"));
        f58486f = factory.m21739e(factory.m21738d("setDvVersionMajor", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "int", "dvVersionMajor", "", "void"));
        f58495s = factory.m21739e(factory.m21738d("isElPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", AttributeType.BOOLEAN));
        f58496t = factory.m21739e(factory.m21738d("setElPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", AttributeType.BOOLEAN, "elPresentFlag", "", "void"));
        f58497u = factory.m21739e(factory.m21738d("isBlPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", AttributeType.BOOLEAN));
        f58498v = factory.m21739e(factory.m21738d("setBlPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", AttributeType.BOOLEAN, "blPresentFlag", "", "void"));
        f58499w = factory.m21739e(factory.m21738d("getReserved1", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"));
        f58500x = factory.m21739e(factory.m21738d("setReserved1", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved1", "", "void"));
        f58501y = factory.m21739e(factory.m21738d("getReserved2", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"));
        f58502z = factory.m21739e(factory.m21738d("setReserved2", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved2", "", "void"));
        f58479A = factory.m21739e(factory.m21738d("getReserved3", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"));
        f58480B = factory.m21739e(factory.m21738d("setReserved3", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved3", "", "void"));
        f58487g = factory.m21739e(factory.m21738d("getDvVersionMinor", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "int"));
        f58481C = factory.m21739e(factory.m21738d("getReserved4", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"));
        f58482D = factory.m21739e(factory.m21738d("setReserved4", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved4", "", "void"));
        f58483E = factory.m21739e(factory.m21738d("getReserved5", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "long"));
        f58484F = factory.m21739e(factory.m21738d("setReserved5", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "long", "reserved5", "", "void"));
        f58488i = factory.m21739e(factory.m21738d("setDvVersionMinor", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "int", "dvVersionMinor", "", "void"));
        f58489j = factory.m21739e(factory.m21738d("getDvProfile", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "int"));
        f58490n = factory.m21739e(factory.m21738d("setDvProfile", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "int", "dvProfile", "", "void"));
        f58491o = factory.m21739e(factory.m21738d("getDvLevel", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", "int"));
        f58492p = factory.m21739e(factory.m21738d("setDvLevel", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "int", "dvLevel", "", "void"));
        f58493q = factory.m21739e(factory.m21738d("isRpuPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", "", "", "", AttributeType.BOOLEAN));
        f58494r = factory.m21739e(factory.m21738d("setRpuPresentFlag", "org.mp4parser.boxes.dolby.DoViConfigurationBox", AttributeType.BOOLEAN, "rpuPresentFlag", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        IsoTypeWriter.m21857h(0, byteBuffer);
        byteBuffer.put((byte) (0 & 255));
        IsoTypeWriter.m21854e(((0 & 127) << 9) + ((0 & 63) << 3) + 0 + 0 + 0, byteBuffer);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 24L;
    }
}
