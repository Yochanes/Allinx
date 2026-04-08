package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class AppCompatHintHelper {
    /* JADX INFO: renamed from: a */
    public static void m555a(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof WithHint) {
                editorInfo.hintText = ((WithHint) parent).m742a();
                return;
            }
        }
    }
}
