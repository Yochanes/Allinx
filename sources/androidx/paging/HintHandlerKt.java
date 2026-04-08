package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.ViewportHint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"paging-common_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final class HintHandlerKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m11337a(ViewportHint viewportHint, ViewportHint viewportHint2, LoadType loadType) {
        Intrinsics.m18599g(viewportHint, "<this>");
        if (viewportHint2 == null || ((viewportHint2 instanceof ViewportHint.Initial) && (viewportHint instanceof ViewportHint.Access))) {
            return true;
        }
        if ((viewportHint instanceof ViewportHint.Initial) && (viewportHint2 instanceof ViewportHint.Access)) {
            return false;
        }
        return (viewportHint.f31371c == viewportHint2.f31371c && viewportHint.f31372d == viewportHint2.f31372d && viewportHint2.m11420a(loadType) <= viewportHint.m11420a(loadType)) ? false : true;
    }
}
