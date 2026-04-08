package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingMethods;
import com.google.protobuf.Field;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@BindingMethods
@RestrictTo
public class ViewBindingAdapter {

    /* JADX INFO: compiled from: Proguard */
    @TargetApi(Field.Kind.TYPE_BYTES_VALUE)
    public interface OnViewAttachedToWindow {
    }

    /* JADX INFO: compiled from: Proguard */
    @TargetApi(Field.Kind.TYPE_BYTES_VALUE)
    public interface OnViewDetachedFromWindow {
    }

    /* JADX INFO: renamed from: androidx.databinding.adapters.ViewBindingAdapter$1 */
    /* JADX INFO: compiled from: Proguard */
    class ViewOnAttachStateChangeListenerC15251 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
