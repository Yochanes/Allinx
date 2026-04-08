package androidx.transition;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        m12001l(1);
        m11996f(new Fade(2));
        m11996f(new ChangeBounds());
        m11996f(new Fade(1));
    }
}
