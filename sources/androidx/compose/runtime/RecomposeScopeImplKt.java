package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"runtime_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RecomposeScopeImplKt {
    /* JADX INFO: renamed from: a */
    public static final int m4417a(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }
}
