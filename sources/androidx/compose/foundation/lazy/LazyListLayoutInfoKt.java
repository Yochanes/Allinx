package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyListLayoutInfoKt {
    /* JADX INFO: renamed from: a */
    public static final int m2939a(LazyListLayoutInfo lazyListLayoutInfo) {
        List listMo2935g = lazyListLayoutInfo.mo2935g();
        int size = listMo2935g.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            size2 += ((LazyListItemInfo) listMo2935g.get(i)).getSize();
        }
        return lazyListLayoutInfo.mo2934f() + (size2 / listMo2935g.size());
    }
}
