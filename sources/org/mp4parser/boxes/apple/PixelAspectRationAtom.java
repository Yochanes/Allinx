package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class PixelAspectRationAtom extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58354d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58355f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58356g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58357i;

    static {
        Factory factory = new Factory(PixelAspectRationAtom.class, "PixelAspectRationAtom.java");
        f58354d = factory.m21739e(factory.m21738d("gethSpacing", "org.mp4parser.boxes.apple.PixelAspectRationAtom", "", "", "", "int"));
        f58355f = factory.m21739e(factory.m21738d("sethSpacing", "org.mp4parser.boxes.apple.PixelAspectRationAtom", "int", "hSpacing", "", "void"));
        f58356g = factory.m21739e(factory.m21738d("getvSpacing", "org.mp4parser.boxes.apple.PixelAspectRationAtom", "", "", "", "int"));
        f58357i = factory.m21739e(factory.m21738d("setvSpacing", "org.mp4parser.boxes.apple.PixelAspectRationAtom", "int", "vSpacing", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 8L;
    }
}
