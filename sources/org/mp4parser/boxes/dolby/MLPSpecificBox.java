package org.mp4parser.boxes.dolby;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso14496.part1.objectdescriptors.BitWriterBuffer;
import org.mp4parser.support.AbstractBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class MLPSpecificBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58512d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58513f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58514g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58515i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58516j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58517n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58518o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58519p;

    static {
        Factory factory = new Factory(MLPSpecificBox.class, "MLPSpecificBox.java");
        f58512d = factory.m21739e(factory.m21738d("getFormat_info", "org.mp4parser.boxes.dolby.MLPSpecificBox", "", "", "", "int"));
        f58513f = factory.m21739e(factory.m21738d("setFormat_info", "org.mp4parser.boxes.dolby.MLPSpecificBox", "int", "format_info", "", "void"));
        f58514g = factory.m21739e(factory.m21738d("getPeak_data_rate", "org.mp4parser.boxes.dolby.MLPSpecificBox", "", "", "", "int"));
        f58515i = factory.m21739e(factory.m21738d("setPeak_data_rate", "org.mp4parser.boxes.dolby.MLPSpecificBox", "int", "peak_data_rate", "", "void"));
        f58516j = factory.m21739e(factory.m21738d("getReserved", "org.mp4parser.boxes.dolby.MLPSpecificBox", "", "", "", "int"));
        f58517n = factory.m21739e(factory.m21738d("setReserved", "org.mp4parser.boxes.dolby.MLPSpecificBox", "int", "reserved", "", "void"));
        f58518o = factory.m21739e(factory.m21738d("getReserved2", "org.mp4parser.boxes.dolby.MLPSpecificBox", "", "", "", "int"));
        f58519p = factory.m21739e(factory.m21738d("setReserved2", "org.mp4parser.boxes.dolby.MLPSpecificBox", "int", "reserved2", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.m21829a(0, 32);
        bitWriterBuffer.m21829a(0, 15);
        bitWriterBuffer.m21829a(0, 1);
        bitWriterBuffer.m21829a(0, 32);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 10L;
    }
}
