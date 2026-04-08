package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
final class EmojiInputConnection extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final EditText f24385a;

    /* JADX INFO: renamed from: b */
    public final EmojiCompatDeleteHelper f24386b;

    /* JADX INFO: compiled from: Proguard */
    public static class EmojiCompatDeleteHelper {
    }

    public EmojiInputConnection(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        EmojiCompatDeleteHelper emojiCompatDeleteHelper = new EmojiCompatDeleteHelper();
        super(inputConnection, false);
        this.f24385a = editText;
        this.f24386b = emojiCompatDeleteHelper;
        if (EmojiCompat.m8785g()) {
            EmojiCompat.m8782a().m8793l(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f24385a.getEditableText();
        this.f24386b.getClass();
        return EmojiCompat.m8783e(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f24385a.getEditableText();
        this.f24386b.getClass();
        return EmojiCompat.m8783e(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
