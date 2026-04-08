package org.mp4parser.boxes.iso14496.part12;

import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SubtitleMediaHeaderBox extends AbstractMediaHeaderBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58767j;

    static {
        Factory factory = new Factory(SubtitleMediaHeaderBox.class, "SubtitleMediaHeaderBox.java");
        f58767j = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.SubtitleMediaHeaderBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 4L;
    }

    public final String toString() {
        AbstractC0000a.m29z(Factory.m21736b(f58767j, this, this));
        return "SubtitleMediaHeaderBox";
    }
}
