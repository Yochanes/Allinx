package androidx.compose.p013ui.text.font;

import android.graphics.Typeface;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@VisibleForTesting
final class PlatformTypefacesApi implements PlatformTypefaces {
    /* JADX INFO: renamed from: c */
    public static Typeface m6528c(String str, FontWeight fontWeight, int i) {
        if (i == 0 && Intrinsics.m18594b(fontWeight, FontWeight.f20298i) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM6509a = AndroidFontUtils_androidKt.m6509a(fontWeight, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM6509a) : Typeface.create(str, iM6509a);
    }

    @Override // androidx.compose.p013ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: a */
    public final Typeface mo6526a(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i) {
        String strConcat = genericFontFamily.f20305g;
        int i2 = fontWeight.f20303a / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceM6528c = m6528c(strConcat, fontWeight, i);
            if (!Intrinsics.m18594b(typefaceM6528c, Typeface.create(Typeface.DEFAULT, AndroidFontUtils_androidKt.m6509a(fontWeight, i))) && !Intrinsics.m18594b(typefaceM6528c, m6528c(null, fontWeight, i))) {
                typeface = typefaceM6528c;
            }
        }
        return typeface == null ? m6528c(genericFontFamily.f20305g, fontWeight, i) : typeface;
    }

    @Override // androidx.compose.p013ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: b */
    public final Typeface mo6527b(FontWeight fontWeight, int i) {
        return m6528c(null, fontWeight, i);
    }
}
