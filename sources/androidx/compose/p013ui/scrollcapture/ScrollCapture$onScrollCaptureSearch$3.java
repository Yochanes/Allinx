package androidx.compose.p013ui.scrollcapture;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/scrollcapture/ScrollCaptureCandidate;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ScrollCapture$onScrollCaptureSearch$3 extends Lambda implements Function1<ScrollCaptureCandidate, Comparable<?>> {

    /* JADX INFO: renamed from: a */
    public static final ScrollCapture$onScrollCaptureSearch$3 f19709a = new ScrollCapture$onScrollCaptureSearch$3(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.valueOf(((ScrollCaptureCandidate) obj).f19712c.m6659b());
    }
}
