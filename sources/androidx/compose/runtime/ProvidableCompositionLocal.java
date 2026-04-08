package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/CompositionLocal;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    /* JADX INFO: renamed from: b */
    public abstract ProvidedValue mo4359b(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 androidx.compose.runtime.ValueHolder) = (r5v8 androidx.compose.runtime.ValueHolder), (r5v9 androidx.compose.runtime.ValueHolder) binds: [B:21:0x0041, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ValueHolder m4407c(ProvidedValue providedValue, ValueHolder valueHolder) {
        ValueHolder valueHolder2;
        ValueHolder valueHolder3 = null;
        valueHolder3 = null;
        valueHolder3 = null;
        valueHolder3 = null;
        valueHolder3 = null;
        valueHolder3 = null;
        if (valueHolder instanceof DynamicValueHolder) {
            if (providedValue.f16445e) {
                DynamicValueHolder dynamicValueHolder = (DynamicValueHolder) valueHolder;
                dynamicValueHolder.f16358a.setValue(providedValue.m4408a());
                valueHolder3 = dynamicValueHolder;
            }
        } else if (valueHolder instanceof StaticValueHolder) {
            if ((providedValue.f16442b || providedValue.f16446f != null) && !providedValue.f16445e) {
                StaticValueHolder staticValueHolder = (StaticValueHolder) valueHolder;
                boolean zM18594b = Intrinsics.m18594b(providedValue.m4408a(), staticValueHolder.f16665a);
                valueHolder2 = staticValueHolder;
                if (zM18594b) {
                    valueHolder3 = valueHolder2;
                }
            }
        } else if (valueHolder instanceof ComputedValueHolder) {
            providedValue.getClass();
            ComputedValueHolder computedValueHolder = (ComputedValueHolder) valueHolder;
            Lambda lambda = computedValueHolder.f16335a;
            valueHolder2 = computedValueHolder;
            if (lambda == null) {
            }
        }
        if (valueHolder3 != null) {
            return valueHolder3;
        }
        boolean z2 = providedValue.f16445e;
        MutableState parcelableSnapshotMutableState = providedValue.f16444d;
        if (!z2) {
            return parcelableSnapshotMutableState != null ? new DynamicValueHolder(parcelableSnapshotMutableState) : new StaticValueHolder(providedValue.m4408a());
        }
        if (parcelableSnapshotMutableState == null) {
            SnapshotMutationPolicy snapshotMutationPolicy = providedValue.f16443c;
            if (snapshotMutationPolicy == null) {
                snapshotMutationPolicy = StructuralEqualityPolicy.f16666a;
            }
            parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(providedValue.f16446f, snapshotMutationPolicy);
        }
        return new DynamicValueHolder(parcelableSnapshotMutableState);
    }
}
