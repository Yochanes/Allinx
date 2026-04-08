package androidx.compose.p013ui.text.style;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/text/style/TextMotion;", "", "Companion", "Linearity", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextMotion {

    /* JADX INFO: renamed from: c */
    public static final TextMotion f20547c = new TextMotion(2, false);

    /* JADX INFO: renamed from: d */
    public static final TextMotion f20548d = new TextMotion(1, true);

    /* JADX INFO: renamed from: a */
    public final int f20549a;

    /* JADX INFO: renamed from: b */
    public final boolean f20550b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/TextMotion$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity;", "", "Companion", "value", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @JvmInline
    public static final class Linearity {

        /* JADX INFO: renamed from: a */
        public final int f20551a;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public /* synthetic */ Linearity(int i) {
            this.f20551a = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Linearity) {
                return this.f20551a == ((Linearity) obj).f20551a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f20551a);
        }

        public final String toString() {
            int i = this.f20551a;
            return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
        }
    }

    public TextMotion(int i, boolean z2) {
        this.f20549a = i;
        this.f20550b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        return this.f20549a == textMotion.f20549a && this.f20550b == textMotion.f20550b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20550b) + (Integer.hashCode(this.f20549a) * 31);
    }

    public final String toString() {
        return equals(f20547c) ? "TextMotion.Static" : equals(f20548d) ? "TextMotion.Animated" : "Invalid";
    }
}
