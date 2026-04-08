package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CheckScrollableContainerConstraintsKt {
    /* JADX INFO: renamed from: a */
    public static final void m2438a(long j, Orientation orientation) {
        if (orientation == Orientation.f5829a) {
            if (Constraints.m6616g(j) != Integer.MAX_VALUE) {
                return;
            }
            InlineClassHelperKt.m2707c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (Constraints.m6617h(j) != Integer.MAX_VALUE) {
                return;
            }
            InlineClassHelperKt.m2707c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }
}
