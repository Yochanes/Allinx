package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class FreeSpaceBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58594d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58595f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58596g;

    static {
        Factory factory = new Factory(FreeSpaceBox.class, "FreeSpaceBox.java");
        f58594d = factory.m21739e(factory.m21738d("getData", "org.mp4parser.boxes.iso14496.part12.FreeSpaceBox", "", "", "", "[B"));
        f58595f = factory.m21739e(factory.m21738d("setData", "org.mp4parser.boxes.iso14496.part12.FreeSpaceBox", "[B", "data", "", "void"));
        f58596g = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.FreeSpaceBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.put((byte[]) null);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }

    public final String toString() {
        AbstractC0000a.m26w(Factory.m21736b(f58596g, this, this), "FreeSpaceBox[size=");
        throw null;
    }
}
