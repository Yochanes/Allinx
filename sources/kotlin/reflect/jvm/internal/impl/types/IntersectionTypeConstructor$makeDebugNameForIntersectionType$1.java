package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class IntersectionTypeConstructor$makeDebugNameForIntersectionType$1 extends Lambda implements Function1<KotlinType, String> {

    /* JADX INFO: renamed from: a */
    public static final IntersectionTypeConstructor$makeDebugNameForIntersectionType$1 f54822a = new IntersectionTypeConstructor$makeDebugNameForIntersectionType$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinType it = (KotlinType) obj;
        Intrinsics.m18599g(it, "it");
        return it.toString();
    }
}
