package coil.size;

import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"coil/size/ViewSizeResolver$size$3$preDrawListener$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ViewSizeResolver$size$3$preDrawListener$1 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public boolean f33961a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewSizeResolver f33962b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewTreeObserver f33963c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CancellableContinuationImpl f33964d;

    public ViewSizeResolver$size$3$preDrawListener$1(ViewSizeResolver viewSizeResolver, ViewTreeObserver viewTreeObserver, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f33962b = viewSizeResolver;
        this.f33963c = viewTreeObserver;
        this.f33964d = cancellableContinuationImpl;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewSizeResolver viewSizeResolver = this.f33962b;
        Size size = viewSizeResolver.getSize();
        if (size != null) {
            viewSizeResolver.m12515d(this.f33963c, this);
            if (!this.f33961a) {
                this.f33961a = true;
                this.f33964d.resumeWith(size);
            }
        }
        return true;
    }
}
