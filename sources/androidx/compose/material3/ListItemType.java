package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0083@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/material3/ListItemType;", "", "Companion", "lines", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@JvmInline
final class ListItemType implements Comparable<ListItemType> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/ListItemType$Companion;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static int m3970a(boolean z2, boolean z3, boolean z4) {
            if ((z2 && z3) || z4) {
                return 3;
            }
            return (z2 || z3) ? 2 : 1;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(ListItemType listItemType) {
        listItemType.getClass();
        return Intrinsics.m18601i(0, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ListItemType)) {
            return false;
        }
        ((ListItemType) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return "ListItemType(lines=0)";
    }
}
