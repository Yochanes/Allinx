package org.mp4parser.boxes.apple;

import java.nio.charset.Charset;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.tools.Utf8;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Utf8AppleDataBox extends AppleDataBox {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58396o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58397p;

    static {
        Factory factory = new Factory(Utf8AppleDataBox.class, "Utf8AppleDataBox.java");
        f58396o = factory.m21739e(factory.m21738d("getValue", "org.mp4parser.boxes.apple.Utf8AppleDataBox", "", "", "", "java.lang.String"));
        f58397p = factory.m21739e(factory.m21738d("setValue", "org.mp4parser.boxes.apple.Utf8AppleDataBox", "java.lang.String", "value", "", "void"));
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    /* JADX INFO: renamed from: d */
    public final int mo21822d() {
        Charset.forName("UTF-8");
        throw null;
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    /* JADX INFO: renamed from: e */
    public final byte[] mo21823e() {
        return Utf8.m21860a(null);
    }
}
