package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class CompositionTimeToSample extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58564j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58565n;

    /* JADX INFO: compiled from: Proguard */
    public static class Entry {
        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry{count=");
            sb.append(0);
            sb.append(", offset=");
            return AbstractC0000a.m17n(sb, 0, '}');
        }
    }

    static {
        Factory factory = new Factory(CompositionTimeToSample.class, "CompositionTimeToSample.java");
        f58564j = factory.m21739e(factory.m21738d("getEntries", "org.mp4parser.boxes.iso14496.part12.CompositionTimeToSample", "", "", "", "java.util.List"));
        f58565n = factory.m21739e(factory.m21738d("setEntries", "org.mp4parser.boxes.iso14496.part12.CompositionTimeToSample", "java.util.List", "entries", "", "void"));
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
}
