package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableScatterSet f16653a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1(MutableScatterSet mutableScatterSet) {
        super(1);
        this.f16653a = mutableScatterSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (obj instanceof StateObjectImpl) {
            ((StateObjectImpl) obj).m4851x(4);
        }
        this.f16653a.m2082e(obj);
        return Unit.f51459a;
    }
}
