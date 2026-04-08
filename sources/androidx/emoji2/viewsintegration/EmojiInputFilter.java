package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
final class EmojiInputFilter implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f24387a;

    /* JADX INFO: renamed from: b */
    public EmojiCompat.InitCallback f24388b;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @RestrictTo
    public static class InitCallbackImpl extends EmojiCompat.InitCallback implements Runnable {

        /* JADX INFO: renamed from: a */
        public final WeakReference f24389a;

        /* JADX INFO: renamed from: b */
        public final WeakReference f24390b;

        public InitCallbackImpl(TextView textView, EmojiInputFilter emojiInputFilter) {
            this.f24389a = new WeakReference(textView);
            this.f24390b = new WeakReference(emojiInputFilter);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        /* JADX INFO: renamed from: b */
        public final void mo696b() {
            Handler handler;
            TextView textView = (TextView) this.f24389a.get();
            if (textView == null || (handler = textView.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.f24389a.get();
            InputFilter inputFilter = (InputFilter) this.f24390b.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        EmojiCompat emojiCompatM8782a = EmojiCompat.m8782a();
                        if (text == null) {
                            length = 0;
                        } else {
                            emojiCompatM8782a.getClass();
                            length = text.length();
                        }
                        CharSequence charSequenceM8791j = emojiCompatM8782a.m8791j(text, 0, length, 0);
                        if (text == charSequenceM8791j) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(charSequenceM8791j);
                        int selectionEnd = Selection.getSelectionEnd(charSequenceM8791j);
                        textView.setText(charSequenceM8791j);
                        if (charSequenceM8791j instanceof Spannable) {
                            Spannable spannable = (Spannable) charSequenceM8791j;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public EmojiInputFilter(TextView textView) {
        this.f24387a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f24387a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM8788d = EmojiCompat.m8782a().m8788d();
        if (iM8788d != 0) {
            if (iM8788d == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return EmojiCompat.m8782a().m8791j(charSequence, 0, charSequence.length(), 0);
            }
            if (iM8788d != 3) {
                return charSequence;
            }
        }
        EmojiCompat emojiCompatM8782a = EmojiCompat.m8782a();
        if (this.f24388b == null) {
            this.f24388b = new InitCallbackImpl(textView, this);
        }
        emojiCompatM8782a.m8792k(this.f24388b);
        return charSequence;
    }
}
