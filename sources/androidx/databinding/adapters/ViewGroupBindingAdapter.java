package androidx.databinding.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethods;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@BindingMethods
@RestrictTo
public class ViewGroupBindingAdapter {

    /* JADX INFO: compiled from: Proguard */
    public interface OnAnimationEnd {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnAnimationRepeat {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnAnimationStart {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnChildViewAdded {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnChildViewRemoved {
    }

    /* JADX INFO: renamed from: androidx.databinding.adapters.ViewGroupBindingAdapter$2 */
    /* JADX INFO: compiled from: Proguard */
    class AnimationAnimationListenerC15272 implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.databinding.adapters.ViewGroupBindingAdapter$1 */
    /* JADX INFO: compiled from: Proguard */
    class ViewGroupOnHierarchyChangeListenerC15261 implements ViewGroup.OnHierarchyChangeListener {
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
        }
    }
}
