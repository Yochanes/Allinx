package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/ReferentialEqualityPolicy;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ReferentialEqualityPolicy implements SnapshotMutationPolicy<Object> {

    /* JADX INFO: renamed from: a */
    public static final ReferentialEqualityPolicy f16546a = new ReferentialEqualityPolicy();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    /* JADX INFO: renamed from: a */
    public final boolean mo3367a(Object obj, Object obj2) {
        return obj == obj2;
    }

    public final String toString() {
        return "ReferentialEqualityPolicy";
    }
}
