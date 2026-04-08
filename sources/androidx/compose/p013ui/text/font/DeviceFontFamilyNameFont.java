package androidx.compose.p013ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyNameFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DeviceFontFamilyNameFont extends AndroidFont {
    @Override // androidx.compose.p013ui.text.font.Font
    /* JADX INFO: renamed from: b */
    public final int mo6510b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        deviceFontFamilyNameFont.getClass();
        if (!Intrinsics.m18594b(null, null)) {
            return false;
        }
        deviceFontFamilyNameFont.getClass();
        deviceFontFamilyNameFont.getClass();
        deviceFontFamilyNameFont.getClass();
        return true;
    }

    @Override // androidx.compose.p013ui.text.font.Font
    public final FontWeight getWeight() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "Font(familyName=\"DeviceFontFamilyName(name=null)\", weight=null, style=" + ((Object) FontStyle.m6520a(0)) + ')';
    }
}
