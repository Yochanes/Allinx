package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class GenericMediaHeaderTextAtom extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58336d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58337f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58338g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58339i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58340j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58341n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58342o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58343p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f58344q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f58345r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f58346s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f58347t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f58348u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ JoinPoint.StaticPart f58349v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ JoinPoint.StaticPart f58350w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ JoinPoint.StaticPart f58351x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ JoinPoint.StaticPart f58352y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ JoinPoint.StaticPart f58353z;

    static {
        Factory factory = new Factory(GenericMediaHeaderTextAtom.class, "GenericMediaHeaderTextAtom.java");
        f58336d = factory.m21739e(factory.m21738d("getUnknown_1", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        f58337f = factory.m21739e(factory.m21738d("setUnknown_1", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_1", "", "void"));
        f58346s = factory.m21739e(factory.m21738d("getUnknown_6", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        f58347t = factory.m21739e(factory.m21738d("setUnknown_6", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_6", "", "void"));
        f58348u = factory.m21739e(factory.m21738d("getUnknown_7", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        f58349v = factory.m21739e(factory.m21738d("setUnknown_7", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_7", "", "void"));
        f58350w = factory.m21739e(factory.m21738d("getUnknown_8", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        f58351x = factory.m21739e(factory.m21738d("setUnknown_8", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_8", "", "void"));
        f58352y = factory.m21739e(factory.m21738d("getUnknown_9", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        f58353z = factory.m21739e(factory.m21738d("setUnknown_9", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_9", "", "void"));
        f58338g = factory.m21739e(factory.m21738d("getUnknown_2", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        f58339i = factory.m21739e(factory.m21738d("setUnknown_2", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_2", "", "void"));
        f58340j = factory.m21739e(factory.m21738d("getUnknown_3", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        f58341n = factory.m21739e(factory.m21738d("setUnknown_3", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_3", "", "void"));
        f58342o = factory.m21739e(factory.m21738d("getUnknown_4", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        f58343p = factory.m21739e(factory.m21738d("setUnknown_4", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_4", "", "void"));
        f58344q = factory.m21739e(factory.m21738d("getUnknown_5", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "", "", "", "int"));
        f58345r = factory.m21739e(factory.m21738d("setUnknown_5", "org.mp4parser.boxes.apple.GenericMediaHeaderTextAtom", "int", "unknown_5", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 36L;
    }
}
