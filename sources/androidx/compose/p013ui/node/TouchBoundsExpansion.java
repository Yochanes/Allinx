package androidx.compose.p013ui.node;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion;", "", "Companion", "packedValue", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class TouchBoundsExpansion {

    /* JADX INFO: renamed from: a */
    public static final long f19014a = Companion.m5975b(0, 0, 0, 0);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f19015b = 0;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, m18302d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion$Companion;", "", "", "IS_LAYOUT_DIRECTION_AWARE", "J", "", "MASK", "I", "MAX_VALUE", "SHIFT", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static final int m5974a(int i, long j) {
            int i2 = TouchBoundsExpansion.f19015b;
            return ((int) (j >> (i * 15))) & 32767;
        }

        /* JADX INFO: renamed from: b */
        public static long m5975b(int i, int i2, int i3, int i4) {
            return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TouchBoundsExpansion)) {
            return false;
        }
        ((TouchBoundsExpansion) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "TouchBoundsExpansion(packedValue=0)";
    }
}
