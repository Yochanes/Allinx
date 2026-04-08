package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState;", "", "Status", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ContextMenuState {

    /* JADX INFO: renamed from: a */
    public final MutableState f5258a = SnapshotStateKt.m4525g(Status.Closed.f5259a);

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "", "Closed", "Open", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Closed;", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static abstract class Status {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Closed;", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class Closed extends Status {

            /* JADX INFO: renamed from: a */
            public static final Closed f5259a = new Closed();

            public final String toString() {
                return "Closed";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open;", "Landroidx/compose/foundation/contextmenu/ContextMenuState$Status;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
        @SourceDebugExtension
        public static final class Open extends Status {

            /* JADX INFO: renamed from: a */
            public final long f5260a;

            public Open(long j) {
                this.f5260a = j;
                if ((j & 9223372034707292159L) != 9205357640488583168L) {
                    return;
                }
                InlineClassHelperKt.m2707c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Open)) {
                    return false;
                }
                return Offset.m5053c(this.f5260a, ((Open) obj).f5260a);
            }

            public final int hashCode() {
                return Long.hashCode(this.f5260a);
            }

            public final String toString() {
                return "Open(offset=" + ((Object) Offset.m5060j(this.f5260a)) + ')';
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextMenuState) {
            return Intrinsics.m18594b((Status) ((SnapshotMutableStateImpl) ((ContextMenuState) obj).f5258a).getF20325a(), (Status) ((SnapshotMutableStateImpl) this.f5258a).getF20325a());
        }
        return false;
    }

    public final int hashCode() {
        return ((Status) ((SnapshotMutableStateImpl) this.f5258a).getF20325a()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((Status) ((SnapshotMutableStateImpl) this.f5258a).getF20325a()) + ')';
    }
}
