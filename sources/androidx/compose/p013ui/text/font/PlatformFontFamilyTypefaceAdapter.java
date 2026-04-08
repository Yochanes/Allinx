package androidx.compose.p013ui.text.font;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {

    /* JADX INFO: renamed from: a */
    public final PlatformTypefaces f20308a;

    public PlatformFontFamilyTypefaceAdapter() {
        this.f20308a = Build.VERSION.SDK_INT >= 28 ? new PlatformTypefacesApi28() : new PlatformTypefacesApi();
    }
}
