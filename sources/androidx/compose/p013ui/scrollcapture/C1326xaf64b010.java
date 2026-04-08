package androidx.compose.p013ui.scrollcapture;

import android.os.CancellationSignal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "cause", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class C1326xaf64b010 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CancellationSignal f19698a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326xaf64b010(CancellationSignal cancellationSignal) {
        super(1);
        this.f19698a = cancellationSignal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Throwable) obj) != null) {
            this.f19698a.cancel();
        }
        return Unit.f51459a;
    }
}
