package androidx.paging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "", "Key", "", "Value", "it", "Landroidx/paging/AccessorState;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class RemoteMediatorAccessImpl$allowRefresh$1 extends Lambda implements Function1<AccessorState<Object, Object>, Unit> {

    /* JADX INFO: renamed from: a */
    public static final RemoteMediatorAccessImpl$allowRefresh$1 f31202a = new RemoteMediatorAccessImpl$allowRefresh$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AccessorState it = (AccessorState) obj;
        Intrinsics.m18599g(it, "it");
        it.f30524a = true;
        return Unit.f51459a;
    }
}
