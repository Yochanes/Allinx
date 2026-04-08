package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/interaction/DragInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Cancel", "Start", "Stop", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface DragInteraction extends Interaction {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Cancel;", "Landroidx/compose/foundation/interaction/DragInteraction;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Cancel implements DragInteraction {

        /* JADX INFO: renamed from: a */
        public final Start f6198a;

        public Cancel(Start start) {
            this.f6198a = start;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Start;", "Landroidx/compose/foundation/interaction/DragInteraction;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Start implements DragInteraction {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Stop;", "Landroidx/compose/foundation/interaction/DragInteraction;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Stop implements DragInteraction {

        /* JADX INFO: renamed from: a */
        public final Start f6199a;

        public Stop(Start start) {
            this.f6199a = start;
        }
    }
}
