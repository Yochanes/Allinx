package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.ui.unit.Dp */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/unit/Dp;", "", "Companion", "value", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class C1338Dp implements Comparable<C1338Dp> {

    /* JADX INFO: renamed from: a */
    public final float f20559a;

    /* JADX INFO: renamed from: androidx.compose.ui.unit.Dp$Companion */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ C1338Dp(float f) {
        this.f20559a = f;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m6641a(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* JADX INFO: renamed from: b */
    public static String m6642b(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1338Dp c1338Dp) {
        return Float.compare(this.f20559a, c1338Dp.f20559a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1338Dp) {
            return Float.compare(this.f20559a, ((C1338Dp) obj).f20559a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20559a);
    }

    public final String toString() {
        return m6642b(this.f20559a);
    }
}
