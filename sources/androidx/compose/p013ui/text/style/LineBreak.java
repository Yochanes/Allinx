package androidx.compose.p013ui.text.style;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u00020\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineBreak;", "", "Companion", "Strategy", "Strictness", "WordBreak", "mask", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class LineBreak {

    /* JADX INFO: renamed from: b */
    public static final int f20518b = 66305;

    /* JADX INFO: renamed from: a */
    public final int f20519a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineBreak$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy;", "", "Companion", "value", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @JvmInline
    public static final class Strategy {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Strategy)) {
                return false;
            }
            ((Strategy) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "Strategy.Unspecified";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness;", "", "Companion", "value", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @JvmInline
    public static final class Strictness {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class Companion {
        }

        /* JADX INFO: renamed from: a */
        public static String m6596a(int i) {
            return i == 1 ? "Strictness.None" : i == 2 ? "Strictness.Loose" : i == 3 ? "Strictness.Normal" : i == 4 ? "Strictness.Strict" : i == 0 ? "Strictness.Unspecified" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Strictness)) {
                return false;
            }
            ((Strictness) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return m6596a(0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "", "Companion", "value", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @JvmInline
    public static final class WordBreak {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WordBreak)) {
                return false;
            }
            ((WordBreak) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "WordBreak.Unspecified";
        }
    }

    public /* synthetic */ LineBreak(int i) {
        this.f20519a = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m6595a(int i) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i2 = i & 255;
        String str = "Invalid";
        sb.append((Object) (i2 == 1 ? "Strategy.Simple" : i2 == 2 ? "Strategy.HighQuality" : i2 == 3 ? "Strategy.Balanced" : i2 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        sb.append((Object) Strictness.m6596a((i >> 8) & 255));
        sb.append(", wordBreak=");
        int i3 = (i >> 16) & 255;
        if (i3 == 1) {
            str = "WordBreak.None";
        } else if (i3 == 2) {
            str = "WordBreak.Phrase";
        } else if (i3 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LineBreak) {
            return this.f20519a == ((LineBreak) obj).f20519a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20519a);
    }

    public final String toString() {
        return m6595a(this.f20519a);
    }
}
