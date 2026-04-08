package io.ktor.utils.p043io.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "T", "", "thisRef", "property", "Lkotlin/reflect/KProperty;", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 4, 2})
final class SharedJvmKt$threadLocal$1<T, V> implements ReadOnlyProperty<Object, T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoroutineScope f47329a;

    public SharedJvmKt$threadLocal$1(CoroutineScope coroutineScope) {
        this.f47329a = coroutineScope;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object thisRef, KProperty property) {
        Intrinsics.m18599g(thisRef, "thisRef");
        Intrinsics.m18599g(property, "property");
        return this.f47329a;
    }
}
