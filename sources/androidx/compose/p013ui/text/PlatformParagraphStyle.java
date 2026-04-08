package androidx.compose.p013ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle;", "", "Companion", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PlatformParagraphStyle {

    /* JADX INFO: renamed from: b */
    public static final PlatformParagraphStyle f19979b = new PlatformParagraphStyle(false);

    /* JADX INFO: renamed from: a */
    public final boolean f19980a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public PlatformParagraphStyle() {
        this.f19980a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlatformParagraphStyle) {
            return this.f19980a == ((PlatformParagraphStyle) obj).f19980a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f19980a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f19980a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public PlatformParagraphStyle(boolean z2) {
        this.f19980a = z2;
    }
}
