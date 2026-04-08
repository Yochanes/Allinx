package org.mp4parser.boxes.dolby;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitWriterBuffer;
import org.mp4parser.support.AbstractBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DTSSpecificBox extends AbstractBox {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ JoinPoint.StaticPart f58447A;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ JoinPoint.StaticPart f58448B;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ JoinPoint.StaticPart f58449C;

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ JoinPoint.StaticPart f58450D;

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ JoinPoint.StaticPart f58451E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ JoinPoint.StaticPart f58452F;

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ JoinPoint.StaticPart f58453G;

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ JoinPoint.StaticPart f58454H;

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ JoinPoint.StaticPart f58455I;

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ JoinPoint.StaticPart f58456J;

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ JoinPoint.StaticPart f58457K;

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ JoinPoint.StaticPart f58458L;

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ JoinPoint.StaticPart f58459M;

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ JoinPoint.StaticPart f58460N;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58461d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58462f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58463g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58464i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58465j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58466n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58467o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58468p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58469q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58470r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58471s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58472t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58473u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58474v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58475w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58476x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f58477y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f58478z;

    static {
        Factory factory = new Factory(DTSSpecificBox.class, "DTSSpecificBox.java");
        f58461d = factory.m21739e(factory.m21738d("getAvgBitRate", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "long"));
        f58462f = factory.m21739e(factory.m21738d("setAvgBitRate", "org.mp4parser.boxes.dolby.DTSSpecificBox", "long", "avgBitRate", "", "void"));
        f58471s = factory.m21739e(factory.m21738d("getStreamConstruction", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"));
        f58472t = factory.m21739e(factory.m21738d("setStreamConstruction", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "streamConstruction", "", "void"));
        f58473u = factory.m21739e(factory.m21738d("getCoreLFEPresent", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"));
        f58474v = factory.m21739e(factory.m21738d("setCoreLFEPresent", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "coreLFEPresent", "", "void"));
        f58475w = factory.m21739e(factory.m21738d("getCoreLayout", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"));
        f58476x = factory.m21739e(factory.m21738d("setCoreLayout", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "coreLayout", "", "void"));
        f58477y = factory.m21739e(factory.m21738d("getCoreSize", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"));
        f58478z = factory.m21739e(factory.m21738d("setCoreSize", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "coreSize", "", "void"));
        f58447A = factory.m21739e(factory.m21738d("getStereoDownmix", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"));
        f58448B = factory.m21739e(factory.m21738d("setStereoDownmix", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "stereoDownmix", "", "void"));
        f58463g = factory.m21739e(factory.m21738d("getDTSSamplingFrequency", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "long"));
        f58449C = factory.m21739e(factory.m21738d("getRepresentationType", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"));
        f58450D = factory.m21739e(factory.m21738d("setRepresentationType", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "representationType", "", "void"));
        f58451E = factory.m21739e(factory.m21738d("getChannelLayout", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"));
        f58452F = factory.m21739e(factory.m21738d("setChannelLayout", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "channelLayout", "", "void"));
        f58453G = factory.m21739e(factory.m21738d("getMultiAssetFlag", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"));
        f58454H = factory.m21739e(factory.m21738d("setMultiAssetFlag", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "multiAssetFlag", "", "void"));
        f58455I = factory.m21739e(factory.m21738d("getLBRDurationMod", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"));
        f58456J = factory.m21739e(factory.m21738d("setLBRDurationMod", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "LBRDurationMod", "", "void"));
        f58457K = factory.m21739e(factory.m21738d("getReserved", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"));
        f58458L = factory.m21739e(factory.m21738d("setReserved", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "reserved", "", "void"));
        f58464i = factory.m21739e(factory.m21738d("setDTSSamplingFrequency", "org.mp4parser.boxes.dolby.DTSSpecificBox", "long", "DTSSamplingFrequency", "", "void"));
        f58459M = factory.m21739e(factory.m21738d("getReservedBoxPresent", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"));
        f58460N = factory.m21739e(factory.m21738d("setReservedBoxPresent", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "reservedBoxPresent", "", "void"));
        f58465j = factory.m21739e(factory.m21738d("getMaxBitRate", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "long"));
        f58466n = factory.m21739e(factory.m21738d("setMaxBitRate", "org.mp4parser.boxes.dolby.DTSSpecificBox", "long", "maxBitRate", "", "void"));
        f58467o = factory.m21739e(factory.m21738d("getPcmSampleDepth", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"));
        f58468p = factory.m21739e(factory.m21738d("setPcmSampleDepth", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "pcmSampleDepth", "", "void"));
        f58469q = factory.m21739e(factory.m21738d("getFrameDuration", "org.mp4parser.boxes.dolby.DTSSpecificBox", "", "", "", "int"));
        f58470r = factory.m21739e(factory.m21738d("setFrameDuration", "org.mp4parser.boxes.dolby.DTSSpecificBox", "int", "frameDuration", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.putInt((int) 0);
        byteBuffer.put((byte) (0 & 255));
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.m21829a(0, 2);
        bitWriterBuffer.m21829a(0, 5);
        bitWriterBuffer.m21829a(0, 1);
        bitWriterBuffer.m21829a(0, 6);
        bitWriterBuffer.m21829a(0, 14);
        bitWriterBuffer.m21829a(0, 1);
        bitWriterBuffer.m21829a(0, 3);
        bitWriterBuffer.m21829a(0, 16);
        bitWriterBuffer.m21829a(0, 1);
        bitWriterBuffer.m21829a(0, 1);
        bitWriterBuffer.m21829a(0, 1);
        bitWriterBuffer.m21829a(0, 5);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 20L;
    }
}
