package androidx.paging;

import androidx.paging.LoadState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "", "Key", "", "Value", "accessorState", "Landroidx/paging/AccessorState;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class RemoteMediatorAccessImpl$retryFailed$1 extends Lambda implements Function1<AccessorState<Object, Object>, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f31233a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteMediatorAccessImpl$retryFailed$1(ArrayList arrayList) {
        super(1);
        this.f31233a = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AccessorState accessorState = (AccessorState) obj;
        Intrinsics.m18599g(accessorState, "accessorState");
        LoadState loadStateM11316b = accessorState.m11316b(LoadType.f30752a);
        new LoadStates(loadStateM11316b, accessorState.m11316b(LoadType.f30753b), accessorState.m11316b(LoadType.f30754c));
        boolean z2 = loadStateM11316b instanceof LoadState.Error;
        throw null;
    }
}
