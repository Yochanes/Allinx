package org.mp4parser.boxes.iso14496.part12;

import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ChunkOffsetBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58563j;

    static {
        Factory factory = new Factory(ChunkOffsetBox.class, "ChunkOffsetBox.java");
        f58563j = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.ChunkOffsetBox", "", "", "", "java.lang.String"));
    }

    /* JADX INFO: renamed from: g */
    public abstract long[] mo21831g();

    public final String toString() {
        JoinPoint joinPointM21736b = Factory.m21736b(f58563j, this, this);
        RequiresParseDetailAspect.m21845a().getClass();
        RequiresParseDetailAspect.m21846b(joinPointM21736b);
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("[entryCount=");
        return AbstractC0000a.m11h(mo21831g().length, "]", sb);
    }
}
