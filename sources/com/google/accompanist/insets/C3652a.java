package com.google.accompanist.insets;

import androidx.dynamicanimation.animation.DynamicAnimation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.google.accompanist.insets.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3652a implements DynamicAnimation.OnAnimationEndListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SimpleImeAnimationController f42343a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f42344b;

    public /* synthetic */ C3652a(SimpleImeAnimationController simpleImeAnimationController, Function1 function1) {
        this.f42343a = simpleImeAnimationController;
        this.f42344b = function1;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
    /* JADX INFO: renamed from: a */
    public final void mo8766a(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        SimpleImeAnimationController.m14404a(this.f42343a, this.f42344b, dynamicAnimation, z2, f, f2);
    }
}
