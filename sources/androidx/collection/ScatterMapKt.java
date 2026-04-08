package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0004*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0002\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0003\"\u00020\u00002\u00020\u0000¨\u0006\u0004"}, m18302d2 = {"", "Bitmask", "Group", "StaticBitmask", "collection"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ScatterMapKt {

    /* JADX INFO: renamed from: a */
    public static final long[] f3844a = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: b */
    public static final MutableScatterMap f3845b = new MutableScatterMap(0);

    /* JADX INFO: renamed from: a */
    public static final int m2111a(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    /* JADX INFO: renamed from: b */
    public static final MutableScatterMap m2112b() {
        return new MutableScatterMap();
    }

    /* JADX INFO: renamed from: c */
    public static final int m2113c(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    /* JADX INFO: renamed from: d */
    public static final int m2114d(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static final int m2115e(int i) {
        if (i == 7) {
            return 8;
        }
        return ((i - 1) / 7) + i;
    }
}
