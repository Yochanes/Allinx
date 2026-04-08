package androidx.appcompat.text;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class AllCapsTransformationMethod implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public Locale f656a;

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f656a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i, Rect rect) {
    }
}
