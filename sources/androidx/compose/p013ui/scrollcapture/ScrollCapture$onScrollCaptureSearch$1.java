package androidx.compose.p013ui.scrollcapture;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* synthetic */ class ScrollCapture$onScrollCaptureSearch$1 extends AdaptedFunctionReference implements Function1<ScrollCaptureCandidate, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((MutableVector) this.receiver).m4568b((ScrollCaptureCandidate) obj);
        return Unit.f51459a;
    }
}
