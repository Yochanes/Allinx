package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiTextHelper {

    /* JADX INFO: renamed from: a */
    public final TextView f1119a;

    /* JADX INFO: renamed from: b */
    public final EmojiTextViewHelper f1120b;

    public AppCompatEmojiTextHelper(TextView textView) {
        this.f1119a = textView;
        this.f1120b = new EmojiTextViewHelper(textView);
    }

    /* JADX INFO: renamed from: a */
    public final void m552a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f1119a.getContext().obtainStyledAttributes(attributeSet, R.styleable.f270i, i, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m554c(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m553b(boolean z2) {
        this.f1120b.m8838c(z2);
    }

    /* JADX INFO: renamed from: c */
    public final void m554c(boolean z2) {
        this.f1120b.m8839d(z2);
    }
}
