package coil.size;

import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final class ViewSizeResolver$size$3$1 implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewSizeResolver f33958a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserver f33959b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewSizeResolver$size$3$preDrawListener$1 f33960c;

    public ViewSizeResolver$size$3$1(ViewSizeResolver viewSizeResolver, ViewTreeObserver viewTreeObserver, ViewSizeResolver$size$3$preDrawListener$1 viewSizeResolver$size$3$preDrawListener$1) {
        this.f33958a = viewSizeResolver;
        this.f33959b = viewTreeObserver;
        this.f33960c = viewSizeResolver$size$3$preDrawListener$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f33958a.m12515d(this.f33959b, this.f33960c);
        return Unit.f51459a;
    }
}
