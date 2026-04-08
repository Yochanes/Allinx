package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "T", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Stable
@SourceDebugExtension
public final class AnchoredDraggableState<T> {

    /* JADX INFO: renamed from: a */
    public final Function1 f5378a;

    /* JADX INFO: renamed from: b */
    public final MutatorMutex f5379b;

    /* JADX INFO: renamed from: c */
    public final MutableState f5380c;

    /* JADX INFO: renamed from: d */
    public final MutableState f5381d;

    /* JADX INFO: renamed from: e */
    public final State f5382e;

    /* JADX INFO: renamed from: f */
    public final MutableFloatState f5383f;

    /* JADX INFO: renamed from: g */
    public final State f5384g;

    /* JADX INFO: renamed from: h */
    public final MutableFloatState f5385h;

    /* JADX INFO: renamed from: i */
    public final MutableState f5386i;

    /* JADX INFO: renamed from: j */
    public final MutableState f5387j;

    /* JADX INFO: renamed from: k */
    public final AnchoredDraggableState$anchoredDragScope$1 f5388k;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C05111 extends Lambda implements Function1<Object, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public AnchoredDraggableState(Object obj) {
        this.f5378a = AnchoredDraggableState$confirmValueChange$1.f5410a;
        this.f5379b = new MutatorMutex();
        this.f5380c = SnapshotStateKt.m4525g(obj);
        this.f5381d = SnapshotStateKt.m4525g(obj);
        this.f5382e = SnapshotStateKt.m4523e(new AnchoredDraggableState$targetValue$2(this));
        this.f5383f = PrimitiveSnapshotStateKt.m4404a(Float.NaN);
        this.f5384g = SnapshotStateKt.m4522d(SnapshotStateKt.m4533o(), new AnchoredDraggableState$progress$2(this));
        this.f5385h = PrimitiveSnapshotStateKt.m4404a(0.0f);
        this.f5386i = SnapshotStateKt.m4525g(null);
        Function1 function1 = AnchoredDraggableKt.f5313a;
        this.f5387j = SnapshotStateKt.m4525g(new DefaultDraggableAnchors(new float[0]));
        this.f5388k = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    /* JADX INFO: renamed from: a */
    public final DraggableAnchors m2580a() {
        return (DraggableAnchors) ((SnapshotMutableStateImpl) this.f5387j).getF20325a();
    }

    public AnchoredDraggableState(Object obj, int i) {
        this(obj);
        this.f5378a = null;
    }
}
