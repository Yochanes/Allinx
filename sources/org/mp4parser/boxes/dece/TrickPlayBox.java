package org.mp4parser.boxes.dece;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TrickPlayBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58429j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58430n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58431o;

    /* JADX INFO: compiled from: Proguard */
    public static class Entry {
        public final String toString() {
            return "Entry{picType=0,dependencyLevel=0}";
        }
    }

    static {
        Factory factory = new Factory(TrickPlayBox.class, "TrickPlayBox.java");
        f58429j = factory.m21739e(factory.m21738d("getEntries", "org.mp4parser.boxes.dece.TrickPlayBox", "", "", "", "java.util.List"));
        f58430n = factory.m21739e(factory.m21738d("setEntries", "org.mp4parser.boxes.dece.TrickPlayBox", "java.util.List", "entries", "", "void"));
        f58431o = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.dece.TrickPlayBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }

    public final String toString() {
        AbstractC0000a.m29z(Factory.m21736b(f58431o, this, this));
        return "TrickPlayBox{entries=null}";
    }
}
