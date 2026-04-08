package androidx.compose.p013ui.platform;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1", "Landroid/view/View$OnAttachStateChangeListener;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ViewOnAttachStateChangeListenerC1290xb3f1a111 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractComposeView f19538a;

    public ViewOnAttachStateChangeListenerC1290xb3f1a111(AbstractComposeView abstractComposeView) {
        this.f19538a = abstractComposeView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f19538a.disposeComposition();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
