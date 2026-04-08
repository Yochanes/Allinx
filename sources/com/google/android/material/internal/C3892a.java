package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.internal.MultiViewUpdateListener;

/* JADX INFO: renamed from: com.google.android.material.internal.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3892a implements MultiViewUpdateListener.Listener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42467a;

    public /* synthetic */ C3892a(int i) {
        this.f42467a = i;
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.Listener
    public final void onAnimationUpdate(ValueAnimator valueAnimator, View view) {
        switch (this.f42467a) {
            case 0:
                MultiViewUpdateListener.m14688d(valueAnimator, view);
                break;
            case 1:
                MultiViewUpdateListener.m14685a(valueAnimator, view);
                break;
            case 2:
                MultiViewUpdateListener.m14686b(valueAnimator, view);
                break;
            default:
                MultiViewUpdateListener.m14687c(valueAnimator, view);
                break;
        }
    }
}
