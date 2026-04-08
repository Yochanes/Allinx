package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/LazyValueHolder;", "T", "Landroidx/compose/runtime/ValueHolder;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LazyValueHolder<T> implements ValueHolder<T> {

    /* JADX INFO: renamed from: a */
    public final Lazy f16397a;

    public LazyValueHolder(Function0 function0) {
        this.f16397a = LazyKt.m18299b(function0);
    }

    @Override // androidx.compose.runtime.ValueHolder
    /* JADX INFO: renamed from: a */
    public final Object mo4360a(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.f16397a.getValue();
    }
}
