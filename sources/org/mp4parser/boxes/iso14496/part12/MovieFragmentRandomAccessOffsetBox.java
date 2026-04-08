package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class MovieFragmentRandomAccessOffsetBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58650j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58651n;

    static {
        Factory factory = new Factory(MovieFragmentRandomAccessOffsetBox.class, "MovieFragmentRandomAccessOffsetBox.java");
        f58650j = factory.m21739e(factory.m21738d("getMfraSize", "org.mp4parser.boxes.iso14496.part12.MovieFragmentRandomAccessOffsetBox", "", "", "", "long"));
        f58651n = factory.m21739e(factory.m21738d("setMfraSize", "org.mp4parser.boxes.iso14496.part12.MovieFragmentRandomAccessOffsetBox", "long", "mfraSize", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.putInt((int) 0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 8L;
    }
}
