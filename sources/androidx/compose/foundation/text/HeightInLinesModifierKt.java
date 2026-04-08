package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, m18302d2 = {"", "typeface", "foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class HeightInLinesModifierKt {
    /* JADX INFO: renamed from: a */
    public static final void m3227a(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            InlineClassHelperKt.m2705a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        InlineClassHelperKt.m2705a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }
}
