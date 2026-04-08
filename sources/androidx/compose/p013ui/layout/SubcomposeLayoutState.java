package androidx.compose.p013ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "PrecomposedSlotHandle", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SubcomposeLayoutState {

    /* JADX INFO: renamed from: a */
    public final SubcomposeSlotReusePolicy f18593a;

    /* JADX INFO: renamed from: b */
    public LayoutNodeSubcompositionsState f18594b;

    /* JADX INFO: renamed from: c */
    public final Function2 f18595c = new SubcomposeLayoutState$setRoot$1(this);

    /* JADX INFO: renamed from: d */
    public final Function2 f18596d = new SubcomposeLayoutState$setCompositionContext$1(this);

    /* JADX INFO: renamed from: e */
    public final Function2 f18597e = new SubcomposeLayoutState$setMeasurePolicy$1(this);

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.f18593a = subcomposeSlotReusePolicy;
    }

    /* JADX INFO: renamed from: a */
    public final LayoutNodeSubcompositionsState m5691a() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f18594b;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface PrecomposedSlotHandle {
        /* JADX INFO: renamed from: b */
        default int mo5652b() {
            return 0;
        }

        void dispose();

        /* JADX INFO: renamed from: a */
        default void mo5651a(Function1 function1) {
        }

        /* JADX INFO: renamed from: c */
        default void mo5653c(int i, long j) {
        }
    }
}
