package androidx.compose.p013ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.activity.AbstractC0050i;
import androidx.compose.p013ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Deprecated
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/platform/AndroidDefaultTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidDefaultTypeface implements AndroidTypeface {
    @Override // androidx.compose.p013ui.text.platform.AndroidTypeface
    /* JADX INFO: renamed from: a */
    public final Typeface mo6572a(FontWeight fontWeight, int i) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.defaultFromStyle(AndroidFontUtils_androidKt.m6509a(fontWeight, i));
        }
        return AbstractC0050i.m198c(Typeface.DEFAULT, fontWeight.f20303a, i == 1);
    }
}
