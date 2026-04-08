package androidx.paging;

import androidx.paging.PagingDataEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/paging/AsyncPagingDataDiffer$presenter$1", "Landroidx/paging/PagingDataPresenter;", "paging-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class AsyncPagingDataDiffer$presenter$1 extends PagingDataPresenter<Object> {
    /* JADX WARN: Code restructure failed: missing block: B:85:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.PagingDataPresenter
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo11321c(PagingDataEvent pagingDataEvent, ContinuationImpl continuationImpl) {
        AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1 asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1;
        int i;
        int i2;
        if (continuationImpl instanceof AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1) {
            asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1 = (AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1) continuationImpl;
            int i3 = asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.f30536c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.f30536c = i3 - Integer.MIN_VALUE;
            } else {
                asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1 = new AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1(this, continuationImpl);
            }
        }
        Object obj = asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.f30534a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i4 = asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.f30536c;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            throw null;
        }
        ResultKt.m18313b(obj);
        if (pagingDataEvent instanceof PagingDataEvent.Refresh) {
            PagingDataEvent.Refresh refresh = (PagingDataEvent.Refresh) pagingDataEvent;
            int size = refresh.f31111b.getSize();
            PageStore pageStore = refresh.f31110a;
            if (size == 0) {
                if (pageStore.getSize() > 0) {
                    throw null;
                }
                return;
            } else {
                if (pageStore.getSize() != 0 || refresh.f31111b.getSize() > 0) {
                    throw null;
                }
                return;
            }
        }
        if (pagingDataEvent instanceof PagingDataEvent.Prepend) {
            PagingDataEvent.Prepend prepend = (PagingDataEvent.Prepend) pagingDataEvent;
            int size2 = prepend.f31107a.size();
            int i5 = prepend.f31109c;
            int iMin = Math.min(i5, size2);
            int i6 = size2 - iMin;
            if (iMin > 0 || i6 > 0 || (i2 = (prepend.f31108b - i5) + iMin) > 0 || i2 < 0) {
                throw null;
            }
            return;
        }
        if (pagingDataEvent instanceof PagingDataEvent.Append) {
            PagingDataEvent.Append append = (PagingDataEvent.Append) pagingDataEvent;
            int size3 = append.f31097b.size();
            int i7 = append.f31099d;
            int iMin2 = Math.min(i7, size3);
            int i8 = size3 - iMin2;
            if (iMin2 > 0 || i8 > 0 || (i = (append.f31098c - i7) + iMin2) > 0 || i < 0) {
                throw null;
            }
            return;
        }
        if (pagingDataEvent instanceof PagingDataEvent.DropPrepend) {
            PagingDataEvent.DropPrepend dropPrepend = (PagingDataEvent.DropPrepend) pagingDataEvent;
            int i9 = dropPrepend.f31105b - dropPrepend.f31104a;
            int i10 = dropPrepend.f31106c;
            int i11 = i9 - i10;
            if (i11 > 0 || i11 < 0) {
                throw null;
            }
            if (dropPrepend.f31105b - Math.max(0, i10 + i11) > 0) {
                throw null;
            }
            return;
        }
        if (pagingDataEvent instanceof PagingDataEvent.DropAppend) {
            PagingDataEvent.DropAppend dropAppend = (PagingDataEvent.DropAppend) pagingDataEvent;
            int i12 = dropAppend.f31102c - dropAppend.f31101b;
            int i13 = dropAppend.f31103d;
            int i14 = i12 - i13;
            if (i14 > 0 || i14 < 0) {
                throw null;
            }
            if ((dropAppend.f31102c - i13) + (i14 < 0 ? Math.min(i13, -i14) : 0) > 0) {
                throw null;
            }
        }
    }
}
