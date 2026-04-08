package androidx.compose.p013ui.graphics;

import androidx.annotation.RestrictTo;
import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/Interval;", "T", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@RestrictTo
public class Interval<T> {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC0455a.m2226a(Float.hashCode(Float.MAX_VALUE) * 31, Float.MIN_VALUE, 31);
    }

    public final String toString() {
        return "Interval(start=3.4028235E38, end=1.4E-45, data=null)";
    }
}
