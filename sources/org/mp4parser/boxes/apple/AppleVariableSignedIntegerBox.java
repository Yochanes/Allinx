package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AppleVariableSignedIntegerBox extends AppleDataBox {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58315o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58316p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58317q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58318r;

    static {
        Factory factory = new Factory(AppleVariableSignedIntegerBox.class, "AppleVariableSignedIntegerBox.java");
        f58315o = factory.m21739e(factory.m21738d("getIntLength", "org.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", "int"));
        f58316p = factory.m21739e(factory.m21738d("setIntLength", "org.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "int", "intLength", "", "void"));
        f58317q = factory.m21739e(factory.m21738d("getValue", "org.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", "long"));
        f58318r = factory.m21739e(factory.m21738d("setValue", "org.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "long", "value", "", "void"));
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    /* JADX INFO: renamed from: d */
    public final int mo21822d() {
        return 0;
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    /* JADX INFO: renamed from: e */
    public final byte[] mo21823e() {
        ByteBuffer.wrap(new byte[0]);
        throw new RuntimeException(AbstractC0000a.m10g(0, "I don't know how to read ", " bytes"));
    }
}
