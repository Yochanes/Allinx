package androidx.paging;

import androidx.paging.PagedList;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18302d2 = {"<anonymous>", "", "T", "", "it", "Ljava/lang/ref/WeakReference;", "Landroidx/paging/PagedList$Callback;", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class PagedList$addWeakCallback$1 extends Lambda implements Function1<WeakReference<PagedList.Callback>, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WeakReference it = (WeakReference) obj;
        Intrinsics.m18599g(it, "it");
        return Boolean.valueOf(it.get() == null);
    }
}
