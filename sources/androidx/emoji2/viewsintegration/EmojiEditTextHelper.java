package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class EmojiEditTextHelper {

    /* JADX INFO: renamed from: a */
    public final HelperInternal19 f24379a;

    /* JADX INFO: compiled from: Proguard */
    public static class HelperInternal {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class HelperInternal19 extends HelperInternal {

        /* JADX INFO: renamed from: a */
        public final EditText f24380a;

        /* JADX INFO: renamed from: b */
        public final EmojiTextWatcher f24381b;

        public HelperInternal19(EditText editText) {
            this.f24380a = editText;
            EmojiTextWatcher emojiTextWatcher = new EmojiTextWatcher(editText);
            this.f24381b = emojiTextWatcher;
            editText.addTextChangedListener(emojiTextWatcher);
            if (EmojiEditableFactory.f24383b == null) {
                synchronized (EmojiEditableFactory.f24382a) {
                    try {
                        if (EmojiEditableFactory.f24383b == null) {
                            EmojiEditableFactory emojiEditableFactory = new EmojiEditableFactory();
                            try {
                                EmojiEditableFactory.f24384c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, EmojiEditableFactory.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            EmojiEditableFactory.f24383b = emojiEditableFactory;
                        }
                    } finally {
                    }
                }
            }
            editText.setEditableFactory(EmojiEditableFactory.f24383b);
        }
    }

    public EmojiEditTextHelper(EditText editText) {
        this.f24379a = new HelperInternal19(editText);
    }

    /* JADX INFO: renamed from: a */
    public final KeyListener m8832a(KeyListener keyListener) {
        this.f24379a.getClass();
        if (keyListener instanceof EmojiKeyListener) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new EmojiKeyListener(keyListener);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8833b() {
        return this.f24379a.f24381b.f24399c;
    }

    /* JADX INFO: renamed from: c */
    public final InputConnection m8834c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        HelperInternal19 helperInternal19 = this.f24379a;
        helperInternal19.getClass();
        return inputConnection instanceof EmojiInputConnection ? inputConnection : new EmojiInputConnection(helperInternal19.f24380a, inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: d */
    public final void m8835d(boolean z2) throws Throwable {
        EmojiTextWatcher emojiTextWatcher = this.f24379a.f24381b;
        if (emojiTextWatcher.f24399c != z2) {
            if (emojiTextWatcher.f24398b != null) {
                EmojiCompat emojiCompatM8782a = EmojiCompat.m8782a();
                EmojiCompat.InitCallback initCallback = emojiTextWatcher.f24398b;
                emojiCompatM8782a.getClass();
                Preconditions.m7698e(initCallback, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = emojiCompatM8782a.f24280a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    emojiCompatM8782a.f24281b.remove(initCallback);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            emojiTextWatcher.f24399c = z2;
            if (z2) {
                EmojiTextWatcher.m8846a(emojiTextWatcher.f24397a, EmojiCompat.m8782a().m8788d());
            }
        }
    }
}
