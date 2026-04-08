package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/foundation/text/MenuItemsAvailability;", "", "Companion", "value", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class MenuItemsAvailability {

    /* JADX INFO: renamed from: a */
    public final int f8574a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m18302d2 = {"Landroidx/compose/foundation/text/MenuItemsAvailability$Companion;", "", "", "AUTO_FILL", "I", "COPY", "CUT", "NONE", "PASTE", "SELECT_ALL", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ MenuItemsAvailability(int i) {
        this.f8574a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MenuItemsAvailability) {
            return this.f8574a == ((MenuItemsAvailability) obj).f8574a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8574a);
    }

    public final String toString() {
        return "MenuItemsAvailability(value=" + this.f8574a + ')';
    }
}
