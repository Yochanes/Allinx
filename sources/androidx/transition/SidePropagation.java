package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class SidePropagation extends VisibilityPropagation {
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    @Override // androidx.transition.TransitionPropagation
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo11964b(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        Integer num;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        Rect epicenter = transition.getEpicenter();
        if (transitionValues2 == null) {
            i = -1;
        } else {
            if (((transitionValues == null || (num = (Integer) transitionValues.f32281a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) != 0) {
                transitionValues = transitionValues2;
                i = 1;
            }
        }
        VisibilityPropagation.m12026c(transitionValues, 0);
        VisibilityPropagation.m12026c(transitionValues, 1);
        viewGroup.getLocationOnScreen(new int[2]);
        Math.round(viewGroup.getTranslationX());
        Math.round(viewGroup.getTranslationY());
        viewGroup.getWidth();
        viewGroup.getHeight();
        if (epicenter != null) {
            epicenter.centerX();
            epicenter.centerY();
        }
        float height = 0 / viewGroup.getHeight();
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * ((long) i)) / 0.0f) * height);
    }
}
