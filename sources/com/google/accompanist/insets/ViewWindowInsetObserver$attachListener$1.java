package com.google.accompanist.insets;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m18302d2 = {"com/google/accompanist/insets/ViewWindowInsetObserver$attachListener$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ViewWindowInsetObserver$attachListener$1 implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v) {
        Intrinsics.m18599g(v, "v");
        v.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v) {
        Intrinsics.m18599g(v, "v");
    }
}
