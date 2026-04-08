package com.tinder.scarlet.lifecycle;

import io.reactivex.functions.BiPredicate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
final class LifecycleRegistry$sam$io_reactivex_functions_BiPredicate$0 implements BiPredicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FunctionReferenceImpl f43484a;

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleRegistry$sam$io_reactivex_functions_BiPredicate$0(Function2 function2) {
        this.f43484a = (FunctionReferenceImpl) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // io.reactivex.functions.BiPredicate
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean mo15433a(Object obj, Object obj2) {
        Object objInvoke = this.f43484a.invoke(obj, obj2);
        Intrinsics.m18598f(objInvoke, "invoke(...)");
        return ((Boolean) objInvoke).booleanValue();
    }
}
