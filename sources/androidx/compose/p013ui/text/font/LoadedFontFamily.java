package androidx.compose.p013ui.text.font;

import androidx.compose.p013ui.text.platform.AndroidTypefaceWrapper;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/LoadedFontFamily;", "Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LoadedFontFamily extends FontFamily {

    /* JADX INFO: renamed from: g */
    public final AndroidTypefaceWrapper f20307g;

    public LoadedFontFamily(AndroidTypefaceWrapper androidTypefaceWrapper) {
        this.f20307g = androidTypefaceWrapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoadedFontFamily) {
            return this.f20307g.equals(((LoadedFontFamily) obj).f20307g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20307g.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f20307g + ')';
    }
}
