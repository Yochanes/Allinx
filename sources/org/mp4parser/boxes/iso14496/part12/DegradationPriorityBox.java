package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DegradationPriorityBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58580j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58581n;

    static {
        Factory factory = new Factory(DegradationPriorityBox.class, "DegradationPriorityBox.java");
        f58580j = factory.m21739e(factory.m21738d("getPriorities", "org.mp4parser.boxes.iso14496.part12.DegradationPriorityBox", "", "", "", "[I"));
        f58581n = factory.m21739e(factory.m21738d("setPriorities", "org.mp4parser.boxes.iso14496.part12.DegradationPriorityBox", "[I", "priorities", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }
}
