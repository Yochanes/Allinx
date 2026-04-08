package org.mp4parser.boxes.microsoft;

import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class XtraBox extends AbstractBox {

    /* JADX INFO: renamed from: d */
    public static final Logger f59081d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ JoinPoint.StaticPart f59082f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ JoinPoint.StaticPart f59083g;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ JoinPoint.StaticPart f59084i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f59085j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ JoinPoint.StaticPart f59086n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ JoinPoint.StaticPart f59087o;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ JoinPoint.StaticPart f59088p;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ JoinPoint.StaticPart f59089q;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ JoinPoint.StaticPart f59090r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ JoinPoint.StaticPart f59091s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ JoinPoint.StaticPart f59092t;

    /* JADX INFO: compiled from: Proguard */
    public static class XtraTag {
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class XtraValue {
        public final String toString() {
            return "[GUID](nonParsed)";
        }
    }

    static {
        Factory factory = new Factory(XtraBox.class, "XtraBox.java");
        f59082f = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.microsoft.XtraBox", "", "", "", "java.lang.String"));
        f59083g = factory.m21739e(factory.m21738d("getAllTagNames", "org.mp4parser.boxes.microsoft.XtraBox", "", "", "", "[Ljava.lang.String;"));
        f59092t = factory.m21739e(factory.m21738d("setTagValue", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:long", "name:value", "", "void"));
        f59084i = factory.m21739e(factory.m21738d("getFirstStringValue", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.String"));
        f59085j = factory.m21739e(factory.m21738d("getFirstDateValue", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.util.Date"));
        f59086n = factory.m21739e(factory.m21738d("getFirstLongValue", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.Long"));
        f59087o = factory.m21739e(factory.m21738d("getValues", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "[Ljava.lang.Object;"));
        f59088p = factory.m21739e(factory.m21738d("removeTag", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "void"));
        f59089q = factory.m21739e(factory.m21738d("setTagValues", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:[Ljava.lang.String;", "name:values", "", "void"));
        f59090r = factory.m21739e(factory.m21738d("setTagValue", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.lang.String", "name:value", "", "void"));
        f59091s = factory.m21739e(factory.m21738d("setTagValue", "org.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.util.Date", "name:date", "", "void"));
        f59081d = LoggerFactory.getLogger((Class<?>) XtraBox.class);
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: a */
    public final void mo21820a(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        throw null;
    }

    public final String toString() {
        AbstractC0000a.m29z(Factory.m21736b(f59082f, this, this));
        throw null;
    }
}
