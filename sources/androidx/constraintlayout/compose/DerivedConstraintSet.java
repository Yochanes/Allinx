package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Landroidx/constraintlayout/compose/ConstraintSet;", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface DerivedConstraintSet extends ConstraintSet {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    /* JADX INFO: renamed from: a */
    default void mo6758a(State state, List list) {
        ConstraintSet constraintSetMo6761e = mo6761e();
        if (constraintSetMo6761e != null) {
            constraintSetMo6761e.mo6758a(state, list);
        }
        mo6762j(state);
    }

    /* JADX INFO: renamed from: e */
    ConstraintSet mo6761e();

    /* JADX INFO: renamed from: j */
    void mo6762j(State state);
}
