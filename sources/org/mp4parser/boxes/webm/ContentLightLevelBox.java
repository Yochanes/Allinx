package org.mp4parser.boxes.webm;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.tools.IsoTypeWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ContentLightLevelBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59214j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59215n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59216o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59217p;

    static {
        Factory factory = new Factory(ContentLightLevelBox.class, "ContentLightLevelBox.java");
        f59214j = factory.m21739e(factory.m21738d("getMaxCLL", "org.mp4parser.boxes.webm.ContentLightLevelBox", "", "", "", "int"));
        f59215n = factory.m21739e(factory.m21738d("setMaxCLL", "org.mp4parser.boxes.webm.ContentLightLevelBox", "int", "maxCLL", "", "void"));
        f59216o = factory.m21739e(factory.m21738d("getMaxFALL", "org.mp4parser.boxes.webm.ContentLightLevelBox", "", "", "", "int"));
        f59217p = factory.m21739e(factory.m21738d("setMaxFALL", "org.mp4parser.boxes.webm.ContentLightLevelBox", "int", "maxFALL", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
        IsoTypeWriter.m21854e(0, byteBuffer);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 8L;
    }
}
