package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/graphics/PathFillType;", "", "Companion", "value", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class PathFillType {

    /* JADX INFO: renamed from: a */
    public final int f17618a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/PathFillType$Companion;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ PathFillType(int i) {
        this.f17618a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PathFillType) {
            return this.f17618a == ((PathFillType) obj).f17618a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17618a);
    }

    public final String toString() {
        int i = this.f17618a;
        return i == 0 ? "NonZero" : i == 1 ? "EvenOdd" : "Unknown";
    }
}
