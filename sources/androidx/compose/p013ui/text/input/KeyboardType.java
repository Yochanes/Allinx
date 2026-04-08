package androidx.compose.p013ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/input/KeyboardType;", "", "Companion", "value", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class KeyboardType {

    /* JADX INFO: renamed from: a */
    public final int f20380a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/input/KeyboardType$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ KeyboardType(int i) {
        this.f20380a = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m6551a(int i) {
        return i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KeyboardType) {
            return this.f20380a == ((KeyboardType) obj).f20380a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20380a);
    }

    public final String toString() {
        return m6551a(this.f20380a);
    }
}
