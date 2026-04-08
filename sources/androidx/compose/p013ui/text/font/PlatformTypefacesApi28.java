package androidx.compose.p013ui.text.font;

import android.graphics.Typeface;
import androidx.activity.AbstractC0050i;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/PlatformTypefacesApi28;", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@VisibleForTesting
final class PlatformTypefacesApi28 implements PlatformTypefaces {
    /* JADX INFO: renamed from: c */
    public static Typeface m6529c(String str, FontWeight fontWeight, int i) {
        if (i == 0 && Intrinsics.m18594b(fontWeight, FontWeight.f20298i) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return AbstractC0050i.m198c(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), fontWeight.f20303a, i == 1);
    }

    @Override // androidx.compose.p013ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: a */
    public final Typeface mo6526a(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i) {
        return m6529c(genericFontFamily.f20305g, fontWeight, i);
    }

    @Override // androidx.compose.p013ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: b */
    public final Typeface mo6527b(FontWeight fontWeight, int i) {
        return m6529c(null, fontWeight, i);
    }
}
