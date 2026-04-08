package androidx.emoji2.viewsintegration;

import android.text.Editable;
import androidx.emoji2.text.SpannableBuilder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class EmojiEditableFactory extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public static final Object f24382a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile Editable.Factory f24383b;

    /* JADX INFO: renamed from: c */
    public static Class f24384c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f24384c;
        return cls != null ? new SpannableBuilder(cls, charSequence) : super.newEditable(charSequence);
    }
}
