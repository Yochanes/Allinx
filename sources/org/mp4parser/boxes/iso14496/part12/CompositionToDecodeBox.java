package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class CompositionToDecodeBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58566j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58567n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58568o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58569p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58570q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58571r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58572s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58573t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58574u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58575v;

    static {
        Factory factory = new Factory(CompositionToDecodeBox.class, "CompositionToDecodeBox.java");
        f58566j = factory.m21739e(factory.m21738d("getCompositionOffsetToDisplayOffsetShift", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"));
        f58567n = factory.m21739e(factory.m21738d("setCompositionOffsetToDisplayOffsetShift", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "compositionOffsetToDisplayOffsetShift", "", "void"));
        f58568o = factory.m21739e(factory.m21738d("getLeastDisplayOffset", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"));
        f58569p = factory.m21739e(factory.m21738d("setLeastDisplayOffset", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "leastDisplayOffset", "", "void"));
        f58570q = factory.m21739e(factory.m21738d("getGreatestDisplayOffset", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"));
        f58571r = factory.m21739e(factory.m21738d("setGreatestDisplayOffset", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "greatestDisplayOffset", "", "void"));
        f58572s = factory.m21739e(factory.m21738d("getDisplayStartTime", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"));
        f58573t = factory.m21739e(factory.m21738d("setDisplayStartTime", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "displayStartTime", "", "void"));
        f58574u = factory.m21739e(factory.m21738d("getDisplayEndTime", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "", "", "", "int"));
        f58575v = factory.m21739e(factory.m21738d("setDisplayEndTime", "org.mp4parser.boxes.iso14496.part12.CompositionToDecodeBox", "int", "displayEndTime", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 24L;
    }
}
