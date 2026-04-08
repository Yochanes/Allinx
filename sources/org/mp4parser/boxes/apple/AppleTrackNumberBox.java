package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AppleTrackNumberBox extends AppleDataBox {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58311o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58312p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58313q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58314r;

    static {
        Factory factory = new Factory(AppleTrackNumberBox.class, "AppleTrackNumberBox.java");
        f58311o = factory.m21739e(factory.m21738d("getA", "org.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", "int"));
        f58312p = factory.m21739e(factory.m21738d("setA", "org.mp4parser.boxes.apple.AppleTrackNumberBox", "int", "a", "", "void"));
        f58313q = factory.m21739e(factory.m21738d("getB", "org.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", "int"));
        f58314r = factory.m21739e(factory.m21738d("setB", "org.mp4parser.boxes.apple.AppleTrackNumberBox", "int", "b", "", "void"));
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    /* JADX INFO: renamed from: d */
    public final int mo21822d() {
        return 8;
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    /* JADX INFO: renamed from: e */
    public final byte[] mo21823e() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        return byteBufferAllocate.array();
    }
}
