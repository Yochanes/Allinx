package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "Companion", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {

    /* JADX INFO: renamed from: a */
    public int f16448a;

    /* JADX INFO: renamed from: b */
    public RecomposeScopeOwner f16449b;

    /* JADX INFO: renamed from: c */
    public Anchor f16450c;

    /* JADX INFO: renamed from: d */
    public Function2 f16451d;

    /* JADX INFO: renamed from: e */
    public int f16452e;

    /* JADX INFO: renamed from: f */
    public MutableObjectIntMap f16453f;

    /* JADX INFO: renamed from: g */
    public MutableScatterMap f16454g;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl$Companion;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static void m4416a(SlotWriter slotWriter, List list, RecomposeScopeOwner recomposeScopeOwner) {
            List list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                int iM4493c = slotWriter.m4493c((Anchor) list.get(i));
                int iM4481M = slotWriter.m4481M(slotWriter.m4506q(iM4493c), slotWriter.f16584b);
                Object obj = iM4481M < slotWriter.m4496f(slotWriter.m4506q(iM4493c + 1), slotWriter.f16584b) ? slotWriter.f16585c[slotWriter.m4497g(iM4481M)] : Composer.Companion.f16228a;
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.f16449b = recomposeScopeOwner;
                }
            }
        }
    }

    public RecomposeScopeImpl(CompositionImpl compositionImpl) {
        this.f16449b = compositionImpl;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4409a(DerivedState derivedState, MutableScatterMap mutableScatterMap) {
        Intrinsics.m18597e(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        SnapshotMutationPolicy snapshotMutationPolicyMo4363d = derivedState.getF16343c();
        if (snapshotMutationPolicyMo4363d == null) {
            snapshotMutationPolicyMo4363d = StructuralEqualityPolicy.f16666a;
        }
        return !snapshotMutationPolicyMo4363d.mo3367a(derivedState.mo4362F().f16349f, mutableScatterMap.m2109e(derivedState));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4410b() {
        if (this.f16449b != null) {
            Anchor anchor = this.f16450c;
            if (anchor != null ? anchor.m4194a() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final InvalidationResult m4411c(Object obj) {
        InvalidationResult invalidationResultMo4325g;
        RecomposeScopeOwner recomposeScopeOwner = this.f16449b;
        return (recomposeScopeOwner == null || (invalidationResultMo4325g = recomposeScopeOwner.mo4325g(this, obj)) == null) ? InvalidationResult.f16376a : invalidationResultMo4325g;
    }

    /* JADX INFO: renamed from: d */
    public final void m4412d() {
        RecomposeScopeOwner recomposeScopeOwner = this.f16449b;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.mo4323a();
        }
        this.f16449b = null;
        this.f16453f = null;
        this.f16454g = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m4413e(boolean z2) {
        if (z2) {
            this.f16448a |= 32;
        } else {
            this.f16448a &= -33;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4414f() {
        this.f16448a |= 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m4415g(Function2 function2) {
        this.f16451d = function2;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public final void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.f16449b;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.mo4325g(this, null);
        }
    }
}
