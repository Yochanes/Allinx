package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AppleDiskNumberBox extends AppleDataBox {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58280o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58281p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58282q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58283r;

    static {
        Factory factory = new Factory(AppleDiskNumberBox.class, "AppleDiskNumberBox.java");
        f58280o = factory.m21739e(factory.m21738d("getA", "org.mp4parser.boxes.apple.AppleDiskNumberBox", "", "", "", "int"));
        f58281p = factory.m21739e(factory.m21738d("setA", "org.mp4parser.boxes.apple.AppleDiskNumberBox", "int", "a", "", "void"));
        f58282q = factory.m21739e(factory.m21738d("getB", "org.mp4parser.boxes.apple.AppleDiskNumberBox", "", "", "", "short"));
        f58283r = factory.m21739e(factory.m21738d("setB", "org.mp4parser.boxes.apple.AppleDiskNumberBox", "short", "b", "", "void"));
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    /* JADX INFO: renamed from: d */
    public final int mo21822d() {
        return 6;
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    /* JADX INFO: renamed from: e */
    public final byte[] mo21823e() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        return byteBufferAllocate.array();
    }
}
