package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/foundation/gestures/DefaultDraggableState$dragScope$1", "Landroidx/compose/foundation/gestures/DragScope;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DefaultDraggableState$dragScope$1 implements DragScope {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DefaultDraggableState f5470a;

    public DefaultDraggableState$dragScope$1(DefaultDraggableState defaultDraggableState) {
        this.f5470a = defaultDraggableState;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.foundation.gestures.DragScope
    /* JADX INFO: renamed from: a */
    public final void mo2597a(float f) {
        this.f5470a.f5463a.invoke(Float.valueOf(f));
    }
}
