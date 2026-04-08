package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/compose/foundation/gestures/TransformEvent;", "", "TransformDelta", "TransformStarted", "TransformStopped", "Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;", "Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;", "Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
abstract class TransformEvent {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;", "Landroidx/compose/foundation/gestures/TransformEvent;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class TransformDelta extends TransformEvent {
        public TransformDelta(float f, float f2, long j) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;", "Landroidx/compose/foundation/gestures/TransformEvent;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class TransformStarted extends TransformEvent {

        /* JADX INFO: renamed from: a */
        public static final TransformStarted f6065a = new TransformStarted();
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;", "Landroidx/compose/foundation/gestures/TransformEvent;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class TransformStopped extends TransformEvent {

        /* JADX INFO: renamed from: a */
        public static final TransformStopped f6066a = new TransformStopped();
    }
}
