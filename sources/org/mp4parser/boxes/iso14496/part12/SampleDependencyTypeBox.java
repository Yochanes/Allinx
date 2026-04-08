package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SampleDependencyTypeBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58714j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f58715n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f58716o;

    /* JADX INFO: compiled from: Proguard */
    public static class Entry {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry{isLeading=");
            sb.append((int) ((byte) 0));
            sb.append(", sampleDependsOn=");
            sb.append((int) ((byte) 0));
            sb.append(", sampleIsDependentOn=");
            sb.append((int) ((byte) 0));
            sb.append(", sampleHasRedundancy=");
            return AbstractC0000a.m17n(sb, (byte) 0, '}');
        }
    }

    static {
        Factory factory = new Factory(SampleDependencyTypeBox.class, "SampleDependencyTypeBox.java");
        f58714j = factory.m21739e(factory.m21738d("getEntries", "org.mp4parser.boxes.iso14496.part12.SampleDependencyTypeBox", "", "", "", "java.util.List"));
        f58715n = factory.m21739e(factory.m21738d("setEntries", "org.mp4parser.boxes.iso14496.part12.SampleDependencyTypeBox", "java.util.List", "entries", "", "void"));
        f58716o = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.SampleDependencyTypeBox", "", "", "", "java.lang.String"));
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
        AbstractC0000a.m29z(Factory.m21736b(f58716o, this, this));
        return "SampleDependencyTypeBox{entries=null}";
    }
}
