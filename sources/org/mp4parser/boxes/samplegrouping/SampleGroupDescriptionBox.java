package org.mp4parser.boxes.samplegrouping;

import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.IsoFile;
import org.mp4parser.support.AbstractFullBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SampleGroupDescriptionBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59119j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59120n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59121o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59122p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59123q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59124r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f59125s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f59126t;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ JoinPoint.StaticPart f59127u;

    static {
        Factory factory = new Factory(SampleGroupDescriptionBox.class, "SampleGroupDescriptionBox.java");
        f59119j = factory.m21739e(factory.m21738d("getGroupingType", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"));
        f59120n = factory.m21739e(factory.m21738d("setGroupingType", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "java.lang.String", "groupingType", "", "void"));
        f59121o = factory.m21739e(factory.m21738d("getDefaultLength", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"));
        f59122p = factory.m21739e(factory.m21738d("setDefaultLength", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "int", "defaultLength", "", "void"));
        f59123q = factory.m21739e(factory.m21738d("getGroupEntries", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.util.List"));
        f59124r = factory.m21739e(factory.m21738d("setGroupEntries", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "java.util.List", "groupEntries", "", "void"));
        f59125s = factory.m21739e(factory.m21738d("equals", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "java.lang.Object", "o", "", AttributeType.BOOLEAN));
        f59126t = factory.m21739e(factory.m21738d("hashCode", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"));
        f59127u = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        m21843f(byteBuffer);
        byteBuffer.put(IsoFile.m21819g(null));
        if (this.f59263d == 1) {
            byteBuffer.putInt(0);
        }
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        AbstractC0000a.m29z(Factory.m21737c(f59125s, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AbstractC0000a.m29z(Factory.m21736b(f59126t, this, this));
        return 0 * 31;
    }

    public final String toString() {
        AbstractC0000a.m29z(Factory.m21736b(f59127u, this, this));
        throw null;
    }
}
