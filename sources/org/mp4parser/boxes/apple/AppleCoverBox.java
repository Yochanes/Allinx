package org.mp4parser.boxes.apple;

import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AppleCoverBox extends AppleDataBox {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58267o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58268p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58269q;

    static {
        Factory factory = new Factory(AppleCoverBox.class, "AppleCoverBox.java");
        f58267o = factory.m21739e(factory.m21738d("getCoverData", "org.mp4parser.boxes.apple.AppleCoverBox", "", "", "", "[B"));
        f58268p = factory.m21739e(factory.m21738d("setJpg", "org.mp4parser.boxes.apple.AppleCoverBox", "[B", "data", "", "void"));
        f58269q = factory.m21739e(factory.m21738d("setPng", "org.mp4parser.boxes.apple.AppleCoverBox", "[B", "data", "", "void"));
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    /* JADX INFO: renamed from: d */
    public final int mo21822d() {
        throw null;
    }

    @Override // org.mp4parser.boxes.apple.AppleDataBox
    /* JADX INFO: renamed from: e */
    public final byte[] mo21823e() {
        return null;
    }
}
