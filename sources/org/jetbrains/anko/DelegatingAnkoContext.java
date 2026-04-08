package org.jetbrains.anko;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lorg/jetbrains/anko/DelegatingAnkoContext;", "Landroid/view/ViewGroup;", "T", "Lorg/jetbrains/anko/AnkoContext;", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class DelegatingAnkoContext<T extends ViewGroup> implements AnkoContext<T> {
    @Override // android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            return;
        }
        layoutParams.getClass();
        throw null;
    }

    @Override // android.view.ViewManager
    public final void removeView(View view) {
        Intrinsics.m18600h(view, "view");
        throw new UnsupportedOperationException();
    }

    @Override // android.view.ViewManager
    public final void updateViewLayout(View view, ViewGroup.LayoutParams params) {
        Intrinsics.m18600h(view, "view");
        Intrinsics.m18600h(params, "params");
        throw new UnsupportedOperationException();
    }
}
