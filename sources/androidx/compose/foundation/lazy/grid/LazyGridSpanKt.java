package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyGridSpanKt {
    /* JADX INFO: renamed from: a */
    public static final long m3010a(int i) {
        if (!(i > 0)) {
            InlineClassHelperKt.m2705a("The span value should be higher than 0");
        }
        return i;
    }
}
