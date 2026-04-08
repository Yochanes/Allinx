package kotlin.reflect.jvm.internal.impl.types;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class C6215x55fe5063<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f54821a;

    public C6215x55fe5063(Function1 function1) {
        this.f54821a = function1;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        KotlinType it = (KotlinType) obj;
        Intrinsics.m18598f(it, "it");
        Function1 function1 = this.f54821a;
        String string = function1.invoke(it).toString();
        KotlinType it2 = (KotlinType) obj2;
        Intrinsics.m18598f(it2, "it");
        return ComparisonsKt.m18545a(string, function1.invoke(it2).toString());
    }
}
