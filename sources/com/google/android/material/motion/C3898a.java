package com.google.android.material.motion;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.navigation.DrawerLayoutUtils;

/* JADX INFO: renamed from: com.google.android.material.motion.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3898a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42468a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f42469b;

    public /* synthetic */ C3898a(ViewGroup viewGroup, int i) {
        this.f42468a = i;
        this.f42469b = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42468a) {
            case 0:
                MaterialMainContainerBackHelper.m14691a((ClippableRoundedCornerLayout) this.f42469b, valueAnimator);
                break;
            default:
                DrawerLayoutUtils.m14692a((DrawerLayout) this.f42469b, valueAnimator);
                break;
        }
    }
}
