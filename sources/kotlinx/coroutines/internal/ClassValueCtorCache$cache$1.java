package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00040\u0001¨\u0006\u0005"}, m18302d2 = {"kotlinx/coroutines/internal/ClassValueCtorCache$cache$1", "Ljava/lang/ClassValue;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ClassValueCtorCache$cache$1 extends ClassValue<Function1<? super Throwable, ? extends Throwable>> {
    @Override // java.lang.ClassValue
    public final Function1<? super Throwable, ? extends Throwable> computeValue(Class cls) {
        Intrinsics.m18597e(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
        return ExceptionsConstructorKt.m20821a(cls);
    }
}
