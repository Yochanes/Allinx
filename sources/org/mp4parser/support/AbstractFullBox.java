package org.mp4parser.support;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.FullBox;
import org.mp4parser.tools.IsoTypeWriter;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractFullBox extends AbstractBox implements FullBox {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f59261g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f59262i;

    /* JADX INFO: renamed from: d */
    public int f59263d;

    /* JADX INFO: renamed from: f */
    public int f59264f;

    static {
        Factory factory = new Factory(AbstractFullBox.class, "AbstractFullBox.java");
        f59261g = factory.m21739e(factory.m21738d("setVersion", "org.mp4parser.support.AbstractFullBox", "int", "version", "", "void"));
        f59262i = factory.m21739e(factory.m21738d("setFlags", "org.mp4parser.support.AbstractFullBox", "int", "flags", "", "void"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
    }

    /* JADX INFO: renamed from: d */
    public final void m21841d(int i) {
        AbstractC0000a.m29z(Factory.m21737c(f59262i, this, this, Integer.valueOf(i)));
        this.f59264f = i;
    }

    /* JADX INFO: renamed from: e */
    public final void m21842e() {
        AbstractC0000a.m29z(Factory.m21737c(f59261g, this, this, 1));
        this.f59263d = 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m21843f(ByteBuffer byteBuffer) {
        IsoTypeWriter.m21857h(this.f59263d, byteBuffer);
        IsoTypeWriter.m21856g(this.f59264f, byteBuffer);
    }
}
