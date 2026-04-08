package androidx.compose.material3;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material3/TopAppBarState;", "", "Companion", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@Stable
@SourceDebugExtension
public final class TopAppBarState {

    /* JADX INFO: renamed from: a */
    public final MutableFloatState f15262a;

    /* JADX INFO: renamed from: b */
    public final MutableFloatState f15263b;

    /* JADX INFO: renamed from: c */
    public final MutableFloatState f15264c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/TopAppBarState$Companion;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        ListSaverKt.m4749a(TopAppBarState$Companion$Saver$2.f15266a, TopAppBarState$Companion$Saver$1.f15265a);
    }

    public TopAppBarState(float f, float f2, float f3) {
        this.f15262a = PrimitiveSnapshotStateKt.m4404a(f);
        this.f15263b = PrimitiveSnapshotStateKt.m4404a(f3);
        this.f15264c = PrimitiveSnapshotStateKt.m4404a(f2);
    }

    /* JADX INFO: renamed from: a */
    public final float m4107a() {
        MutableFloatState mutableFloatState = this.f15262a;
        if (((SnapshotMutableFloatStateImpl) mutableFloatState).mo4376c() == 0.0f) {
            return 0.0f;
        }
        return m4108b() / ((SnapshotMutableFloatStateImpl) mutableFloatState).mo4376c();
    }

    /* JADX INFO: renamed from: b */
    public final float m4108b() {
        return ((SnapshotMutableFloatStateImpl) this.f15264c).mo4376c();
    }

    /* JADX INFO: renamed from: c */
    public final void m4109c(float f) {
        ((SnapshotMutableFloatStateImpl) this.f15264c).mo4391n(RangesKt.m18655b(f, ((SnapshotMutableFloatStateImpl) this.f15262a).mo4376c(), 0.0f));
    }
}
