package androidx.compose.p013ui.text.style;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "Alignment", "Companion", "Mode", "Trim", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class LineHeightStyle {

    /* JADX INFO: renamed from: c */
    public static final LineHeightStyle f20520c = new LineHeightStyle(Alignment.f20524c, 17);

    /* JADX INFO: renamed from: a */
    public final float f20521a;

    /* JADX INFO: renamed from: b */
    public final int f20522b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "Companion", "topRatio", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @JvmInline
    @SourceDebugExtension
    public static final class Alignment {

        /* JADX INFO: renamed from: b */
        public static final float f20523b;

        /* JADX INFO: renamed from: c */
        public static final float f20524c;

        /* JADX INFO: renamed from: d */
        public static final float f20525d;

        /* JADX INFO: renamed from: a */
        public final float f20526a;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class Companion {
        }

        static {
            m6597a(0.0f);
            m6597a(0.5f);
            f20523b = 0.5f;
            m6597a(-1.0f);
            f20524c = -1.0f;
            m6597a(1.0f);
            f20525d = 1.0f;
        }

        public /* synthetic */ Alignment(float f) {
            this.f20526a = f;
        }

        /* JADX INFO: renamed from: a */
        public static void m6597a(float f) {
            if ((0.0f > f || f > 1.0f) && f != -1.0f) {
                InlineClassHelperKt.m6569c("topRatio should be in [0..1] range or -1");
            }
        }

        /* JADX INFO: renamed from: b */
        public static String m6598b(float f) {
            if (f == 0.0f) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f == f20523b) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f == f20524c) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f == f20525d) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Alignment) {
                return Float.compare(this.f20526a, ((Alignment) obj).f20526a) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f20526a);
        }

        public final String toString() {
            return m6598b(this.f20526a);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "", "Companion", "value", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @JvmInline
    public static final class Mode {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Mode$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Mode)) {
                return false;
            }
            ((Mode) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "Mode(value=0)";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", "Companion", "value", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @JvmInline
    public static final class Trim {

        /* JADX INFO: renamed from: a */
        public final int f20527a;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "", "FlagTrimBottom", "I", "FlagTrimTop", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public /* synthetic */ Trim(int i) {
            this.f20527a = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Trim) {
                return this.f20527a == ((Trim) obj).f20527a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f20527a);
        }

        public final String toString() {
            int i = this.f20527a;
            return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
    }

    public LineHeightStyle(float f, int i) {
        this.f20521a = f;
        this.f20522b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        float f = lineHeightStyle.f20521a;
        float f2 = Alignment.f20523b;
        return Float.compare(this.f20521a, f) == 0 && this.f20522b == lineHeightStyle.f20522b;
    }

    public final int hashCode() {
        float f = Alignment.f20523b;
        return Integer.hashCode(0) + AbstractC0455a.m2228c(this.f20522b, Float.hashCode(this.f20521a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) Alignment.m6598b(this.f20521a));
        sb.append(", trim=");
        int i = this.f20522b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
