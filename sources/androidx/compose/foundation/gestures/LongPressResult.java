package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/compose/foundation/gestures/LongPressResult;", "", "Canceled", "Released", "Success", "Landroidx/compose/foundation/gestures/LongPressResult$Canceled;", "Landroidx/compose/foundation/gestures/LongPressResult$Released;", "Landroidx/compose/foundation/gestures/LongPressResult$Success;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class LongPressResult {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/LongPressResult$Canceled;", "Landroidx/compose/foundation/gestures/LongPressResult;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Canceled extends LongPressResult {

        /* JADX INFO: renamed from: a */
        public static final Canceled f5753a = new Canceled();
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/LongPressResult$Released;", "Landroidx/compose/foundation/gestures/LongPressResult;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Released extends LongPressResult {

        /* JADX INFO: renamed from: a */
        public final PointerInputChange f5754a;

        public Released(PointerInputChange pointerInputChange) {
            this.f5754a = pointerInputChange;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/LongPressResult$Success;", "Landroidx/compose/foundation/gestures/LongPressResult;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Success extends LongPressResult {

        /* JADX INFO: renamed from: a */
        public static final Success f5755a = new Success();
    }
}
