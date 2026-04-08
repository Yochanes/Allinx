package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class MovieExtendsHeaderBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58645j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58646n;

    static {
        Factory factory = new Factory(MovieExtendsHeaderBox.class, "MovieExtendsHeaderBox.java");
        f58645j = factory.m21739e(factory.m21738d("getFragmentDuration", "org.mp4parser.boxes.iso14496.part12.MovieExtendsHeaderBox", "", "", "", "long"));
        f58646n = factory.m21739e(factory.m21738d("setFragmentDuration", "org.mp4parser.boxes.iso14496.part12.MovieExtendsHeaderBox", "long", "fragmentDuration", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        if (this.f59263d == 1) {
            byteBuffer.putLong(0L);
        } else {
            byteBuffer.putInt((int) 0);
        }
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return this.f59263d == 1 ? 12 : 8;
    }
}
