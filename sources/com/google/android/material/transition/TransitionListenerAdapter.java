package com.google.android.material.transition;

import androidx.annotation.NonNull;
import androidx.transition.Transition;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
abstract class TransitionListenerAdapter implements Transition.TransitionListener {
    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionEnd(@NonNull Transition transition, boolean z2) {
        onTransitionEnd(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionStart(@NonNull Transition transition, boolean z2) {
        onTransitionStart(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }
}
