package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/DynamicValueHolder;", "T", "Landroidx/compose/runtime/ValueHolder;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class DynamicValueHolder<T> implements ValueHolder<T> {

    /* JADX INFO: renamed from: a */
    public final MutableState f16358a;

    public DynamicValueHolder(MutableState mutableState) {
        this.f16358a = mutableState;
    }

    @Override // androidx.compose.runtime.ValueHolder
    /* JADX INFO: renamed from: a */
    public final Object mo4360a(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        return this.f16358a.getF20325a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicValueHolder) && Intrinsics.m18594b(this.f16358a, ((DynamicValueHolder) obj).f16358a);
    }

    public final int hashCode() {
        return this.f16358a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f16358a + ')';
    }
}
