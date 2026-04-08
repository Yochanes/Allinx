package androidx.compose.foundation.text;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/AutoSizeStepBased;", "Landroidx/compose/foundation/text/TextAutoSize;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class AutoSizeStepBased implements TextAutoSize {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AutoSizeStepBased)) {
            return false;
        }
        return TextUnit.m6673a(0L, 0L) && TextUnit.m6673a(0L, 0L) && TextUnit.m6673a(0L, 0L);
    }

    public final int hashCode() {
        TextUnitType[] textUnitTypeArr = TextUnit.f20574b;
        return Long.hashCode(0L) + AbstractC0455a.m2231f(0L, Long.hashCode(0L) * 31, 31);
    }
}
