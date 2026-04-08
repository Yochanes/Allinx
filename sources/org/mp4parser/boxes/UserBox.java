package org.mp4parser.boxes;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class UserBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58264d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58265f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58266g;

    static {
        Factory factory = new Factory(UserBox.class, "UserBox.java");
        f58264d = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.UserBox", "", "", "", "java.lang.String"));
        f58265f = factory.m21739e(factory.m21738d("getData", "org.mp4parser.boxes.UserBox", "", "", "", "[B"));
        f58266g = factory.m21739e(factory.m21738d("setData", "org.mp4parser.boxes.UserBox", "[B", "data", "", "void"));
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
        StringBuilder sbM26w = AbstractC0000a.m26w(Factory.m21736b(f58264d, this, this), "UserBox[type=");
        sbM26w.append(this.f59258a);
        sbM26w.append(";userType=");
        sbM26w.append(new String((byte[]) null));
        sbM26w.append(";contentLength=");
        throw null;
    }
}
