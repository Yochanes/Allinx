package androidx.room.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.room.CoroutinesRoomKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0005"}, m18302d2 = {"Landroidx/room/paging/LimitOffsetPagingSource;", "", "Value", "Landroidx/paging/PagingSource;", "", "room-paging_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public abstract class LimitOffsetPagingSource<Value> extends PagingSource<Integer, Value> {

    /* JADX INFO: renamed from: androidx.room.paging.LimitOffsetPagingSource$load$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, m18302d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult;", "", "Value", "", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "androidx.room.paging.LimitOffsetPagingSource$load$2", m18559f = "LimitOffsetPagingSource.kt", m18560l = {76, 78}, m18561m = "invokeSuspend")
    final class C21962 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PagingSource.LoadResult<Integer, Object>>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            ResultKt.m18313b(obj);
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract List m11851b();

    @Override // androidx.paging.PagingSource
    public final boolean getJumpingSupported() {
        return true;
    }

    @Override // androidx.paging.PagingSource
    public final Object getRefreshKey(PagingState pagingState) {
        Integer num = pagingState.f31196b;
        if (num != null) {
            return Integer.valueOf(Math.max(0, num.intValue() - (pagingState.f31197c.f31086d / 2)));
        }
        return null;
    }

    @Override // androidx.paging.PagingSource
    public final Object load(PagingSource.LoadParams loadParams, Continuation continuation) {
        CoroutinesRoomKt.m11791a(null);
        throw null;
    }
}
