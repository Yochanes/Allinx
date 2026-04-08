package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ListImplementation;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ListImplementation {
    /* JADX INFO: renamed from: a */
    public static final void m4721a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0455a.m2237l(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4722b(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC0455a.m2237l(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4723c(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbM24u = AbstractC0000a.m24u("fromIndex: ", ", toIndex: ", ", size: ", i, i2);
            sbM24u.append(i3);
            throw new IndexOutOfBoundsException(sbM24u.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(AbstractC0455a.m2237l(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }
}
