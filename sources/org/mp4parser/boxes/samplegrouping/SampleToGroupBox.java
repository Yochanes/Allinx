package org.mp4parser.boxes.samplegrouping;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SampleToGroupBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59128j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59129n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59130o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59131p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59132q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59133r;

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
            return ((int) 0) * 31;
        }

        public final String toString() {
            return "Entry{sampleCount=0, groupDescriptionIndex=0}";
        }
    }

    static {
        Factory factory = new Factory(SampleToGroupBox.class, "SampleToGroupBox.java");
        f59128j = factory.m21739e(factory.m21738d("getGroupingType", "org.mp4parser.boxes.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"));
        f59129n = factory.m21739e(factory.m21738d("setGroupingType", "org.mp4parser.boxes.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingType", "", "void"));
        f59130o = factory.m21739e(factory.m21738d("getGroupingTypeParameter", "org.mp4parser.boxes.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"));
        f59131p = factory.m21739e(factory.m21738d("setGroupingTypeParameter", "org.mp4parser.boxes.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingTypeParameter", "", "void"));
        f59132q = factory.m21739e(factory.m21738d("getEntries", "org.mp4parser.boxes.samplegrouping.SampleToGroupBox", "", "", "", "java.util.List"));
        f59133r = factory.m21739e(factory.m21738d("setEntries", "org.mp4parser.boxes.samplegrouping.SampleToGroupBox", "java.util.List", "entries", "", "void"));
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
        int i = this.f59263d;
        throw null;
    }
}
