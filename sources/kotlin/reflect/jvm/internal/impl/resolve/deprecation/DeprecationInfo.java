package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DeprecationInfo implements Comparable<DeprecationInfo> {
    @Override // java.lang.Comparable
    public final int compareTo(DeprecationInfo deprecationInfo) {
        DeprecationInfo other = deprecationInfo;
        Intrinsics.m18599g(other, "other");
        DeprecationLevelValue deprecationLevelValue = DeprecationLevelValue.f54385a;
        return deprecationLevelValue.compareTo(deprecationLevelValue);
    }
}
