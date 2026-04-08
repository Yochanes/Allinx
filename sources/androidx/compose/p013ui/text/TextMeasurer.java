package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/TextMeasurer;", "", "Companion", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TextMeasurer {

    /* JADX INFO: renamed from: a */
    public final FontFamily.Resolver f20111a;

    /* JADX INFO: renamed from: b */
    public final Density f20112b;

    /* JADX INFO: renamed from: c */
    public final LayoutDirection f20113c;

    /* JADX INFO: renamed from: d */
    public final TextLayoutCache f20114d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/TextMeasurer$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    public TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i) {
        this.f20111a = resolver;
        this.f20112b = density;
        this.f20113c = layoutDirection;
        this.f20114d = i > 0 ? new TextLayoutCache(i) : null;
    }
}
