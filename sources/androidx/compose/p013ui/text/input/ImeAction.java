package androidx.compose.p013ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/input/ImeAction;", "", "Companion", "value", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class ImeAction {

    /* JADX INFO: renamed from: a */
    public final int f20366a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/input/ImeAction$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ ImeAction(int i) {
        this.f20366a = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m6547a(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Default" : i == 2 ? "Go" : i == 3 ? "Search" : i == 4 ? "Send" : i == 5 ? "Previous" : i == 6 ? "Next" : i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ImeAction) {
            return this.f20366a == ((ImeAction) obj).f20366a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20366a);
    }

    public final String toString() {
        return m6547a(this.f20366a);
    }
}
