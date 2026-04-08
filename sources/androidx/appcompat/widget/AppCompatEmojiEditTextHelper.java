package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiEditTextHelper {

    /* JADX INFO: renamed from: a */
    public final EditText f1117a;

    /* JADX INFO: renamed from: b */
    public final EmojiEditTextHelper f1118b;

    public AppCompatEmojiEditTextHelper(EditText editText) {
        this.f1117a = editText;
        this.f1118b = new EmojiEditTextHelper(editText);
    }

    /* JADX INFO: renamed from: a */
    public final KeyListener m550a(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener) ? this.f1118b.m8832a(keyListener) : keyListener;
    }

    /* JADX INFO: renamed from: b */
    public final void m551b(AttributeSet attributeSet, int i) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes = this.f1117a.getContext().obtainStyledAttributes(attributeSet, R.styleable.f270i, i, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            this.f1118b.m8835d(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
