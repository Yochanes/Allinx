package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Visibility {

    /* JADX INFO: renamed from: a */
    public final String f52314a;

    /* JADX INFO: renamed from: b */
    public final boolean f52315b;

    public Visibility(String str, boolean z2) {
        this.f52314a = str;
        this.f52315b = z2;
    }

    /* JADX INFO: renamed from: a */
    public Integer mo18986a(Visibility visibility) {
        Intrinsics.m18599g(visibility, "visibility");
        MapBuilder mapBuilder = Visibilities.f52304a;
        if (this == visibility) {
            return 0;
        }
        MapBuilder mapBuilder2 = Visibilities.f52304a;
        Integer num = (Integer) mapBuilder2.get(this);
        Integer num2 = (Integer) mapBuilder2.get(visibility);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* JADX INFO: renamed from: b */
    public String mo18985b() {
        return this.f52314a;
    }

    public final String toString() {
        return mo18985b();
    }

    /* JADX INFO: renamed from: c */
    public Visibility mo18987c() {
        return this;
    }
}
