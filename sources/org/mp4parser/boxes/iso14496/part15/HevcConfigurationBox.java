package org.mp4parser.boxes.iso14496.part15;

import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class HevcConfigurationBox extends AbstractBox {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ JoinPoint.StaticPart f58958A;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ JoinPoint.StaticPart f58959B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ JoinPoint.StaticPart f58960C;

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ JoinPoint.StaticPart f58961D;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58962d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58963f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58964g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58965i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58966j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58967n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58968o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58969p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58970q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58971r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58972s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58973t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58974u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58975v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58976w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58977x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f58978y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f58979z;

    static {
        Factory factory = new Factory(HevcConfigurationBox.class, "HevcConfigurationBox.java");
        f58962d = factory.m21739e(factory.m21738d("getHevcDecoderConfigurationRecord", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "org.mp4parser.boxes.iso14496.part15.HevcDecoderConfigurationRecord"));
        f58963f = factory.m21739e(factory.m21738d("setHevcDecoderConfigurationRecord", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "org.mp4parser.boxes.iso14496.part15.HevcDecoderConfigurationRecord", "hevcDecoderConfigurationRecord", "", "void"));
        f58972s = factory.m21739e(factory.m21738d("getGeneral_level_idc", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58973t = factory.m21739e(factory.m21738d("getMin_spatial_segmentation_idc", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58974u = factory.m21739e(factory.m21738d("getParallelismType", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58975v = factory.m21739e(factory.m21738d("getChromaFormat", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58976w = factory.m21739e(factory.m21738d("getBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58977x = factory.m21739e(factory.m21738d("getBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58978y = factory.m21739e(factory.m21738d("getAvgFrameRate", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58979z = factory.m21739e(factory.m21738d("getNumTemporalLayers", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58958A = factory.m21739e(factory.m21738d("getLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58959B = factory.m21739e(factory.m21738d("isTemporalIdNested", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", AttributeType.BOOLEAN));
        f58964g = factory.m21739e(factory.m21738d("equals", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "java.lang.Object", "o", "", AttributeType.BOOLEAN));
        f58960C = factory.m21739e(factory.m21738d("getConstantFrameRate", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58961D = factory.m21739e(factory.m21738d("getArrays", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "java.util.List"));
        f58965i = factory.m21739e(factory.m21738d("hashCode", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58966j = factory.m21739e(factory.m21738d("getConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58967n = factory.m21739e(factory.m21738d("getGeneral_profile_space", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58968o = factory.m21739e(factory.m21738d("isGeneral_tier_flag", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", AttributeType.BOOLEAN));
        f58969p = factory.m21739e(factory.m21738d("getGeneral_profile_idc", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "int"));
        f58970q = factory.m21739e(factory.m21738d("getGeneral_profile_compatibility_flags", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "long"));
        f58971r = factory.m21739e(factory.m21738d("getGeneral_constraint_indicator_flags", "org.mp4parser.boxes.iso14496.part15.HevcConfigurationBox", "", "", "", "long"));
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

    public final boolean equals(Object obj) {
        AbstractC0000a.m29z(Factory.m21737c(f58964g, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AbstractC0000a.m29z(Factory.m21736b(f58965i, this, this));
        return 0;
    }
}
