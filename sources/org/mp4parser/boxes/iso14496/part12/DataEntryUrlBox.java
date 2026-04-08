package org.mp4parser.boxes.iso14496.part12;

import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.support.AbstractFullBox;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DataEntryUrlBox extends AbstractFullBox {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ JoinPoint.StaticPart f58576j;

    static {
        Factory factory = new Factory(DataEntryUrlBox.class, "DataEntryUrlBox.java");
        f58576j = factory.m21739e(factory.m21738d("toString", "org.mp4parser.boxes.iso14496.part12.DataEntryUrlBox", "", "", "", "java.lang.String"));
    }

    @Override // org.mp4parser.support.AbstractBox
    /* JADX INFO: renamed from: b */
    public final long mo21821b() {
        return 4L;
    }

    public final String toString() {
        AbstractC0000a.m29z(Factory.m21736b(f58576j, this, this));
        return "DataEntryUrlBox[]";
    }
}
