package androidx.core.view;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 176)
public final class ViewKt$doOnNextLayout$1 implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        throw null;
    }
}
