package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LazyLayoutItemProviderKt {
    /* JADX INFO: renamed from: a */
    public static final int m3057a(int i, LazyLayoutItemProvider lazyLayoutItemProvider, Object obj) {
        int iMo2923c;
        return (obj == null || lazyLayoutItemProvider.getItemCount() == 0 || (i < lazyLayoutItemProvider.getItemCount() && obj.equals(lazyLayoutItemProvider.mo2924d(i))) || (iMo2923c = lazyLayoutItemProvider.mo2923c(obj)) == -1) ? i : iMo2923c;
    }
}
