package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TextFieldScrollerPosition {

    /* JADX INFO: renamed from: g */
    public static final SaverKt$Saver$1 f8688g = ListSaverKt.m4749a(TextFieldScrollerPosition$Companion$Saver$2.f8696a, TextFieldScrollerPosition$Companion$Saver$1.f8695a);

    /* JADX INFO: renamed from: a */
    public final MutableFloatState f8689a;

    /* JADX INFO: renamed from: b */
    public final MutableFloatState f8690b = PrimitiveSnapshotStateKt.m4404a(0.0f);

    /* JADX INFO: renamed from: c */
    public final MutableIntState f8691c = SnapshotIntStateKt.m4516a(0);

    /* JADX INFO: renamed from: d */
    public Rect f8692d = Rect.f17525e;

    /* JADX INFO: renamed from: e */
    public long f8693e = TextRange.f20115b;

    /* JADX INFO: renamed from: f */
    public final MutableState f8694f;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public TextFieldScrollerPosition(Orientation orientation, float f) {
        this.f8689a = PrimitiveSnapshotStateKt.m4404a(f);
        this.f8694f = SnapshotStateKt.m4524f(orientation, SnapshotStateKt.m4533o());
    }

    /* JADX INFO: renamed from: a */
    public final void m3261a(Orientation orientation, Rect rect, int i, int i2) {
        float f = i2 - i;
        ((SnapshotMutableFloatStateImpl) this.f8690b).mo4391n(f);
        Rect rect2 = this.f8692d;
        float f2 = rect2.f17526a;
        float f3 = rect.f17526a;
        MutableFloatState mutableFloatState = this.f8689a;
        float f4 = rect.f17527b;
        if (f3 != f2 || f4 != rect2.f17527b) {
            boolean z2 = orientation == Orientation.f5829a;
            if (z2) {
                f3 = f4;
            }
            float f5 = z2 ? rect.f17529d : rect.f17528c;
            SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = (SnapshotMutableFloatStateImpl) mutableFloatState;
            float fMo4376c = snapshotMutableFloatStateImpl.mo4376c();
            float f6 = i;
            float f7 = fMo4376c + f6;
            ((SnapshotMutableFloatStateImpl) mutableFloatState).mo4391n(snapshotMutableFloatStateImpl.mo4376c() + ((f5 <= f7 && (f3 >= fMo4376c || f5 - f3 <= f6)) ? (f3 >= fMo4376c || f5 - f3 > f6) ? 0.0f : f3 - fMo4376c : f5 - f7));
            this.f8692d = rect;
        }
        ((SnapshotMutableFloatStateImpl) mutableFloatState).mo4391n(RangesKt.m18655b(((SnapshotMutableFloatStateImpl) mutableFloatState).mo4376c(), 0.0f, f));
        ((SnapshotMutableIntStateImpl) this.f8691c).mo4393q(i);
    }
}
