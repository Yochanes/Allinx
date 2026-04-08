package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.google.android.material.textfield.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4021c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42511a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EndIconDelegate f42512b;

    public /* synthetic */ C4021c(EndIconDelegate endIconDelegate, int i) {
        this.f42511a = i;
        this.f42512b = endIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42511a) {
            case 0:
                ClearTextEndIconDelegate.m14735c((ClearTextEndIconDelegate) this.f42512b, valueAnimator);
                break;
            case 1:
                ClearTextEndIconDelegate.m14736d((ClearTextEndIconDelegate) this.f42512b, valueAnimator);
                break;
            default:
                DropdownMenuEndIconDelegate.m14740c((DropdownMenuEndIconDelegate) this.f42512b, valueAnimator);
                break;
        }
    }
}
