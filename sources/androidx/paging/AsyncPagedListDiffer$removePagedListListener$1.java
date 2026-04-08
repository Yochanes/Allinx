package androidx.paging;

import androidx.paging.AsyncPagedListDiffer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0006*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18302d2 = {"<anonymous>", "", "T", "", "it", "Landroidx/paging/AsyncPagedListDiffer$PagedListListener;", "kotlin.jvm.PlatformType", "invoke", "(Landroidx/paging/AsyncPagedListDiffer$PagedListListener;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class AsyncPagedListDiffer$removePagedListListener$1 extends Lambda implements Function1<AsyncPagedListDiffer.PagedListListener<Object>, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        AsyncPagedListDiffer.PagedListListener pagedListListener = (AsyncPagedListDiffer.PagedListListener) obj;
        if (pagedListListener instanceof AsyncPagedListDiffer.OnCurrentListChangedWrapper) {
            ((AsyncPagedListDiffer.OnCurrentListChangedWrapper) pagedListListener).getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
