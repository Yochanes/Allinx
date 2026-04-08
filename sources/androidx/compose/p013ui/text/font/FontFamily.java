package androidx.compose.p013ui.text.font;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontFamily;", "", "Companion", "Resolver", "Landroidx/compose/ui/text/font/FileBasedFontFamily;", "Landroidx/compose/ui/text/font/LoadedFontFamily;", "Landroidx/compose/ui/text/font/SystemFontFamily;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class FontFamily {

    /* JADX INFO: renamed from: a */
    public static final DefaultFontFamily f20262a = new DefaultFontFamily();

    /* JADX INFO: renamed from: b */
    public static final GenericFontFamily f20263b = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");

    /* JADX INFO: renamed from: c */
    public static final GenericFontFamily f20264c = new GenericFontFamily("serif", "FontFamily.Serif");

    /* JADX INFO: renamed from: d */
    public static final GenericFontFamily f20265d = new GenericFontFamily("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: f */
    public static final GenericFontFamily f20266f = new GenericFontFamily("cursive", "FontFamily.Cursive");

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontFamily$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontFamily$Resolver;", "", "Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface Resolver {
        /* JADX INFO: renamed from: a */
        TypefaceResult mo6515a(FontFamily fontFamily, FontWeight fontWeight, int i, int i2);
    }
}
