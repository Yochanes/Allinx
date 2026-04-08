package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/material/SwipeableState;", "T", "", "Companion", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Stable
@Deprecated
@ExperimentalMaterialApi
@SourceDebugExtension
public class SwipeableState<T> {

    /* JADX INFO: renamed from: a */
    public final AnimationSpec f11338a;

    /* JADX INFO: renamed from: b */
    public final Function1 f11339b;

    /* JADX INFO: renamed from: c */
    public final MutableState f11340c;

    /* JADX INFO: renamed from: d */
    public final MutableState f11341d = SnapshotStateKt.m4525g(Boolean.FALSE);

    /* JADX INFO: renamed from: e */
    public final MutableFloatState f11342e = PrimitiveSnapshotStateKt.m4404a(0.0f);

    /* JADX INFO: renamed from: f */
    public final MutableFloatState f11343f = PrimitiveSnapshotStateKt.m4404a(0.0f);

    /* JADX INFO: renamed from: g */
    public final MutableFloatState f11344g = PrimitiveSnapshotStateKt.m4404a(0.0f);

    /* JADX INFO: renamed from: h */
    public final MutableState f11345h = SnapshotStateKt.m4525g(null);

    /* JADX INFO: renamed from: i */
    public final MutableState f11346i = SnapshotStateKt.m4525g(MapsKt.m18481d());

    /* JADX INFO: renamed from: j */
    public final FlowKt__LimitKt$take$$inlined$unsafeFlow$1 f11347j = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new SwipeableState$special$$inlined$filter$1(SnapshotStateKt.m4532n(new SwipeableState$latestNonEmptyAnchorsFlow$1(this))));

    /* JADX INFO: renamed from: k */
    public float f11348k = Float.NEGATIVE_INFINITY;

    /* JADX INFO: renamed from: l */
    public float f11349l = Float.POSITIVE_INFINITY;

    /* JADX INFO: renamed from: m */
    public final MutableState f11350m = SnapshotStateKt.m4525g(SwipeableState$thresholds$2.f11389a);

    /* JADX INFO: renamed from: n */
    public final MutableFloatState f11351n = PrimitiveSnapshotStateKt.m4404a(0.0f);

    /* JADX INFO: renamed from: o */
    public final MutableState f11352o = SnapshotStateKt.m4525g(null);

    /* JADX INFO: renamed from: p */
    public final DraggableState f11353p = DraggableKt.m2617a(new SwipeableState$draggableState$1(this));

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C09301 extends Lambda implements Function1<Object, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/SwipeableState$Companion;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public SwipeableState(Object obj, AnimationSpec animationSpec, Function1 function1) {
        this.f11338a = animationSpec;
        this.f11339b = function1;
        this.f11340c = SnapshotStateKt.m4525g(obj);
    }

    /* JADX INFO: renamed from: a */
    public final void m3796a(Object obj) {
        ((SnapshotMutableStateImpl) this.f11340c).setValue(obj);
    }
}
