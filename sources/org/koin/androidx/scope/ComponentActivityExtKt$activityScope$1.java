package org.koin.androidx.scope;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Lorg/koin/core/scope/Scope;", "invoke"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
final class ComponentActivityExtKt$activityScope$1 extends Lambda implements Function0<Scope> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Intrinsics.m18599g(null, "<this>");
        throw new IllegalStateException("Activity should implement AndroidScopeComponent");
    }
}
