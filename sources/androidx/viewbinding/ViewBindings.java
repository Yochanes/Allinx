package androidx.viewbinding;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ViewBindings {
    /* JADX INFO: renamed from: a */
    public static View m12059a(int i, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }
}
