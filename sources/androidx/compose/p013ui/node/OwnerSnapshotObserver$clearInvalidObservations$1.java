package androidx.compose.p013ui.node;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class OwnerSnapshotObserver$clearInvalidObservations$1 extends Lambda implements Function1<Object, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final OwnerSnapshotObserver$clearInvalidObservations$1 f19002a = new OwnerSnapshotObserver$clearInvalidObservations$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
        return Boolean.valueOf(!((OwnerScope) obj).mo5720b0());
    }
}
