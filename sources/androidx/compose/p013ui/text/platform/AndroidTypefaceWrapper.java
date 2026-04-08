package androidx.compose.p013ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceWrapper;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidTypefaceWrapper implements AndroidTypeface {

    /* JADX INFO: renamed from: a */
    public final Typeface f20477a;

    public AndroidTypefaceWrapper(Typeface typeface) {
        this.f20477a = typeface;
    }

    @Override // androidx.compose.p013ui.text.platform.AndroidTypeface
    /* JADX INFO: renamed from: a */
    public final Typeface mo6572a(FontWeight fontWeight, int i) {
        return this.f20477a;
    }
}
