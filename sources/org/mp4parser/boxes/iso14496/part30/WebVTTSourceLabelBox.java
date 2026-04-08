package org.mp4parser.boxes.iso14496.part30;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.tools.Utf8;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class WebVTTSourceLabelBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f59024d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f59025f;

    static {
        Factory factory = new Factory(WebVTTSourceLabelBox.class, "WebVTTSourceLabelBox.java");
        f59024d = factory.m21739e(factory.m21738d("getSourceLabel", "org.mp4parser.boxes.iso14496.part30.WebVTTSourceLabelBox", "", "", "", "java.lang.String"));
        f59025f = factory.m21739e(factory.m21738d("setSourceLabel", "org.mp4parser.boxes.iso14496.part30.WebVTTSourceLabelBox", "java.lang.String", "sourceLabel", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        byteBuffer.put(Utf8.m21860a(null));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return Utf8.m21861b(null);
    }
}
