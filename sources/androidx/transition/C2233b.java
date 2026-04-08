package androidx.transition;

import androidx.transition.Transition;

/* JADX INFO: renamed from: androidx.transition.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2233b implements Transition.TransitionNotification {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f32324f;

    public /* synthetic */ C2233b(int i) {
        this.f32324f = i;
    }

    @Override // androidx.transition.Transition.TransitionNotification
    /* JADX INFO: renamed from: a */
    public final void mo11991a(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
        switch (this.f32324f) {
            case 0:
                transitionListener.onTransitionStart(transition, z2);
                break;
            case 1:
                transitionListener.onTransitionEnd(transition, z2);
                break;
            case 2:
                transitionListener.onTransitionCancel(transition);
                break;
            case 3:
                transitionListener.onTransitionPause(transition);
                break;
            default:
                transitionListener.onTransitionResume(transition);
                break;
        }
    }
}
