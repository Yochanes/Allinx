package org.mp4parser.boxes.iso14496.part30;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.mp4parser.tools.Utf8;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class WebVTTConfigurationBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ JoinPoint.StaticPart f59022d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f59023f;

    static {
        Factory factory = new Factory(WebVTTConfigurationBox.class, "WebVTTConfigurationBox.java");
        f59022d = factory.m21739e(factory.m21738d("getConfig", "org.mp4parser.boxes.iso14496.part30.WebVTTConfigurationBox", "", "", "", "java.lang.String"));
        f59023f = factory.m21739e(factory.m21738d("setConfig", "org.mp4parser.boxes.iso14496.part30.WebVTTConfigurationBox", "java.lang.String", "config", "", "void"));
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
