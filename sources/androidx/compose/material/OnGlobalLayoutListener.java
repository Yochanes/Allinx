package androidx.compose.material;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material/OnGlobalLayoutListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class OnGlobalLayoutListener implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final View f10777a;

    /* JADX INFO: renamed from: b */
    public final Function0 f10778b;

    /* JADX INFO: renamed from: c */
    public boolean f10779c;

    public OnGlobalLayoutListener(View view, Function0 function0) {
        this.f10777a = view;
        this.f10778b = function0;
        view.addOnAttachStateChangeListener(this);
        if (this.f10779c || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f10779c = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f10778b.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f10779c) {
            return;
        }
        View view2 = this.f10777a;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f10779c = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f10779c) {
            this.f10777a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f10779c = false;
        }
    }
}
