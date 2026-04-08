package androidx.compose.material3;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"androidx/compose/material3/ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ViewOnAttachStateChangeListenerC1020xa756564b implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public boolean f13405a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f13406b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function0 f13407c;

    public ViewOnAttachStateChangeListenerC1020xa756564b(View view, Function0 function0) {
        this.f13406b = view;
        this.f13407c = function0;
        view.addOnAttachStateChangeListener(this);
        if (this.f13405a || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f13405a = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f13407c.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f13405a) {
            return;
        }
        View view2 = this.f13406b;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f13405a = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f13405a) {
            this.f13406b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f13405a = false;
        }
    }
}
