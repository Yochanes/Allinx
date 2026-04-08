package androidx.compose.foundation.text.selection;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/TextSelectionColors;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextSelectionColors {

    /* JADX INFO: renamed from: a */
    public final long f9980a;

    /* JADX INFO: renamed from: b */
    public final long f9981b;

    public TextSelectionColors(long j, long j2) {
        this.f9980a = j;
        this.f9981b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        return Color.m5181c(this.f9980a, textSelectionColors.f9980a) && Color.m5181c(this.f9981b, textSelectionColors.f9981b);
    }

    public final int hashCode() {
        int i = Color.f17584l;
        return Long.hashCode(this.f9981b) + (Long.hashCode(this.f9980a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC0455a.m2223B(this.f9980a, ", selectionBackgroundColor=", sb);
        sb.append((Object) Color.m5187i(this.f9981b));
        sb.append(')');
        return sb.toString();
    }
}
