package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CircularPropagation extends VisibilityPropagation {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    @Override // androidx.transition.TransitionPropagation
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo11964b(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        int iRound;
        int iCenterX;
        Integer num;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        if (transitionValues2 == null) {
            i = -1;
        } else {
            if (((transitionValues == null || (num = (Integer) transitionValues.f32281a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) != 0) {
                transitionValues = transitionValues2;
                i = 1;
            }
        }
        int iM12026c = VisibilityPropagation.m12026c(transitionValues, 0);
        int iM12026c2 = VisibilityPropagation.m12026c(transitionValues, 1);
        Rect epicenter = transition.getEpicenter();
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iRound = epicenter.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int iRound2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + r6[0]);
            iRound = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + r6[1]);
            iCenterX = iRound2;
        }
        float f = iCenterX - iM12026c;
        float f2 = iRound - iM12026c2;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float fSqrt2 = fSqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long duration = transition.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * ((long) i)) / 0.0f) * fSqrt2);
    }
}
