package androidx.compose.p013ui.unit;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/unit/DpRect;", "", "Companion", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final /* data */ class DpRect {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/unit/DpRect$Companion;", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpRect)) {
            return false;
        }
        ((DpRect) obj).getClass();
        return C1338Dp.m6641a(0.0f, 0.0f) && C1338Dp.m6641a(0.0f, 0.0f) && C1338Dp.m6641a(0.0f, 0.0f) && C1338Dp.m6641a(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31);
    }

    public final String toString() {
        return "DpRect(left=" + ((Object) C1338Dp.m6642b(0.0f)) + ", top=" + ((Object) C1338Dp.m6642b(0.0f)) + ", right=" + ((Object) C1338Dp.m6642b(0.0f)) + ", bottom=" + ((Object) C1338Dp.m6642b(0.0f)) + ')';
    }
}
