package coil.size;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import coil.size.Dimension;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, m18302d2 = {"Lcoil/size/ViewSizeResolver;", "Landroid/view/View;", "T", "Lcoil/size/SizeResolver;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public interface ViewSizeResolver<T extends View> extends SizeResolver {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: c */
    static Dimension m12514c(int i, int i2, int i3) {
        if (i == -2) {
            return Dimension.Undefined.f33942a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            return new Dimension.Pixels(i4);
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            return new Dimension.Pixels(i5);
        }
        return null;
    }

    @Override // coil.size.SizeResolver
    /* JADX INFO: renamed from: a */
    default Object mo12395a(Continuation continuation) {
        Size size = getSize();
        if (size != null) {
            return size;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.m18556b(continuation));
        cancellableContinuationImpl.m20534p();
        ViewTreeObserver viewTreeObserver = mo12512b().getViewTreeObserver();
        ViewSizeResolver$size$3$preDrawListener$1 viewSizeResolver$size$3$preDrawListener$1 = new ViewSizeResolver$size$3$preDrawListener$1(this, viewTreeObserver, cancellableContinuationImpl);
        viewTreeObserver.addOnPreDrawListener(viewSizeResolver$size$3$preDrawListener$1);
        cancellableContinuationImpl.m20536r(new ViewSizeResolver$size$3$1(this, viewTreeObserver, viewSizeResolver$size$3$preDrawListener$1));
        Object objM20533o = cancellableContinuationImpl.m20533o();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        return objM20533o;
    }

    /* JADX INFO: renamed from: b */
    View mo12512b();

    /* JADX INFO: renamed from: d */
    default void m12515d(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            mo12512b().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    /* JADX INFO: renamed from: e */
    default boolean mo12513e() {
        return true;
    }

    default Dimension getHeight() {
        ViewGroup.LayoutParams layoutParams = mo12512b().getLayoutParams();
        return m12514c(layoutParams != null ? layoutParams.height : -1, mo12512b().getHeight(), mo12513e() ? mo12512b().getPaddingBottom() + mo12512b().getPaddingTop() : 0);
    }

    default Size getSize() {
        Dimension height;
        Dimension width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new Size(width, height);
    }

    default Dimension getWidth() {
        ViewGroup.LayoutParams layoutParams = mo12512b().getLayoutParams();
        return m12514c(layoutParams != null ? layoutParams.width : -1, mo12512b().getWidth(), mo12513e() ? mo12512b().getPaddingRight() + mo12512b().getPaddingLeft() : 0);
    }
}
