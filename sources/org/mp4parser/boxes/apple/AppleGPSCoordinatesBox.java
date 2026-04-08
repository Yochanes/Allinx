package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.tools.Utf8;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AppleGPSCoordinatesBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58284d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58285f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58286g;

    static {
        Factory factory = new Factory(AppleGPSCoordinatesBox.class, "AppleGPSCoordinatesBox.java");
        f58284d = factory.m21739e(factory.m21738d("getValue", "org.mp4parser.boxes.apple.AppleGPSCoordinatesBox", "", "", "", "java.lang.String"));
        f58285f = factory.m21739e(factory.m21738d("setValue", "org.mp4parser.boxes.apple.AppleGPSCoordinatesBox", "java.lang.String", "iso6709String", "", "void"));
        f58286g = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.apple.AppleGPSCoordinatesBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return Utf8.m21861b(null) + 4;
    }

    public final String toString() {
        return AbstractC0000a.m19p(AbstractC0000a.m26w(Factory.m21736b(f58286g, this, this), "AppleGPSCoordinatesBox["), null, "]");
    }
}
