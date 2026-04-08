package org.mp4parser.boxes.iso14496.part15;

import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitWriterBuffer;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.tools.IsoTypeWriter;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AvcConfigurationBox extends AbstractBox {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ JoinPoint.StaticPart f58912A;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ JoinPoint.StaticPart f58913B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ JoinPoint.StaticPart f58914C;

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ JoinPoint.StaticPart f58915D;

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ JoinPoint.StaticPart f58916E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ JoinPoint.StaticPart f58917F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ JoinPoint.StaticPart f58918G;

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ JoinPoint.StaticPart f58919H;

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ JoinPoint.StaticPart f58920I;

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ JoinPoint.StaticPart f58921J;

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ JoinPoint.StaticPart f58922K;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58923f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58924g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58925i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58926j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58927n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58928o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58929p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58930q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58931r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58932s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58933t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58934u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58935v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58936w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58937x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f58938y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f58939z;

    /* JADX INFO: renamed from: d */
    public AvcDecoderConfigurationRecord f58940d;

    static {
        Factory factory = new Factory(AvcConfigurationBox.class, "AvcConfigurationBox.java");
        f58923f = factory.m21739e(factory.m21738d("getConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        f58924g = factory.m21739e(factory.m21738d("setConfigurationVersion", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"));
        f58933t = factory.m21739e(factory.m21738d("getSequenceParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"));
        f58934u = factory.m21739e(factory.m21738d("setSequenceParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"));
        f58935v = factory.m21739e(factory.m21738d("getPictureParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"));
        f58936w = factory.m21739e(factory.m21738d("setPictureParameterSets", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"));
        f58937x = factory.m21739e(factory.m21738d("getChromaFormat", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        f58938y = factory.m21739e(factory.m21738d("setChromaFormat", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"));
        f58939z = factory.m21739e(factory.m21738d("getBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        f58912A = factory.m21739e(factory.m21738d("setBitDepthLumaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"));
        f58913B = factory.m21739e(factory.m21738d("getBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        f58914C = factory.m21739e(factory.m21738d("setBitDepthChromaMinus8", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"));
        f58925i = factory.m21739e(factory.m21738d("getAvcProfileIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        f58915D = factory.m21739e(factory.m21738d("getSequenceParameterSetExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"));
        f58916E = factory.m21739e(factory.m21738d("setSequenceParameterSetExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"));
        f58917F = factory.m21739e(factory.m21738d("hasExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", AttributeType.BOOLEAN));
        f58918G = factory.m21739e(factory.m21738d("setHasExts", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", AttributeType.BOOLEAN, "hasExts", "", "void"));
        f58919H = factory.m21739e(factory.m21738d("getContentSize", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "long"));
        f58920I = factory.m21739e(factory.m21738d("getContent", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"));
        f58921J = factory.m21739e(factory.m21738d("getavcDecoderConfigurationRecord", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "org.mp4parser.boxes.iso14496.part15.AvcDecoderConfigurationRecord"));
        f58922K = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"));
        f58926j = factory.m21739e(factory.m21738d("setAvcProfileIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"));
        f58927n = factory.m21739e(factory.m21738d("getProfileCompatibility", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        f58928o = factory.m21739e(factory.m21738d("setProfileCompatibility", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"));
        f58929p = factory.m21739e(factory.m21738d("getAvcLevelIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        f58930q = factory.m21739e(factory.m21738d("setAvcLevelIndication", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"));
        f58931r = factory.m21739e(factory.m21738d("getLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "", "", "", "int"));
        f58932s = factory.m21739e(factory.m21738d("setLengthSizeMinusOne", "org.mp4parser.boxes.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        AbstractC0000a.m29z(Factory.m21737c(f58920I, this, this, byteBuffer));
        AvcDecoderConfigurationRecord avcDecoderConfigurationRecord = this.f58940d;
        IsoTypeWriter.m21857h(avcDecoderConfigurationRecord.f58941a, byteBuffer);
        byteBuffer.put((byte) (avcDecoderConfigurationRecord.f58942b & 255));
        byteBuffer.put((byte) (avcDecoderConfigurationRecord.f58943c & 255));
        byteBuffer.put((byte) (avcDecoderConfigurationRecord.f58944d & 255));
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.m21829a(avcDecoderConfigurationRecord.f58953m, 6);
        bitWriterBuffer.m21829a(avcDecoderConfigurationRecord.f58945e, 2);
        bitWriterBuffer.m21829a(avcDecoderConfigurationRecord.f58954n, 3);
        bitWriterBuffer.m21829a(avcDecoderConfigurationRecord.f58946f.size(), 5);
        for (ByteBuffer byteBuffer2 : avcDecoderConfigurationRecord.f58946f) {
            IsoTypeWriter.m21854e(byteBuffer2.limit(), byteBuffer);
            byteBuffer.put((ByteBuffer) byteBuffer2.rewind());
        }
        byteBuffer.put((byte) (avcDecoderConfigurationRecord.f58947g.size() & 255));
        for (ByteBuffer byteBuffer3 : avcDecoderConfigurationRecord.f58947g) {
            IsoTypeWriter.m21854e(byteBuffer3.limit(), byteBuffer);
            byteBuffer.put((ByteBuffer) byteBuffer3.rewind());
        }
        if (avcDecoderConfigurationRecord.f58948h) {
            int i = avcDecoderConfigurationRecord.f58942b;
            if (i == 100 || i == 110 || i == 122 || i == 144) {
                BitWriterBuffer bitWriterBuffer2 = new BitWriterBuffer(byteBuffer);
                bitWriterBuffer2.m21829a(avcDecoderConfigurationRecord.f58955o, 6);
                bitWriterBuffer2.m21829a(avcDecoderConfigurationRecord.f58949i, 2);
                bitWriterBuffer2.m21829a(avcDecoderConfigurationRecord.f58956p, 5);
                bitWriterBuffer2.m21829a(avcDecoderConfigurationRecord.f58950j, 3);
                bitWriterBuffer2.m21829a(avcDecoderConfigurationRecord.f58957q, 5);
                bitWriterBuffer2.m21829a(avcDecoderConfigurationRecord.f58951k, 3);
                for (ByteBuffer byteBuffer4 : avcDecoderConfigurationRecord.f58952l) {
                    IsoTypeWriter.m21854e(byteBuffer4.limit(), byteBuffer);
                    byteBuffer.put((ByteBuffer) byteBuffer4.reset());
                }
            }
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        int i;
        AbstractC0000a.m29z(Factory.m21736b(f58919H, this, this));
        AvcDecoderConfigurationRecord avcDecoderConfigurationRecord = this.f58940d;
        Iterator it = avcDecoderConfigurationRecord.f58946f.iterator();
        long jLimit = 6;
        while (it.hasNext()) {
            jLimit = jLimit + 2 + ((long) ((ByteBuffer) it.next()).limit());
        }
        long jLimit2 = jLimit + 1;
        Iterator it2 = avcDecoderConfigurationRecord.f58947g.iterator();
        while (it2.hasNext()) {
            jLimit2 = jLimit2 + 2 + ((long) ((ByteBuffer) it2.next()).limit());
        }
        if (avcDecoderConfigurationRecord.f58948h && ((i = avcDecoderConfigurationRecord.f58942b) == 100 || i == 110 || i == 122 || i == 144)) {
            jLimit2 += 4;
            Iterator it3 = avcDecoderConfigurationRecord.f58952l.iterator();
            while (it3.hasNext()) {
                jLimit2 = jLimit2 + 2 + ((long) ((ByteBuffer) it3.next()).limit());
            }
        }
        return jLimit2;
    }

    /* JADX INFO: renamed from: d */
    public final void m21833d(int i) {
        AbstractC0000a.m29z(Factory.m21737c(f58930q, this, this, Integer.valueOf(i)));
        this.f58940d.f58944d = i;
    }

    public final String toString() {
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58922K, this, this), "AvcConfigurationBox{avcDecoderConfigurationRecord=");
        sbM26w.append(this.f58940d);
        sbM26w.append('}');
        return sbM26w.toString();
    }
}
