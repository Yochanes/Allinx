package androidx.compose.p013ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontSynthesis;", "", "Companion", "value", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class FontSynthesis {

    /* JADX INFO: renamed from: a */
    public final int f20291a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/font/FontSynthesis$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ FontSynthesis(int i) {
        this.f20291a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FontSynthesis) {
            return this.f20291a == ((FontSynthesis) obj).f20291a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20291a);
    }

    public final String toString() {
        int i = this.f20291a;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? "All" : "Invalid";
    }
}
