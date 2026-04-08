package org.mp4parser.boxes.threegpp.ts26244;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class RecordingYearBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59205j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59206n;

    static {
        Factory factory = new Factory(RecordingYearBox.class, "RecordingYearBox.java");
        f59205j = factory.m21739e(factory.m21738d("getRecordingYear", "org.mp4parser.boxes.threegpp.ts26244.RecordingYearBox", "", "", "", "int"));
        f59206n = factory.m21739e(factory.m21738d("setRecordingYear", "org.mp4parser.boxes.threegpp.ts26244.RecordingYearBox", "int", "recordingYear", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 6L;
    }
}
