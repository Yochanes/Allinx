package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TrackLoadSettingsAtom extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f58384d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f58385f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f58386g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f58387i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58388j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58389n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58390o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f58391p;

    static {
        Factory factory = new Factory(TrackLoadSettingsAtom.class, "TrackLoadSettingsAtom.java");
        f58384d = factory.m21739e(factory.m21738d("getPreloadStartTime", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"));
        f58385f = factory.m21739e(factory.m21738d("setPreloadStartTime", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadStartTime", "", "void"));
        f58386g = factory.m21739e(factory.m21738d("getPreloadDuration", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"));
        f58387i = factory.m21739e(factory.m21738d("setPreloadDuration", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadDuration", "", "void"));
        f58388j = factory.m21739e(factory.m21738d("getPreloadFlags", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"));
        f58389n = factory.m21739e(factory.m21738d("setPreloadFlags", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadFlags", "", "void"));
        f58390o = factory.m21739e(factory.m21738d("getDefaultHints", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"));
        f58391p = factory.m21739e(factory.m21738d("setDefaultHints", "org.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "defaultHints", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 16L;
    }
}
