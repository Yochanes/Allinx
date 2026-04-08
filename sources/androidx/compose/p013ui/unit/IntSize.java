package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/unit/IntSize;", "", "Companion", "packedValue", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class IntSize {

    /* JADX INFO: renamed from: a */
    public final long f20568a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/unit/IntSize$Companion;", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ IntSize(long j) {
        this.f20568a = j;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6664a(long j, Object obj) {
        return (obj instanceof IntSize) && j == ((IntSize) obj).f20568a;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m6665b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static String m6666c(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return m6664a(this.f20568a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f20568a);
    }

    public final String toString() {
        return m6666c(this.f20568a);
    }
}
