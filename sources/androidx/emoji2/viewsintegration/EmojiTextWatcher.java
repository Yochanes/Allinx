package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
final class EmojiTextWatcher implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f24397a;

    /* JADX INFO: renamed from: b */
    public EmojiCompat.InitCallback f24398b;

    /* JADX INFO: renamed from: c */
    public boolean f24399c = true;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @RestrictTo
    public static class InitCallbackImpl extends EmojiCompat.InitCallback implements Runnable {

        /* JADX INFO: renamed from: a */
        public final WeakReference f24400a;

        public InitCallbackImpl(EditText editText) {
            this.f24400a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        /* JADX INFO: renamed from: b */
        public final void mo696b() {
            Handler handler;
            EditText editText = (EditText) this.f24400a.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            EmojiTextWatcher.m8846a((EditText) this.f24400a.get(), 1);
        }
    }

    public EmojiTextWatcher(EditText editText) {
        this.f24397a = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m8846a(EditText editText, int i) throws Throwable {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat emojiCompatM8782a = EmojiCompat.m8782a();
            if (editableText == null) {
                length = 0;
            } else {
                emojiCompatM8782a.getClass();
                length = editableText.length();
            }
            emojiCompatM8782a.m8791j(editableText, 0, length, 0);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.f24397a;
        if (!editText.isInEditMode() && this.f24399c && EmojiCompat.m8785g() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iM8788d = EmojiCompat.m8782a().m8788d();
            if (iM8788d != 0) {
                if (iM8788d == 1) {
                    EmojiCompat.m8782a().m8791j((Spannable) charSequence, i, i3 + i, 0);
                    return;
                } else if (iM8788d != 3) {
                    return;
                }
            }
            EmojiCompat emojiCompatM8782a = EmojiCompat.m8782a();
            if (this.f24398b == null) {
                this.f24398b = new InitCallbackImpl(editText);
            }
            emojiCompatM8782a.m8792k(this.f24398b);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
