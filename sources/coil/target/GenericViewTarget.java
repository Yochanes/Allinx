package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil.transition.TransitionTarget;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, m18302d2 = {"Lcoil/target/GenericViewTarget;", "Landroid/view/View;", "T", "Lcoil/target/ViewTarget;", "Lcoil/transition/TransitionTarget;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class GenericViewTarget<T extends View> implements ViewTarget<T>, TransitionTarget, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a */
    public boolean f33965a;

    @Override // coil.transition.TransitionTarget
    /* JADX INFO: renamed from: c */
    public abstract Drawable mo12399c();

    /* JADX INFO: renamed from: d */
    public abstract void mo12516d(Drawable drawable);

    /* JADX INFO: renamed from: e */
    public final void m12517e() {
        Object objMo12399c = mo12399c();
        Animatable animatable = objMo12399c instanceof Animatable ? (Animatable) objMo12399c : null;
        if (animatable == null) {
            return;
        }
        if (this.f33965a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12518f(Drawable drawable) {
        Object objMo12399c = mo12399c();
        Animatable animatable = objMo12399c instanceof Animatable ? (Animatable) objMo12399c : null;
        if (animatable != null) {
            animatable.stop();
        }
        mo12516d(drawable);
        m12517e();
    }

    @Override // coil.target.Target
    public final void onError(Drawable drawable) {
        m12518f(drawable);
    }

    @Override // coil.target.Target
    public final void onStart(Drawable drawable) {
        m12518f(drawable);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        this.f33965a = false;
        m12517e();
    }

    @Override // coil.target.Target
    public final void onSuccess(Drawable drawable) {
        m12518f(drawable);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.f33965a = true;
        m12517e();
    }
}
