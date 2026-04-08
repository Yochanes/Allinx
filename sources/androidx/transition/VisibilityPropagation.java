package androidx.transition;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class VisibilityPropagation extends TransitionPropagation {

    /* JADX INFO: renamed from: a */
    public static final String[] f32322a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* JADX INFO: renamed from: c */
    public static int m12026c(TransitionValues transitionValues, int i) {
        int[] iArr;
        if (transitionValues == null || (iArr = (int[]) transitionValues.f32281a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // androidx.transition.TransitionPropagation
    /* JADX INFO: renamed from: a */
    public final void mo11995a(TransitionValues transitionValues) {
        View view = transitionValues.f32282b;
        HashMap map = transitionValues.f32281a;
        Integer numValueOf = (Integer) map.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        map.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = (view.getWidth() / 2) + iRound;
        int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = iRound2;
        iArr[1] = (view.getHeight() / 2) + iRound2;
        map.put("android:visibilityPropagation:center", iArr);
    }
}
