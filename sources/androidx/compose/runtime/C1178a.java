package androidx.compose.runtime;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.runtime.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1178a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Intrinsics.m18601i(((Invalidation) obj).f16374b, ((Invalidation) obj2).f16374b);
    }
}
