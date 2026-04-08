package org.jetbrains.anko;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lorg/jetbrains/anko/AnkoContextImpl;", "T", "Lorg/jetbrains/anko/AnkoContext;", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
public class AnkoContextImpl<T> implements AnkoContext<T> {

    /* JADX INFO: renamed from: a */
    public View f58162a;

    /* JADX INFO: renamed from: a */
    public void mo21783a() {
        throw new IllegalStateException("View is already set: " + this.f58162a);
    }

    @Override // android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view == null) {
            return;
        }
        mo21783a();
        this.f58162a = view;
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
