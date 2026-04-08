package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class TypeEnhancementUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final Object m19341a(Set set, Enum r2, Enum r3, Enum r4, boolean z2) {
        if (!z2) {
            if (r4 != null) {
                set = CollectionsKt.m18399B0(SetsKt.m18502f(set, r4));
            }
            return CollectionsKt.m18439k0(set);
        }
        Enum r1 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (Intrinsics.m18594b(r1, r2) && Intrinsics.m18594b(r4, r3)) {
            return null;
        }
        return r4 == null ? r1 : r4;
    }
}
