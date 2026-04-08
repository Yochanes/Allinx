package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Landroidx/compose/foundation/gestures/DragEvent;", "", "DragCancelled", "DragDelta", "DragStarted", "DragStopped", "Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class DragEvent {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;", "Landroidx/compose/foundation/gestures/DragEvent;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DragCancelled extends DragEvent {

        /* JADX INFO: renamed from: a */
        public static final DragCancelled f5504a = new DragCancelled();
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Landroidx/compose/foundation/gestures/DragEvent;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DragDelta extends DragEvent {

        /* JADX INFO: renamed from: a */
        public final long f5505a;

        public DragDelta(long j) {
            this.f5505a = j;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "Landroidx/compose/foundation/gestures/DragEvent;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DragStarted extends DragEvent {

        /* JADX INFO: renamed from: a */
        public final long f5506a;

        public DragStarted(long j) {
            this.f5506a = j;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "Landroidx/compose/foundation/gestures/DragEvent;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DragStopped extends DragEvent {

        /* JADX INFO: renamed from: a */
        public final long f5507a;

        public DragStopped(long j) {
            this.f5507a = j;
        }
    }
}
