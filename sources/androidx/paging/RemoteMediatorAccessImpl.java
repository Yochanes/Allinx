package androidx.paging;

import androidx.paging.RemoteMediator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/paging/RemoteMediatorAccessImpl;", "", "Key", "Value", "Landroidx/paging/RemoteMediatorAccessor;", "Companion", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class RemoteMediatorAccessImpl<Key, Value> implements RemoteMediatorAccessor<Key, Value> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Landroidx/paging/RemoteMediatorAccessImpl$Companion;", "", "", "PRIORITY_APPEND_PREPEND", "I", "PRIORITY_REFRESH", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31201a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f31201a = iArr;
        }
    }

    @Override // androidx.paging.RemoteMediatorConnection
    /* JADX INFO: renamed from: a */
    public final void mo11399a(PagingState pagingState) {
        new RemoteMediatorAccessImpl$requestRefreshIfAllowed$1(this, pagingState);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11400b(ContinuationImpl continuationImpl) {
        RemoteMediatorAccessImpl$initialize$1 remoteMediatorAccessImpl$initialize$1;
        if (continuationImpl instanceof RemoteMediatorAccessImpl$initialize$1) {
            remoteMediatorAccessImpl$initialize$1 = (RemoteMediatorAccessImpl$initialize$1) continuationImpl;
            int i = remoteMediatorAccessImpl$initialize$1.f31206d;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteMediatorAccessImpl$initialize$1.f31206d = i - Integer.MIN_VALUE;
            } else {
                remoteMediatorAccessImpl$initialize$1 = new RemoteMediatorAccessImpl$initialize$1(this, continuationImpl);
            }
        }
        Object obj = remoteMediatorAccessImpl$initialize$1.f31204b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = remoteMediatorAccessImpl$initialize$1.f31206d;
        RemoteMediator.InitializeAction initializeAction = RemoteMediator.InitializeAction.f31199a;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            remoteMediatorAccessImpl$initialize$1.f31203a = this;
            remoteMediatorAccessImpl$initialize$1.f31206d = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        RemoteMediatorAccessImpl remoteMediatorAccessImpl = (RemoteMediatorAccessImpl) remoteMediatorAccessImpl$initialize$1.f31203a;
        ResultKt.m18313b(obj);
        if (((RemoteMediator.InitializeAction) obj) != initializeAction) {
            return obj;
        }
        remoteMediatorAccessImpl.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final void m11401c(AccessorStateHolder accessorStateHolder, LoadType loadType, PagingState pagingState) {
        new RemoteMediatorAccessImpl$requestLoad$newRequest$1(loadType, pagingState);
        accessorStateHolder.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m11402d(LoadType loadType, PagingState pagingState) {
        Intrinsics.m18599g(loadType, "loadType");
        m11401c(null, loadType, pagingState);
    }
}
