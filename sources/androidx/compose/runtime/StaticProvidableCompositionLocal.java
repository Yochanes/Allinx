package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/StaticProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class StaticProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    /* JADX INFO: renamed from: b */
    public final ProvidedValue mo4359b(Object obj) {
        return new ProvidedValue(this, obj, obj == null, null, null, false);
    }
}
