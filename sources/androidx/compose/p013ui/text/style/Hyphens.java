package androidx.compose.p013ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/style/Hyphens;", "", "Companion", "value", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class Hyphens {

    /* JADX INFO: renamed from: a */
    public final int f20517a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/Hyphens$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ Hyphens(int i) {
        this.f20517a = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m6594a(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Hyphens) {
            return this.f20517a == ((Hyphens) obj).f20517a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20517a);
    }

    public final String toString() {
        return m6594a(this.f20517a);
    }
}
