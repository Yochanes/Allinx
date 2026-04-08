package androidx.compose.p013ui.platform;

import androidx.compose.material3.internal.C1168a;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ViewCompositionStrategy_androidKt$installForLifecycle$2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lifecycle f19549a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1168a f19550b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy_androidKt$installForLifecycle$2(Lifecycle lifecycle, C1168a c1168a) {
        super(0);
        this.f19549a = lifecycle;
        this.f19550b = c1168a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f19549a.mo9125c(this.f19550b);
        return Unit.f51459a;
    }
}
