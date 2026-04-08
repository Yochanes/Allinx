package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
class EmojiTransformationMethod implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    public final TransformationMethod f24401a;

    public EmojiTransformationMethod(TransformationMethod transformationMethod) {
        this.f24401a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f24401a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || EmojiCompat.m8782a().m8788d() != 1) {
            return charSequence;
        }
        EmojiCompat emojiCompatM8782a = EmojiCompat.m8782a();
        emojiCompatM8782a.getClass();
        return emojiCompatM8782a.m8791j(charSequence, 0, charSequence.length(), 0);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f24401a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i, rect);
        }
    }
}
