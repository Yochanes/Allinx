package androidx.compose.p013ui.platform;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FocusFinderCompat_androidKt {
    /* JADX INFO: renamed from: a */
    public static final View m6145a(View view, Function1 function1, View view2) {
        View viewM6145a;
        if (((Boolean) function1.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (viewM6145a = m6145a(childAt, function1, view2)) != null) {
                return viewM6145a;
            }
        }
        return null;
    }
}
