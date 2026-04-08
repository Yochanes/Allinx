package androidx.compose.p013ui.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout;", "", "BeyondBoundsScope", "LayoutDirection", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface BeyondBoundsLayout {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface BeyondBoundsScope {
        /* JADX INFO: renamed from: a */
        boolean mo3032a();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "", "Companion", "value", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @JvmInline
    public static final class LayoutDirection {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection$Companion;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof LayoutDirection)) {
                return false;
            }
            ((LayoutDirection) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "invalid LayoutDirection";
        }
    }

    /* JADX INFO: renamed from: g0 */
    Object mo3031g0(Function1 function1, int i);
}
